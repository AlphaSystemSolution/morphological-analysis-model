/**
 *
 */
package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicLetter;
import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;

/**
 * @author sali
 */
public enum VerbalNoun implements ArabicLetters, NounSupport {

    VERBAL_NOUN_V1(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_SUKUN, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V2(createRootWord(0, 1, 2, FA_WITH_DAMMA, AIN_WITH_DAMMA, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V3(createRootWord(0, 1, 2, FA_WITH_DAMMA, AIN_WITH_SUKUN, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V4(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V5(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V6(createRootWord(0, 1, 2, FA_WITH_DAMMA, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V7(createRootWord(0, 1, 2, FA_WITH_KASRA, AIN_WITH_SUKUN, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V8(createRootWord(0, 1, 2, FA_WITH_KASRA, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V9(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_SUKUN, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN)),

    VERBAL_NOUN_V10(createRootWord(0, 1, 2, FA_WITH_KASRA, AIN_WITH_SUKUN, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_V11(createRootWord(0, 1, 2, FA_WITH_DAMMA, AIN_WITH_SUKUN, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_V12(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_V13(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_V14(createRootWord(0, 1, 3, FA_WITH_FATHA, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_V15(createRootWord(0, 1, 3, FA_WITH_KASRA, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_V16(createRootWord(0, 1, 2, FA_WITH_KASRA, AIN_WITH_SUKUN, LAM_WITH_FATHA, LETTER_ALIF_MAKSURA)),

    VERBAL_NOUN_V17(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_SUKUN, LAM_WITH_FATHA, LETTER_ALIF_MAKSURA)),

    VERBAL_NOUN_V18(createRootWord(0, 1, 2, FA_WITH_DAMMA, AIN_WITH_SUKUN, LAM_WITH_FATHA, LETTER_ALIF_MAKSURA)),

    VERBAL_NOUN_V19(createRootWord(0, 1, 3, FA_WITH_FATHA, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V20(createRootWord(0, 1, 3, FA_WITH_KASRA, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V21(createRootWord(0, 1, 3, FA_WITH_DAMMA, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V22(createRootWord(0, 1, 3, FA_WITH_DAMMA, AIN_WITH_DAMMA, WAW_WITH_SUKUN, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V23(createRootWord(0, 1, 3, FA_WITH_FATHA, AIN_WITH_DAMMA, WAW_WITH_SUKUN, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V24(createRootWord(0, 1, 2, FA_WITH_FATHA, AIN_WITH_KASRA, YA_WITH_SUKUN, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_V25(createRootWord(0, 1, 3, FA_WITH_FATHA, AIN_WITH_DAMMA, WAW_WITH_SUKUN, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_V26(createRootWord(0, 1, 2, FA_WITH_DAMMA, AIN_WITH_SUKUN, LAM_WITH_FATHA, LETTER_ALIF, NOON_WITH_DAMMATAN)),

    VERBAL_NOUN_V27(createRootWord(1, 2, 3, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_FATHA,
            TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_FORM_II(createRootWord(1, 2, 4, TA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, YA_WITH_SUKUN, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_FORM_II_DEFECTIVE_VERB(createRootWord(1, 2, 3, TA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_FORM_III_V1(createRootWord(0, 1, 3, FA_WITH_KASRA, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_FORM_III_V2(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_FORM_III_DEFECTIVE_VERB(createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    VERBAL_NOUN_FORM_IV(createRootWord(1, 2, 4, ALIF_HAMZA_BELOW_WITH_KASRA, FA_WITH_SUKUN, AIN_WITH_FATHA,
            LETTER_ALIF, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_FORM_V(createRootWord(1, 2, 3, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_DAMMA, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_FORM_VI(createRootWord(1, 3, 4, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_DAMMA, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_FORM_VII(createRootWord(2, 3, 5, ALIF_HAMZA_BELOW_WITH_KASRA, NOON_WITH_SUKUN, FA_WITH_KASRA,
            AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_FORM_VIII(createRootWord(1, 3, 5, ALIF_HAMZA_BELOW_WITH_KASRA, FA_WITH_SUKUN, TA_WITH_KASRA,
            AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_FORM_IX(createRootWord(1, 2, 5, ALIF_HAMZA_BELOW_WITH_KASRA, FA_WITH_SUKUN, AIN_WITH_KASRA,
            LAM_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_FORM_X(createRootWord(3, 4, 6, ALIF_HAMZA_BELOW_WITH_KASRA, SEEN_WITH_SUKUN, TA_WITH_FATHA,
            FA_WITH_SUKUN, AIN_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN)),

    VERBAL_NOUN_FORM_XI(createRootWord(1, 2, 5, ALIF_HAMZA_BELOW_WITH_KASRA, FA_WITH_SUKUN, AIN_WITH_KASRA,
            YA_WITH_SUKUN, LAM_WITH_FATHA, LETTER_ALIF, LAM_WITH_DAMMATAN));

    private final RootWord rootWord;
    private final boolean feminine;
    private final Flexibility flexibility;

    VerbalNoun(final RootWord rootWord) {
        this(rootWord, false, Flexibility.FULLY_FLEXIBLE);
    }

    VerbalNoun(final RootWord rootWord, final boolean feminine) {
        this(rootWord, feminine, Flexibility.FULLY_FLEXIBLE);
    }

    VerbalNoun(final RootWord rootWord, final Flexibility flexibility) {
        this(rootWord, false, flexibility);
    }

    VerbalNoun(final RootWord rootWord, final boolean feminine, final Flexibility flexibility) {
        this.rootWord = rootWord;
        this.feminine = feminine;
        this.flexibility = flexibility;
    }

    private static RootWord createRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                           ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, -1, arabicLetters);
    }

    private static RootWord createRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                           int fourthRadicalIndex, ArabicLetter... arabicLetters) {
        ArabicWord arabicWord = new ArabicWord(arabicLetters);
        return new RootWord().withSarfTermType(null).withFirstRadicalIndex(firstRadicalIndex)
                .withSecondRadicalIndex(secondRadicalIndex).withThirdRadicalIndex(thirdRadicalIndex)
                .withFourthRadicalIndex(fourthRadicalIndex).withBaseWord(arabicWord).withRootWord(arabicWord);
    }

    public static List<VerbalNoun> getByTemplate(NamedTemplate template) {
        List<VerbalNoun> verbalNouns = new ArrayList<>();
        if (template == null) {
            return verbalNouns;
        }
        switch (template) {
            case FORM_II_TEMPLATE:
                verbalNouns.add(VERBAL_NOUN_FORM_II);
                break;
            case FORM_III_TEMPLATE:
                verbalNouns.addAll(Arrays.asList(VERBAL_NOUN_FORM_III_V1, VERBAL_NOUN_FORM_III_V2));
                break;
            case FORM_IV_TEMPLATE:
                verbalNouns.add(VERBAL_NOUN_FORM_IV);
                break;
            case FORM_V_TEMPLATE:
                verbalNouns.add(VERBAL_NOUN_FORM_V);
                break;
            case FORM_VI_TEMPLATE:
                verbalNouns.add(VERBAL_NOUN_FORM_VI);
                break;
            case FORM_VII_TEMPLATE:
                verbalNouns.add(VERBAL_NOUN_FORM_VII);
                break;
            case FORM_VIII_TEMPLATE:
                verbalNouns.add(VERBAL_NOUN_FORM_VIII);
                break;
            case FORM_IX_TEMPLATE:
                verbalNouns.add(VERBAL_NOUN_FORM_IX);
                break;
            case FORM_X_TEMPLATE:
                verbalNouns.add(VERBAL_NOUN_FORM_X);
                break;
            case FORM_XI_TEMPLATE:
                verbalNouns.add(VERBAL_NOUN_FORM_XI);
                break;
            default:
                break;
        }
        return verbalNouns;
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
