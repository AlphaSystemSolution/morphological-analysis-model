package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;

import static com.alphasystem.morphologicalanalysis.morphology.util.TriLiteralTemplateHelper.createRootWord;

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

    FORM_I_PRESENT_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMA));

    private final RootWord rootWord;

    Verb(RootWord rootWord) {
        this.rootWord = rootWord;
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
