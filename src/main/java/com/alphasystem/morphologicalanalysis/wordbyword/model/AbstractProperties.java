/**
 *
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType;
import com.alphasystem.persistence.model.AbstractDocument;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.Transient;

import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType.MASCULINE;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType.SINGULAR;

/**
 * @author sali
 */
@QueryEntity
public abstract class AbstractProperties extends AbstractDocument {

    private static final long serialVersionUID = 8386413187448630570L;
    protected NumberType number;
    protected GenderType gender;

    protected AbstractProperties() {
        super();
        setNumber(null);
        setGender(null);
    }

    /**
     * @param src
     * @throws NullPointerException
     */
    protected AbstractProperties(AbstractProperties src) throws NullPointerException {
        if (src == null) {
            throw new NullPointerException("Source is null.");
        }
        setNumber(src.getNumber());
        setGender(src.getGender());
    }

    public static AbstractProperties copy(AbstractProperties src) {
        if (src == null) {
            return null;
        }
        AbstractProperties target = null;
        if (isNoun(src)) {
            target = new NounProperties((NounProperties) src);
        } else if (isPronoun(src)) {
            target = new ProNounProperties((ProNounProperties) src);
        } else if (isVerb(src)) {
            target = new VerbProperties((VerbProperties) src);
        } else if (isParticle(src)) {
            target = new ParticleProperties((ParticleProperties) src);
        }
        target.initDisplayName();
        return target;
    }

    public static boolean isNoun(AbstractProperties properties) {
        return properties != null
                && NounProperties.class.isAssignableFrom(properties.getClass());
    }

    public static boolean isParticle(AbstractProperties properties) {
        return properties == null
                || ParticleProperties.class.isAssignableFrom(properties
                .getClass());
    }

    public static boolean isPronoun(AbstractProperties properties) {
        return properties != null
                && ProNounProperties.class.isAssignableFrom(properties
                .getClass());
    }

    public static boolean isVerb(AbstractProperties properties) {
        return properties != null
                && VerbProperties.class.isAssignableFrom(properties.getClass());
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender == null ? MASCULINE : gender;
    }

    @Transient
    public ArabicWord getLabel() {
        return null;
    }

    public NumberType getNumber() {
        return number;
    }

    public void setNumber(NumberType number) {
        this.number = number == null ? SINGULAR : number;
    }

    public AbstractProperties withGenderType(GenderType gender) {
        setGender(gender);
        return this;
    }

    public AbstractProperties withNumberType(NumberType number) {
        setNumber(number);
        return this;
    }
}
