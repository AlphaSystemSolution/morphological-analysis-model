package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum AlternateStatus implements ArabicSupportEnum {

    NOMINATIVE("Nominative", getWord(RA, FA, AIN)),

    ACCUSATIVE("Accusative", getWord(NOON, SAD, BA)),

    GENETIVE("Genitive", getWord(JEEM, RA));;

    private final String code;

    private final ArabicWord label;

    AlternateStatus(String code, ArabicWord label) {
        this.code = code;
        this.label = label;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public ArabicWord toLabel() {
        return label;
    }

    @Override
    public String getName() {
        return name();
    }
}
