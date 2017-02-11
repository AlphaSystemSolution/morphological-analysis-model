package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;

/**
 * @author sali
 */
public enum Flexibility implements ArabicSupportEnum {

    FULLY_FLEXIBLE("Fully Flexible", ArabicWord.getWord(MEEM, AIN, RA, BA)),
    PARTLY_FLEXIBLE("Partially Flexible", ArabicWord.getWord(MEEM, BA, NOON, YA)),
    NON_FLEXIBLE("Non Flexible", ArabicWord.getWord(GHAIN, YA, RA, SPACE, MEEM, NOON, SAD, RA, FA));

    private final String code;
    private final ArabicWord label;

    Flexibility(String code, ArabicWord label) {
        this.code = code;
        this.label = label;
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
