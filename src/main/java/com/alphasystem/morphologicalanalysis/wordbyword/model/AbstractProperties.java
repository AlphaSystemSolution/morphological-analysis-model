/**
 *
 */
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

import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType.MASCULINE;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType.SINGULAR;

/**
 * @author sali
 */
public abstract class AbstractProperties extends AbstractSimpleDocument {

    private static final long serialVersionUID = 8386413187448630570L;

    protected PartOfSpeechType partOfSpeech;
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
    AbstractProperties(AbstractProperties src) throws NullPointerException {
        if (src == null) {
            throw new NullPointerException("Source is null.");
        }
        setId(null);
        setPartOfSpeech(src.getPartOfSpeech());
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
        final PartOfSpeechType partOfSpeech = src.getPartOfSpeech();
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

    public PartOfSpeechType getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(PartOfSpeechType partOfSpeech) {
        this.partOfSpeech = (partOfSpeech == null) ? NounPartOfSpeechType.NOUN : partOfSpeech;
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

}
