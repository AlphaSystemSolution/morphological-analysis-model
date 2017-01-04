package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetter.getArabicLetter;
import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;
import static com.alphasystem.arabic.model.DiacriticType.FATHA;

/**
 * @author sali
 */
public enum KanaFamily implements IncompleteVerbType {

    MEMBER1(getWord(getArabicLetter(KAF, FATHA), getArabicLetter(ALIF), getArabicLetter(NOON, FATHA)));

    private final ArabicWord label;

    KanaFamily(ArabicWord label) {
        this.label = label;
    }

    @Override
    public String getCode() {
        return null;
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
