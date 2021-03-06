package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType;

import static com.alphasystem.morphologicalanalysis.morphology.model.RootWord.createRootWord;
import static com.alphasystem.morphologicalanalysis.morphology.model.support.NounSupport.Flexibility.FULLY_FLEXIBLE;
import static com.alphasystem.morphologicalanalysis.morphology.model.support.NounSupport.Flexibility.PARTLY_FLEXIBLE;
import static java.lang.String.format;

/**
 * @author sali
 */
public enum Noun implements ArabicLetters, NounSupport {

    FORM_I_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(0, 2, 3, -1, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_I_FEMININE_ACTIVE_PARTICIPLE(createRootWord(0, 2, 3, -1, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_I_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 4, -1, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_DAMMA, WAW_WITH_SUKUN,
            LAM_WITH_DAMMATAN)),

    FORM_I_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 4, -1, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_DAMMA, WAW_WITH_SUKUN,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_I_CATEGORY_U_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(0, 1, 3, -1, FA_WITH_FATHA, AIN_WITH_KASRA, YA_WITH_SUKUN,
            LAM_WITH_DAMMATAN)),

    FORM_I_CATEGORY_U_FEMININE_ACTIVE_PARTICIPLE(createRootWord(0, 1, 3, -1, FA_WITH_FATHA, AIN_WITH_KASRA, YA_WITH_SUKUN, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_II_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_II_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_II_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMATAN)),

    FORM_II_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_III_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 3, 4, -1, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_III_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 3, 4, -1, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_III_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 3, 4, -1, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_DAMMATAN)),

    FORM_III_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 3, 4, -1, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_IV_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_IV_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_IV_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    FORM_IV_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_V_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(2, 3, 4, -1, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_V_FEMININE_ACTIVE_PARTICIPLE(createRootWord(2, 3, 4, -1, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_V_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(2, 3, 4, -1, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMATAN)),

    FORM_V_FEMININE_PASSIVE_PARTICIPLE(createRootWord(2, 3, 4, -1, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VI_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(2, 4, 5, -1, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_VI_FEMININE_ACTIVE_PARTICIPLE(createRootWord(2, 4, 5, -1, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_KASRA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VI_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(2, 4, 5, -1, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    FORM_VI_FEMININE_PASSIVE_PARTICIPLE(createRootWord(2, 4, 5, -1, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_FATHA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VII_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(2, 3, 4, -1, MEEM_WITH_DAMMA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_VII_FEMININE_ACTIVE_PARTICIPLE(createRootWord(2, 3, 4, -1, MEEM_WITH_DAMMA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VII_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(2, 3, 4, -1, MEEM_WITH_DAMMA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_DAMMATAN)),

    FORM_VII_FEMININE_PASSIVE_PARTICIPLE(createRootWord(2, 3, 4, -1, MEEM_WITH_DAMMA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VIII_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 3, 4, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_KASRA,
            LAM_WITH_DAMMATAN)),

    FORM_VIII_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 3, 4, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_VIII_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(1, 3, 4, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_DAMMATAN)),

    FORM_VIII_FEMININE_PASSIVE_PARTICIPLE(createRootWord(1, 3, 4, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_IX_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_IX_FEMININE_ACTIVE_PARTICIPLE(createRootWord(1, 2, 3, -1, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_X_MASCULINE_ACTIVE_PARTICIPLE(createRootWord(3, 4, 5, -1, MEEM_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    FORM_X_FEMININE_ACTIVE_PARTICIPLE(createRootWord(3, 4, 5, -1, MEEM_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_KASRA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    FORM_X_MASCULINE_PASSIVE_PARTICIPLE(createRootWord(3, 4, 5, -1, MEEM_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    FORM_X_FEMININE_PASSIVE_PARTICIPLE(createRootWord(3, 4, 5, -1, MEEM_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_FATHA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    NOUN_OF_PLACE_AND_TIME_V1(createRootWord(1, 2, 3, -1, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMATAN), false, PARTLY_FLEXIBLE),

    NOUN_OF_PLACE_AND_TIME_V2(createRootWord(1, 2, 3, -1, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMATAN), false, PARTLY_FLEXIBLE),

    NOUN_OF_PLACE_AND_TIME_V3(createRootWord(1, 2, 3, -1, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true);

    private final RootWord rootWord;
    private final boolean feminine;
    private final Flexibility flexibility;

    Noun(final RootWord rootWord) {
        this(rootWord, false, FULLY_FLEXIBLE);
    }

    Noun(final RootWord rootWord, final boolean feminine) {
        this(rootWord, feminine, FULLY_FLEXIBLE);
    }

    Noun(final RootWord rootWord, final boolean feminine, final Flexibility flexibility) {
        this.rootWord = rootWord;
        this.feminine = feminine;
        this.flexibility = flexibility;
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
    public ArabicWord toLabel() {
        return getRootWord().getRootWord();
    }

    @Override
    public String getSingularRootName() {
        return getRootName(NumberType.SINGULAR);
    }

    @Override
    public String getDualRootName() {
        return getRootName(NumberType.DUAL);
    }

    @Override
    public String getPluralRootName() {
        return getRootName(NumberType.PLURAL);
    }

    private String getRootName(NumberType numberType) {
        return format("%s_%s", name(), numberType.name());
    }

}
