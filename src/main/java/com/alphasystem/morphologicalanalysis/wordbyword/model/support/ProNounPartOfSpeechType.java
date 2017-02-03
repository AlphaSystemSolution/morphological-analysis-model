package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum ProNounPartOfSpeechType implements PartOfSpeechType {

    PRONOUN("Pronoun", "#8C001A", getWord(DDAD, MEEM, YA, RA));

    private final String code;
    private final String colorCode;
    private final ArabicWord label;

    ProNounPartOfSpeechType(String code, String colorCode, ArabicWord label) {
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
