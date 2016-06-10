package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicLetter;
import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;
import com.alphasystem.morphologicalanalysis.morphology.util.TriLiteralTemplateHelper;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType;

import static com.alphasystem.morphologicalanalysis.morphology.model.support.NounSupport.Flexibility.*;
import static java.lang.String.format;

/**
 * @author sali
 */
public enum BrokenPlural implements ArabicLetters, NounSupport {

    BROKEN_PLURAL_V1(createRootWord(1, 2, 4, ALIF_HAMZA_ABOVE_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN),
            FULLY_FLEXIBLE),

    BROKEN_PLURAL_V2(createRootWord(0, 1, 3, FA_WITH_KASRA, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN), FULLY_FLEXIBLE),

    BROKEN_PLURAL_V3(createRootWord(0, 1, 3, FA_WITH_DAMMA, AIN_WITH_DAMMA, WAW_WITH_SUKUN, LAM_WITH_DAMMATAN), FULLY_FLEXIBLE),

    BROKEN_PLURAL_V4(createRootWord(0, 1, 2, FA_WITH_DAMMA, AIN_WITH_DAMMA, LAM_WITH_DAMMATAN), FULLY_FLEXIBLE),

    BROKEN_PLURAL_V5(createRootWord(0, 1, 3, FA_WITH_DAMMA, AIN_WITH_SHADDA_AND_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN),
            FULLY_FLEXIBLE),

    BROKEN_PLURAL_V6(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true,
            FULLY_FLEXIBLE),

    BROKEN_PLURAL_V7(createRootWord(1, 2, 3, ALIF_HAMZA_ABOVE_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true, FULLY_FLEXIBLE),

    BROKEN_PLURAL_V8(createRootWord(0, 1, 2, FA_WITH_DAMMA, AIN_WITH_FATHA, LAM_WITH_FATHA, LETTER_ALIF, HAMZA_WITH_DAMMA),
            PARTLY_FLEXIBLE),

    BROKEN_PLURAL_V9(createRootWord(1, 2, 3, ALIF_HAMZA_ABOVE_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA,
            LETTER_ALIF, HAMZA_WITH_DAMMA), PARTLY_FLEXIBLE),

    BROKEN_PLURAL_V10(createRootWord(0, 3, 4, FA_WITH_FATHA, WAW_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMA)
            , PARTLY_FLEXIBLE),

    BROKEN_PLURAL_V11(createRootWord(0, 1, 4, FA_WITH_FATHA, AIN_WITH_FATHA, LETTER_ALIF, YA_HAMZA_ABOVE_WITH_KASRA,
            LAM_WITH_DAMMA), PARTLY_FLEXIBLE),

    BROKEN_PLURAL_V12(createRootWord(1, 3, 4, MEEM_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMA),
            PARTLY_FLEXIBLE),

    BROKEN_PLURAL_V13(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_SUKUN, LAM_WITH_ALIF_KHAN_JAREEYA, LETTER_ALIF_MAKSURA),
            NON_FLEXIBLE);

    private final RootWord rootWord;
    private final boolean feminine;
    private final Flexibility flexibility;

    BrokenPlural(final RootWord rootWord) {
        this(rootWord, false, FULLY_FLEXIBLE);
    }

    BrokenPlural(final RootWord rootWord, final boolean feminine) {
        this(rootWord, feminine, FULLY_FLEXIBLE);
    }

    BrokenPlural(final RootWord rootWord, final Flexibility flexibility) {
        this(rootWord, false, flexibility);
    }

    BrokenPlural(final RootWord rootWord, final boolean feminine, final Flexibility flexibility) {
        this.rootWord = rootWord;
        this.feminine = feminine;
        this.flexibility = flexibility;
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

    @Override
    public String getSingularRootName() {
        return null;
    }

    @Override
    public String getDualRootName() {
        return null;
    }

    @Override
    public String getPluralRootName() {
        return getRootName(NumberType.PLURAL);
    }

    private String getRootName(NumberType numberType) {
        return format("%s_%s", name(), numberType.name());
    }
}
