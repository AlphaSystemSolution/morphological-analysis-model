package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum VerbPartOfSpeechType implements PartOfSpeechType {

    VERB("Verb", "#4AA02C", getWord(FA, AIN, LAM));

    private final String code;
    private final String colorCode;
    private final ArabicWord label;

    VerbPartOfSpeechType(String code, String colorCode, ArabicWord label) {
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
