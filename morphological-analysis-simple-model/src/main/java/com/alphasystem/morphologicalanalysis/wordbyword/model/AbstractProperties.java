package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NounPartOfSpeechType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.PartOfSpeechType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.ParticlePartOfSpeechType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.ProNounPartOfSpeechType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.VerbPartOfSpeechType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.WordType;
import com.alphasystem.persistence.model.AbstractSimpleDocument;
import com.alphasystem.util.AppUtil;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType.MASCULINE;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType.SINGULAR;

/**
 * @author sali
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public abstract class AbstractProperties<P extends Enum<P> & PartOfSpeechType> extends AbstractSimpleDocument {

    private static final long serialVersionUID = 8386413187448630570L;

    protected P partOfSpeech;
    protected NumberType number;
    protected GenderType gender;

    AbstractProperties() {
        super();
        setPartOfSpeech(null);
        setNumber(null);
        setGender(null);
    }

    /**
     * @param src
     * @throws NullPointerException
     */
    @SuppressWarnings("unchecked")
    AbstractProperties(AbstractProperties src) throws NullPointerException {
        if (src == null) {
            throw new NullPointerException("Source is null.");
        }
        setId(null);
        setPartOfSpeech((P) src.getPartOfSpeech());
        setNumber(src.getNumber());
        setGender(src.getGender());
    }

    public static AbstractProperties create(WordType wordType) {
        AbstractProperties properties = null;
        if (WordType.PARTICLE.equals(wordType)) {
            properties = new ParticleProperties();
        } else if (WordType.VERB.equals(wordType)) {
            properties = new VerbProperties();
        } else if (WordType.PRO_NOUN.equals(wordType)) {
            properties = new ProNounProperties();
        } else {
            properties = new NounProperties();
        }
        return properties;
    }

    public static AbstractProperties copy(AbstractProperties src) {
        if (src == null) {
            return null;
        }
        AbstractProperties target = null;
        final Enum<?> partOfSpeech = src.getPartOfSpeech();
        if (AppUtil.isInstanceOf(NounPartOfSpeechType.class, partOfSpeech)) {
            target = new NounProperties((NounProperties) src);
        } else if (AppUtil.isInstanceOf(ProNounPartOfSpeechType.class, partOfSpeech)) {
            target = new ProNounProperties((ProNounProperties) src);
        } else if (AppUtil.isInstanceOf(VerbPartOfSpeechType.class, partOfSpeech)) {
            target = new VerbProperties((VerbProperties) src);
        } else if (AppUtil.isInstanceOf(ParticlePartOfSpeechType.class, partOfSpeech)) {
            target = new ParticleProperties((ParticleProperties) src);
        }
        return target;
    }

    public P getPartOfSpeech() {
        return partOfSpeech;
    }

    protected abstract P getDefaultPartOfSpeech();

    public void setPartOfSpeech(P partOfSpeech) {
        this.partOfSpeech = (partOfSpeech == null) ? getDefaultPartOfSpeech() : partOfSpeech;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender == null ? MASCULINE : gender;
    }

    public ArabicWord label() {
        return null;
    }

    public NumberType getNumber() {
        return number;
    }

    public void setNumber(NumberType number) {
        this.number = number == null ? SINGULAR : number;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = super.equals(obj);
        if (AppUtil.isInstanceOf(AbstractProperties.class, obj)) {
            AbstractProperties o = (AbstractProperties) obj;
            result = getPartOfSpeech().equals(o.getPartOfSpeech());
        }
        return result;
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public int compareTo(AbstractSimpleDocument obj) {
        int result = super.compareTo(obj);
        if (AppUtil.isInstanceOf(AbstractProperties.class, obj)) {
            AbstractProperties o = (AbstractProperties) obj;
            result = getPartOfSpeech().compareTo((P) o.getPartOfSpeech());
        }
        return result;
    }
}
