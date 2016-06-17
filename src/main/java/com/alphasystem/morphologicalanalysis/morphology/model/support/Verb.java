package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicLetter;
import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;

/**
 * @author sali
 */
public enum Verb implements ArabicLetters, RootWordSupport {

    FORM_I_PAST_TENSE_V1(createRootWord(0, 1, 2, -1, FA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_I_PAST_TENSE_V2(createRootWord(0, 1, 2, -1, FA_WITH_FATHA, AIN_WITH_DAMMA, LAM_WITH_FATHA)),

    FORM_I_PAST_TENSE_V3(createRootWord(0, 1, 2, -1, FA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_FATHA)),

    FORM_I_PRESENT_TENSE_V1(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_DAMMA, LAM_WITH_DAMMA)),

    FORM_I_PRESENT_TENSE_V2(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_I_PRESENT_TENSE_V3(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_I_PAST_PASSIVE_TENSE(createRootWord(0, 1, 2, -1, FA_WITH_DAMMA, AIN_WITH_KASRA, LAM_WITH_FATHA)),

    FORM_I_PRESENT_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_II_PAST_TENSE(createRootWord(0, 1, 2, -1, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA, LAM_WITH_FATHA)),

    FORM_II_PRESENT_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA, LAM_WITH_DAMMA)),

    FORM_II_PAST_PASSIVE_TENSE(createRootWord(0, 1, 2, -1, FA_WITH_DAMMA, AIN_WITH_SHADDA_AND_KASRA, LAM_WITH_FATHA)),

    FORM_II_PRESENT_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMA)),

    FORM_III_PAST_TENSE(createRootWord(0, 2, 3, -1, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_III_PRESENT_TENSE(createRootWord(1, 3, 4, -1, YA_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_III_PAST_PASSIVE_TENSE(createRootWord(0, 2, 3, -1, FA_WITH_DAMMA, WAW_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA)),

    FORM_III_PRESENT_PASSIVE_TENSE(createRootWord(1, 3, 4, 1, YA_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_DAMMA)),

    FORM_IV_PAST_TENSE(createRootWord(1, 2, 3, -1, ALIF_HAMZA_ABOVE_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_IV_PRESENT_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_IV_PAST_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, ALIF_HAMZA_ABOVE_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA,
            LAM_WITH_FATHA)),

    FORM_IV_PRESENT_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_V_PAST_TENSE(createRootWord(1, 2, 3, -1, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA, LAM_WITH_FATHA)),

    FORM_V_PRESENT_TENSE(createRootWord(2, 3, 4, -1, YA_WITH_FATHA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMA)),

    FORM_V_PAST_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, TA_WITH_DAMMA, FA_WITH_DAMMA, AIN_WITH_SHADDA_AND_KASRA, LAM_WITH_FATHA)),

    FORM_V_PRESENT_PASSIVE_TENSE(createRootWord(2, 3, 4, -1, YA_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMA)),

    FORM_VI_PAST_TENSE(createRootWord(1, 3, 4, -1, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_VI_PRESENT_TENSE(createRootWord(2, 4, 5, -1, YA_WITH_FATHA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_DAMMA)),

    FORM_VI_PAST_PASSIVE_TENSE(createRootWord(1, 3, 4, -1, TA_WITH_DAMMA, FA_WITH_DAMMA, WAW_WITH_SUKUN, AIN_WITH_KASRA,
            LAM_WITH_FATHA)),

    FORM_VI_PRESENT_PASSIVE_TENSE(createRootWord(2, 4, 5, -1, YA_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_VII_PAST_TENSE(createRootWord(2, 3, 4, -1, ALIF_HAMZA_BELOW_WITH_KASRA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_FATHA)),

    FORM_VII_PRESENT_TENSE(createRootWord(2, 3, 4, -1, YA_WITH_FATHA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_VIII_PAST_TENSE(createRootWord(1, 3, 4, -1, ALIF_HAMZA_BELOW_WITH_KASRA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_FATHA)),

    FORM_VIII_PRESENT_TENSE(createRootWord(1, 3, 4, -1, YA_WITH_FATHA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_VIII_PAST_PASSIVE_TENSE(createRootWord(1, 3, 4, -1, ALIF_HAMZA_ABOVE_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_DAMMA,
            AIN_WITH_KASRA, LAM_WITH_FATHA)),

    FORM_VIII_PRESENT_PASSIVE_TENSE(createRootWord(1, 3, 4, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_DAMMA)),

    FORM_IX_PAST_TENSE(createRootWord(1, 2, 3, -1, ALIF_HAMZA_BELOW_WITH_KASRA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_SHADDA_AND_FATHA)),

    FORM_IX_PRESENT_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_SHADDA_AND_DAMMA)),

    FORM_X_PAST_TENSE(createRootWord(3, 4, 5, -1, ALIF_HAMZA_BELOW_WITH_KASRA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_X_PRESENT_TENSE(createRootWord(3, 4, 5, -1, YA_WITH_FATHA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_X_PAST_PASSIVE_TENSE(createRootWord(3, 4, 5, -1, YA_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_X_PRESENT_PASSIVE_TENSE(createRootWord(3, 4, 5, -1, ALIF_HAMZA_ABOVE_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_DAMMA,
            FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA));

    private final RootWord rootWord;

    Verb(RootWord rootWord) {
        this.rootWord = rootWord;
    }

    private static RootWord createRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                          int fourthRadicalIndex, ArabicLetter... arabicLetters) {
        ArabicWord arabicWord = new ArabicWord(arabicLetters);
        return new RootWord().withSarfTermType(null).withFirstRadicalIndex(firstRadicalIndex)
                .withSecondRadicalIndex(secondRadicalIndex).withThirdRadicalIndex(thirdRadicalIndex)
                .withFourthRadicalIndex(fourthRadicalIndex).withBaseWord(arabicWord).withRootWord(arabicWord);
    }

    @Override
    public RootWord getRootWord() {
        return rootWord;
    }

    @Override
    public ArabicWord getLabel() {
        return getRootWord().getLabel();
    }
}
