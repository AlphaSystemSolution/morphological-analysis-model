package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicSupport;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;

import static com.alphasystem.morphologicalanalysis.morphology.util.TriLiteralTemplateHelper.createRootWord;

/**
 * @author sali
 */
public enum BrokenPlural implements ArabicLetters, ArabicSupport {

    BROKEN_PLURAL_V1(createRootWord(1, 2, 4, null, new ArabicWord(ALIF_HAMZA_ABOVE_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN))),

    BROKEN_PLURAL_V2(createRootWord(0, 1, 3, null, new ArabicWord(FA_WITH_KASRA, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN))),

    BROKEN_PLURAL_V3(createRootWord(0, 1, 3, null, new ArabicWord(FA_WITH_DAMMA, AIN_WITH_DAMMA, WAW_WITH_SUKUN, LAM_WITH_DAMMATAN))),

    BROKEN_PLURAL_V4(createRootWord(0, 1, 2, null, new ArabicWord(FA_WITH_DAMMA, AIN_WITH_DAMMA, LAM_WITH_DAMMATAN))),

    BROKEN_PLURAL_V5(createRootWord(0, 1, 3, null, new ArabicWord(FA_WITH_DAMMA, AIN_WITH_SHADDA_AND_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN))),

    BROKEN_PLURAL_V6(createRootWord(0, 1, 2, null, new ArabicWord(FA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN))),

    BROKEN_PLURAL_V7(createRootWord(1, 2, 3, null, new ArabicWord(ALIF_HAMZA_ABOVE_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN))),

    BROKEN_PLURAL_V8(createRootWord(0, 1, 2, null, new ArabicWord(FA_WITH_DAMMA, AIN_WITH_FATHA, LAM_WITH_FATHA, LETTER_ALIF, HAMZA_WITH_DAMMA))),

    BROKEN_PLURAL_V9(createRootWord(1, 2, 3, null, new ArabicWord(ALIF_HAMZA_ABOVE_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA,
            LAM_WITH_FATHA, LETTER_ALIF, HAMZA_WITH_DAMMA))),

    BROKEN_PLURAL_V10(createRootWord(0, 3, 4, null, new ArabicWord(FA_WITH_FATHA, WAW_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMA))),

    BROKEN_PLURAL_V11(createRootWord(0, 1, 4, null, new ArabicWord(FA_WITH_FATHA, AIN_WITH_FATHA, LETTER_ALIF, YA_HAMZA_ABOVE_WITH_KASRA, LAM_WITH_DAMMA))),

    BROKEN_PLURAL_V12(createRootWord(1, 3, 4, null, new ArabicWord(MEEM_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMA))),

    BROKEN_PLURAL_V13(createRootWord(0, 1, 2, null, new ArabicWord(FA_WITH_FATHA, AIN_WITH_SUKUN, LAM_WITH_ALIF_KHAN_JAREEYA, LETTER_ALIF_MAKSURA)));

    private final RootWord rootWord;

    BrokenPlural(RootWord rootWord) {
        this.rootWord = rootWord;
    }

    public RootWord getRootWord() {
        return rootWord;
    }

    @Override
    public ArabicWord getLabel() {
        return getRootWord().getRootWord();
    }
}
