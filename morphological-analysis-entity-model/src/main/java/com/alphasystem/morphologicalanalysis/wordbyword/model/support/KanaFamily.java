package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetter.getArabicLetter;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicLetterType.BA;
import static com.alphasystem.arabic.model.ArabicLetterType.HHA;
import static com.alphasystem.arabic.model.ArabicLetterType.KAF;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.SAD;
import static com.alphasystem.arabic.model.ArabicWord.getWord;
import static com.alphasystem.arabic.model.DiacriticType.FATHA;
import static com.alphasystem.arabic.model.DiacriticType.SUKUN;

/**
 * @author sali
 */
public enum KanaFamily implements IncompleteVerbType {

    MEMBER1(getWord(getArabicLetter(KAF, FATHA), getArabicLetter(ALIF), getArabicLetter(NOON, FATHA))),
    MEMBER2(getWord(getArabicLetter(ALIF_HAMZA_ABOVE, FATHA), getArabicLetter(SAD, SUKUN), getArabicLetter(BA, FATHA),
            getArabicLetter(HHA, FATHA)));

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
