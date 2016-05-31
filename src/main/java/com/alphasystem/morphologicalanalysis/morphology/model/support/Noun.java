package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicLetter;
import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;
import com.alphasystem.morphologicalanalysis.morphology.util.TriLiteralTemplateHelper;

import static com.alphasystem.morphologicalanalysis.morphology.model.support.NounSupport.Flexibility.FULLY_FLEXIBLE;

/**
 * @author sali
 */
public enum Noun implements ArabicLetters, NounSupport {

    FORM_I_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(0, 2, 3, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_I_FEMININE_ACTIVE_PARTICIPLE(createRootWord(0, 2, 3, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_I_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 4, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_DAMMA, WAW_WITH_SUKUN,
            LAM_WITH_DAMMATAN)),

    FORM_I_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 4, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_DAMMA, WAW_WITH_SUKUN,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_I_CATEGORY_U_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(0, 1, 3, FA_WITH_FATHA, AIN_WITH_KASRA, YA_WITH_SUKUN,
            LAM_WITH_DAMMATAN)),

    FORM_I_CATEGORY_U_FEMININE_ACTIVE_PARTICIPLE(createRootWord(0, 1, 3, FA_WITH_FATHA, AIN_WITH_KASRA, YA_WITH_SUKUN, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_II_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_II_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_II_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMATAN)),

    FORM_II_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_III_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_III_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_III_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_DAMMATAN)),

    FORM_III_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_IV_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_IV_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_IV_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    FORM_IV_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_V_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(2, 3, 4, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_V_FEMININE_ACTIVE_PARTICIPLE(createRootWord(2, 3, 4, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_V_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(2, 3, 4, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMATAN)),

    FORM_V_FEMININE_PASSIVE_PARTICIPLE(createRootWord(2, 3, 4, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VI_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(2, 4, 5, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_VI_FEMININE_ACTIVE_PARTICIPLE(createRootWord(2, 4, 5, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_KASRA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VI_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(2, 4, 5, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    FORM_VI_FEMININE_PASSIVE_PARTICIPLE(createRootWord(2, 4, 5, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_FATHA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VII_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(2, 3, 4, MEEM_WITH_DAMMA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_VII_FEMININE_ACTIVE_PARTICIPLE(createRootWord(2, 3, 4, MEEM_WITH_DAMMA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VIII_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_VIII_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VIII_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_DAMMATAN)),

    FORM_VIII_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_IX_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_IX_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_X_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(3, 4, 5, MEEM_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_X_FEMININE_ACTIVE_PARTICIPLE(createRootWord(3, 4, 5, MEEM_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_KASRA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_X_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(3, 4, 5, MEEM_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    FORM_X_FEMININE_PASSIVE_PARTICIPLE(createRootWord(3, 4, 5, MEEM_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_FATHA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true);

    private final RootWord rootWord;
    private final boolean feminine;
    private final Flexibility flexibility;

    Noun(final RootWord rootWord) {
        this(rootWord, false, FULLY_FLEXIBLE);
    }

    Noun(final RootWord rootWord, final boolean feminine) {
        this(rootWord, feminine, FULLY_FLEXIBLE);
    }

    Noun(final RootWord rootWord, final Flexibility flexibility) {
        this(rootWord, false, flexibility);
    }

    Noun(final RootWord rootWord, final boolean feminine, final Flexibility flexibility) {
        this.rootWord = rootWord;
        this.feminine = feminine;
        this.flexibility = flexibility;
    }

    public static Noun getActiveParticiple(NamedTemplate template, boolean feminine) {
        Noun noun = null;
        switch (template) {
            case FORM_I_CATEGORY_A_GROUP_U_TEMPLATE:
            case FORM_I_CATEGORY_A_GROUP_I_TEMPLATE:
            case FORM_I_CATEGORY_A_GROUP_A_TEMPLATE:
            case FORM_I_CATEGORY_I_GROUP_A_TEMPLATE:
            case FORM_I_CATEGORY_I_GROUP_I_TEMPLATE:
                noun = feminine ? FORM_I_FEMININE_ACTIVE_PARTICIPLE : FORM_I_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_I_CATEGORY_U_TEMPLATE:
                noun = feminine ? FORM_I_CATEGORY_U_FEMININE_ACTIVE_PARTICIPLE : FORM_I_CATEGORY_U_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_II_TEMPLATE:
                noun = feminine ? FORM_II_FEMININE_ACTIVE_PARTICIPLE : FORM_II_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_III_TEMPLATE:
                noun = feminine ? FORM_III_FEMININE_ACTIVE_PARTICIPLE : FORM_III_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_IV_TEMPLATE:
                noun = feminine ? FORM_IV_FEMININE_ACTIVE_PARTICIPLE : FORM_IV_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_V_TEMPLATE:
                noun = feminine ? FORM_V_FEMININE_ACTIVE_PARTICIPLE : FORM_V_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_VI_TEMPLATE:
                noun = feminine ? FORM_VI_FEMININE_ACTIVE_PARTICIPLE : FORM_VI_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_VII_TEMPLATE:
                noun = feminine ? FORM_VII_FEMININE_ACTIVE_PARTICIPLE : FORM_VII_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_VIII_TEMPLATE:
                noun = feminine ? FORM_VIII_FEMININE_ACTIVE_PARTICIPLE : FORM_VIII_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_IX_TEMPLATE:
                noun = feminine ? FORM_IX_FEMININE_ACTIVE_PARTICIPLE : FORM_IX_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_X_TEMPLATE:
                noun = feminine ? FORM_X_FEMININE_ACTIVE_PARTICIPLE : FORM_X_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_XI_TEMPLATE:
                // noun = feminine ? FORM_XI_FEMININE_ACTIVE_PARTICIPLE : FORM_XI_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_XII_TEMPLATE:
                //noun = feminine ? FORM_XII_FEMININE_ACTIVE_PARTICIPLE : FORM_XII_MASCULINE_ACTIVE_PARTICIPLE;
                break;
            case FORM_XIII_TEMPLATE:
                // noun = feminine ? FORM_XIII_FEMININE_ACTIVE_PARTICIPLE : FORM_XIII_MASCULINE_ACTIVE_PARTICIPLE;
                break;
        }
        return noun;
    }

    public static Noun getPassiveParticiple(NamedTemplate template, boolean feminine) {
        Noun noun = null;
        switch (template) {
            case FORM_I_CATEGORY_A_GROUP_U_TEMPLATE:
            case FORM_I_CATEGORY_A_GROUP_I_TEMPLATE:
            case FORM_I_CATEGORY_A_GROUP_A_TEMPLATE:
            case FORM_I_CATEGORY_I_GROUP_A_TEMPLATE:
            case FORM_I_CATEGORY_I_GROUP_I_TEMPLATE:
                noun = feminine ? FORM_I_FEMININE_PASSIVE_PARTICIPLE : FORM_I_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_I_CATEGORY_U_TEMPLATE:
                // no passive
                break;
            case FORM_II_TEMPLATE:
                noun = feminine ? FORM_II_FEMININE_PASSIVE_PARTICIPLE : FORM_II_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_III_TEMPLATE:
                noun = feminine ? FORM_III_FEMININE_PASSIVE_PARTICIPLE : FORM_III_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_IV_TEMPLATE:
                noun = feminine ? FORM_IV_FEMININE_PASSIVE_PARTICIPLE : FORM_IV_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_V_TEMPLATE:
                noun = feminine ? FORM_V_FEMININE_PASSIVE_PARTICIPLE : FORM_V_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_VI_TEMPLATE:
                noun = feminine ? FORM_VI_FEMININE_PASSIVE_PARTICIPLE : FORM_VI_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_VII_TEMPLATE:
                // no passive
                break;
            case FORM_VIII_TEMPLATE:
                noun = feminine ? FORM_VIII_FEMININE_PASSIVE_PARTICIPLE : FORM_VIII_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_IX_TEMPLATE:
                // no passive
                break;
            case FORM_X_TEMPLATE:
                noun = feminine ? FORM_X_FEMININE_PASSIVE_PARTICIPLE : FORM_X_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_XI_TEMPLATE:
                // noun = feminine ? FORM_XI_FEMININE_PASSIVE_PARTICIPLE : FORM_XI_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_XII_TEMPLATE:
                //noun = feminine ? FORM_XII_FEMININE_PASSIVE_PARTICIPLE : FORM_XII_MASCULINE_PASSIVE_PARTICIPLE;
                break;
            case FORM_XIII_TEMPLATE:
                // noun = feminine ? FORM_XIII_FEMININE_PASSIVE_PARTICIPLE : FORM_XIII_MASCULINE_PASSIVE_PARTICIPLE;
                break;
        }
        return noun;
    }

    private static RootWord createRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                           ArabicLetter... arabicLetters) {
        return TriLiteralTemplateHelper.createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, null, arabicLetters);
    }

    @Override
    public RootWord getRootWord() {
        return rootWord;
    }

    @Override
    public boolean isFeminine() {
        return feminine;
    }

    @Override
    public Flexibility getFlexibility() {
        return flexibility;
    }

    @Override
    public ArabicWord getLabel() {
        return getRootWord().getRootWord();
    }
}
