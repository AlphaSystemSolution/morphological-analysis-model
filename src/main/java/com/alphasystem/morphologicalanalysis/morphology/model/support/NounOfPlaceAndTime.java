/**
 *
 */
package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;

import java.util.ArrayList;
import java.util.List;

import static com.alphasystem.morphologicalanalysis.morphology.model.support.NounSupport.Flexibility.FULLY_FLEXIBLE;
import static com.alphasystem.morphologicalanalysis.morphology.model.support.NounSupport.Flexibility.PARTLY_FLEXIBLE;
import static com.alphasystem.morphologicalanalysis.morphology.util.TriLiteralTemplateHelper.createZarfRootWord;
import static java.util.Arrays.asList;

/**
 * @author sali
 */
public enum NounOfPlaceAndTime implements ArabicLetters, NounSupport {

    NOUN_OF_PLACE_AND_TIME_V1(createZarfRootWord(1, 2, 3, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMATAN), false, PARTLY_FLEXIBLE),

    NOUN_OF_PLACE_AND_TIME_V2(createZarfRootWord(1, 2, 3, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMATAN), false, PARTLY_FLEXIBLE),

    NOUN_OF_PLACE_AND_TIME_V3(createZarfRootWord(1, 2, 3, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN), true),

    NOUN_OF_PLACE_AND_TIME_FORM_II(createZarfRootWord(2, 3, 4, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA, LAM_WITH_DAMMATAN)),

    NOUN_OF_PLACE_AND_TIME_FORM_III(createZarfRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    NOUN_OF_PLACE_AND_TIME_FORM_IV(createZarfRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    NOUN_OF_PLACE_AND_TIME_FORM_V(createZarfRootWord(2, 3, 4, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA, LAM_WITH_DAMMATAN)),

    NOUN_OF_PLACE_AND_TIME_FORM_VI(createZarfRootWord(2, 4, 5, MEEM_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    NOUN_OF_PLACE_AND_TIME_FORM_VII(createZarfRootWord(2, 3, 4, MEEM_WITH_DAMMA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    NOUN_OF_PLACE_AND_TIME_FORM_VIII(createZarfRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)),

    //NOUN_OF_PLACE_AND_TIME_FORM_IX(null),

    NOUN_OF_PLACE_AND_TIME_FORM_X(createZarfRootWord(3, 4, 5, MEEM_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMATAN));

    private static RootWord[] rootWords;

    static {
        NounOfPlaceAndTime[] values = values();
        rootWords = new RootWord[values.length];
        for (int i = 0; i < values.length; i++) {
            rootWords[i] = values[i].getRootWord();
        }
    }

    private final RootWord rootWord;
    private final boolean feminine;
    private final Flexibility flexibility;

    NounOfPlaceAndTime(final RootWord rootWord) {
        this(rootWord, false, FULLY_FLEXIBLE);
    }

    NounOfPlaceAndTime(final RootWord rootWord, final boolean feminine) {
        this(rootWord, feminine, FULLY_FLEXIBLE);
    }

    NounOfPlaceAndTime(final RootWord rootWord, final Flexibility flexibility) {
        this(rootWord, false, flexibility);
    }

    NounOfPlaceAndTime(final RootWord rootWord, final boolean feminine, final Flexibility flexibility) {
        this.rootWord = rootWord;
        this.feminine = feminine;
        this.flexibility = flexibility;
    }

    public static List<NounOfPlaceAndTime> getByTemplate(NamedTemplate template) {
        List<NounOfPlaceAndTime> nounOfPlaceAndTimes = new ArrayList<>();
        if (template == null) {
            return nounOfPlaceAndTimes;
        }
        switch (template) {
            case FORM_I_CATEGORY_A_GROUP_U_TEMPLATE:
            case FORM_I_CATEGORY_A_GROUP_I_TEMPLATE:
            case FORM_I_CATEGORY_A_GROUP_A_TEMPLATE:
            case FORM_I_CATEGORY_U_TEMPLATE:
            case FORM_I_CATEGORY_I_GROUP_A_TEMPLATE:
            case FORM_I_CATEGORY_I_GROUP_I_TEMPLATE:
                nounOfPlaceAndTimes.addAll(asList(NOUN_OF_PLACE_AND_TIME_V1, NOUN_OF_PLACE_AND_TIME_V2,
                        NOUN_OF_PLACE_AND_TIME_V3));
                break;
            case FORM_II_TEMPLATE:
                nounOfPlaceAndTimes.add(NOUN_OF_PLACE_AND_TIME_FORM_II);
                break;
            case FORM_III_TEMPLATE:
                nounOfPlaceAndTimes.add(NOUN_OF_PLACE_AND_TIME_FORM_III);
                break;
            case FORM_IV_TEMPLATE:
                nounOfPlaceAndTimes.add(NOUN_OF_PLACE_AND_TIME_FORM_IV);
                break;
            case FORM_V_TEMPLATE:
                nounOfPlaceAndTimes.add(NOUN_OF_PLACE_AND_TIME_FORM_V);
                break;
            case FORM_VI_TEMPLATE:
                nounOfPlaceAndTimes.add(NOUN_OF_PLACE_AND_TIME_FORM_VI);
                break;
            case FORM_VII_TEMPLATE:
                nounOfPlaceAndTimes.add(NOUN_OF_PLACE_AND_TIME_FORM_VII);
                break;
            case FORM_VIII_TEMPLATE:
                nounOfPlaceAndTimes.add(NOUN_OF_PLACE_AND_TIME_FORM_VIII);
                break;
            case FORM_X_TEMPLATE:
                nounOfPlaceAndTimes.add(NOUN_OF_PLACE_AND_TIME_FORM_X);
                break;
            default:
                break;
        }
        return nounOfPlaceAndTimes;
    }

    public static RootWord[] getRootWords() {
        return rootWords;
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
