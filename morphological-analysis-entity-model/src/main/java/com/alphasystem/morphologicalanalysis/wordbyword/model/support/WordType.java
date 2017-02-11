package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_HAMZA_BELOW;
import static com.alphasystem.arabic.model.ArabicLetterType.DDAD;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.HHA;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.RA;
import static com.alphasystem.arabic.model.ArabicLetterType.SEEN;
import static com.alphasystem.arabic.model.ArabicLetterType.YA;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum WordType implements ArabicSupportEnum {

    NOUN("Noun", getWord(ALIF_HAMZA_BELOW, SEEN, MEEM), NounPartOfSpeechType.values()),
    PRO_NOUN("Pronoun", getWord(DDAD, MEEM, YA, RA), ProNounPartOfSpeechType.values()),
    VERB("Verb", getWord(FA, AIN, LAM), VerbPartOfSpeechType.values()),
    PARTICLE("Particle", getWord(HHA, RA, FA), ParticlePartOfSpeechType.values());
    private final PartOfSpeechType[] partOfSpeeches;

    private final String code;
    private final ArabicWord label;

    WordType(String code, ArabicWord label, PartOfSpeechType... partOfSpeeches) {
        this.code = code;
        this.label = label;
        this.partOfSpeeches = partOfSpeeches;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public ArabicWord toLabel() {
        return label;
    }

    public PartOfSpeechType[] getPartOfSpeeches() {
        return partOfSpeeches;
    }
}
