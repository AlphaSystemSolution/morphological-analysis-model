package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.ConversationType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType;

import static com.alphasystem.morphologicalanalysis.morphology.model.RootWord.createRootWord;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.ConversationType.*;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType.FEMININE;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType.MASCULINE;
import static java.lang.String.format;

/**
 * @author sali
 */
public enum Verb implements ArabicLetters, VerbSupport {

    FORM_I_PAST_TENSE_V1(createRootWord(0, 1, 2, -1, FA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_I_PAST_TENSE_V2(createRootWord(0, 1, 2, -1, FA_WITH_FATHA, AIN_WITH_DAMMA, LAM_WITH_FATHA)),

    FORM_I_PAST_TENSE_V3(createRootWord(0, 1, 2, -1, FA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_FATHA)),

    FORM_I_PRESENT_TENSE_V1(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_DAMMA, LAM_WITH_DAMMA)),

    FORM_I_PRESENT_TENSE_V2(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_I_PRESENT_TENSE_V3(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_I_PAST_PASSIVE_TENSE(createRootWord(0, 1, 2, -1, FA_WITH_DAMMA, AIN_WITH_KASRA, LAM_WITH_FATHA)),

    FORM_I_PRESENT_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_I_IMPERATIVE_V1(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_DAMMA, LAM_WITH_DAMMA)) {
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_I_IMPERATIVE_V2(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMA)) {
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_I_IMPERATIVE_V3(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMA)) {
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_I_FORBIDDING_V1(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_DAMMA, LAM_WITH_DAMMA)) {
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_I_FORBIDDING_V2(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMA)) {
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_I_FORBIDDING_V3(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMA)) {
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_II_PAST_TENSE(createRootWord(0, 1, 2, -1, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA, LAM_WITH_FATHA)),

    FORM_II_PRESENT_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA, LAM_WITH_DAMMA)),

    FORM_II_PAST_PASSIVE_TENSE(createRootWord(0, 1, 2, -1, FA_WITH_DAMMA, AIN_WITH_SHADDA_AND_KASRA, LAM_WITH_FATHA)),

    FORM_II_PRESENT_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMA)),

    FORM_II_IMPERATIVE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_II_FORBIDDING(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_III_PAST_TENSE(createRootWord(0, 2, 3, -1, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_III_PRESENT_TENSE(createRootWord(1, 3, 4, -1, YA_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_III_PAST_PASSIVE_TENSE(createRootWord(0, 2, 3, -1, FA_WITH_DAMMA, WAW_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA)),

    FORM_III_PRESENT_PASSIVE_TENSE(createRootWord(1, 3, 4, 1, YA_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_DAMMA)),

    FORM_III_IMPERATIVE(createRootWord(1, 3, 4, -1, YA_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_III_FORBIDDING(createRootWord(1, 3, 4, -1, YA_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_IV_PAST_TENSE(createRootWord(1, 2, 3, -1, ALIF_HAMZA_ABOVE_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_IV_PRESENT_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_IV_PAST_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, ALIF_HAMZA_ABOVE_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA,
            LAM_WITH_FATHA)),

    FORM_IV_PRESENT_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_IV_IMPERATIVE(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_IV_FORBIDDING(createRootWord(1, 2, 3, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_V_PAST_TENSE(createRootWord(1, 2, 3, -1, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA, LAM_WITH_FATHA)),

    FORM_V_PRESENT_TENSE(createRootWord(2, 3, 4, -1, YA_WITH_FATHA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMA)),

    FORM_V_PAST_PASSIVE_TENSE(createRootWord(1, 2, 3, -1, TA_WITH_DAMMA, FA_WITH_DAMMA, AIN_WITH_SHADDA_AND_KASRA, LAM_WITH_FATHA)),

    FORM_V_PRESENT_PASSIVE_TENSE(createRootWord(2, 3, 4, -1, YA_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMA)),

    FORM_V_IMPERATIVE(createRootWord(2, 3, 4, -1, YA_WITH_FATHA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_V_FORBIDDING(createRootWord(2, 3, 4, -1, YA_WITH_FATHA, TA_WITH_FATHA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA,
            LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_VI_PAST_TENSE(createRootWord(1, 3, 4, -1, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_VI_PRESENT_TENSE(createRootWord(2, 4, 5, -1, YA_WITH_FATHA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_DAMMA)),

    FORM_VI_PAST_PASSIVE_TENSE(createRootWord(1, 3, 4, -1, TA_WITH_DAMMA, FA_WITH_DAMMA, WAW_WITH_SUKUN, AIN_WITH_KASRA,
            LAM_WITH_FATHA)),

    FORM_VI_PRESENT_PASSIVE_TENSE(createRootWord(2, 4, 5, -1, YA_WITH_DAMMA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF,
            AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_VI_IMPERATIVE(createRootWord(2, 4, 5, -1, YA_WITH_FATHA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_VI_FORBIDDING(createRootWord(2, 4, 5, -1, YA_WITH_FATHA, TA_WITH_FATHA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA,
            LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_VII_PAST_TENSE(createRootWord(2, 3, 4, -1, ALIF_HAMZA_BELOW_WITH_KASRA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_FATHA)),

    FORM_VII_PRESENT_TENSE(createRootWord(2, 3, 4, -1, YA_WITH_FATHA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_VII_IMPERATIVE(createRootWord(2, 3, 4, -1, YA_WITH_FATHA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_VII_FORBIDDING(createRootWord(2, 3, 4, -1, YA_WITH_FATHA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_VIII_PAST_TENSE(createRootWord(1, 3, 4, -1, ALIF_HAMZA_BELOW_WITH_KASRA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_FATHA)),

    FORM_VIII_PRESENT_TENSE(createRootWord(1, 3, 4, -1, YA_WITH_FATHA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_VIII_PAST_PASSIVE_TENSE(createRootWord(1, 3, 4, -1, ALIF_HAMZA_ABOVE_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_DAMMA,
            AIN_WITH_KASRA, LAM_WITH_FATHA)),

    FORM_VIII_PRESENT_PASSIVE_TENSE(createRootWord(1, 3, 4, -1, YA_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA,
            LAM_WITH_DAMMA)),

    FORM_VIII_IMPERATIVE(createRootWord(1, 3, 4, -1, YA_WITH_FATHA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_VIII_FORBIDDING(createRootWord(1, 3, 4, -1, YA_WITH_FATHA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_IX_PAST_TENSE(createRootWord(1, 2, 3, -1, ALIF_HAMZA_BELOW_WITH_KASRA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_SHADDA_AND_FATHA)),

    FORM_IX_PRESENT_TENSE(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_SHADDA_AND_DAMMA)),

    FORM_IX_IMPERATIVE(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_SHADDA_AND_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_IX_FORBIDDING(createRootWord(1, 2, 3, -1, YA_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_SHADDA_AND_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_X_PAST_TENSE(createRootWord(3, 4, 5, -1, ALIF_HAMZA_BELOW_WITH_KASRA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_FATHA, LAM_WITH_FATHA)),

    FORM_X_PRESENT_TENSE(createRootWord(3, 4, 5, -1, YA_WITH_FATHA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_KASRA, LAM_WITH_DAMMA)),

    FORM_X_PAST_PASSIVE_TENSE(createRootWord(3, 4, 5, -1, YA_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_FATHA, LAM_WITH_DAMMA)),

    FORM_X_PRESENT_PASSIVE_TENSE(createRootWord(3, 4, 5, -1, ALIF_HAMZA_ABOVE_WITH_DAMMA, SEEN_WITH_SUKUN, TA_WITH_DAMMA,
            FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_FATHA)),

    FORM_X_IMPERATIVE(createRootWord(3, 4, 5, -1, YA_WITH_FATHA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    },

    FORM_X_FORBIDDING(createRootWord(3, 4, 5, -1, YA_WITH_FATHA, SEEN_WITH_SUKUN, TA_WITH_FATHA, FA_WITH_SUKUN,
            AIN_WITH_KASRA, LAM_WITH_DAMMA)){
        @Override
        public String getThirdPersonMasculineName() {
            return null;
        }

        @Override
        public String getThirdPersonFeminineName() {
            return null;
        }

        @Override
        public String getFirstPersonName() {
            return null;
        }
    };

    private final RootWord rootWord;

    Verb(RootWord rootWord) {
        this.rootWord = rootWord;
    }

    @Override
    public RootWord getRootWord() {
        return rootWord;
    }

    @Override
    public ArabicWord toLabel() {
        return getRootWord().toLabel();
    }


    @Override
    public String getThirdPersonMasculineName() {
        return getRootName(THIRD_PERSON, MASCULINE);
    }

    @Override
    public String getThirdPersonFeminineName() {
        return getRootName(THIRD_PERSON, FEMININE);
    }

    @Override
    public String getSecondPersonMasculineName() {
        return getRootName(SECOND_PERSON, MASCULINE);
    }

    @Override
    public String getSecondPersonFeminineName() {
        return getRootName(SECOND_PERSON, FEMININE);
    }

    @Override
    public String getFirstPersonName() {
        return getRootName(FIRST_PERSON, null);
    }

    private String getRootName(ConversationType conversationType, GenderType genderType) {
        String gt = (genderType == null) ? "" : format("_%s", genderType.name());
        return format("%s_%s%s", name(), conversationType.name(), gt);
    }
}
