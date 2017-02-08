package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum NounPartOfSpeechType implements PartOfSpeechType {

    NOUN("Noun", "#000080", getWord(ALIF_HAMZA_BELOW, SEEN, MEEM)),
    PROPER_NOUN("Proper Noun", "#000080", getWord(ALIF_HAMZA_BELOW, SEEN, MEEM, SPACE, AIN, LAM, MEEM)),
    TIME_ADVERB("Time adverb", null, getWord(DTHA, RA, FA, SPACE, ZAIN, MEEM, ALIF, NOON)),
    LOCATION_ADVERB("Location adverb", null, getWord(DTHA, RA, FA, SPACE, MEEM, KAF, ALIF, NOON));

    private final String code;
    private final String colorCode;
    private final ArabicWord label;

    NounPartOfSpeechType(String code, String colorCode, ArabicWord label) {
        this.code = code;
        this.colorCode = colorCode;
        this.label = label;
    }

    @Override
    public String getColorCode() {
        return colorCode;
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
}
