/**
 *
 */
package com.alphasystem.morphologicalanalysis.morphology.util;

import com.alphasystem.arabic.model.ArabicLetter;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;
import com.alphasystem.morphologicalanalysis.morphology.model.support.SarfTermType;

import static com.alphasystem.morphologicalanalysis.morphology.model.support.SarfTermType.*;

/**
 * @author sali
 */
public class TriLiteralTemplateHelper {

    public static RootWord createActiveParticipleFeminineRootWord(int firstRadicalIndex, int secondRadicalIndex,
                                                                  int thirdRadicalIndex, ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, ACTIVE_PARTICIPLE_FEMININE,
                arabicLetters);
    }

    public static RootWord createActiveParticipleMasculineRootWord(int firstRadicalIndex, int secondRadicalIndex,
                                                                   int thirdRadicalIndex, ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, ACTIVE_PARTICIPLE_MASCULINE,
                arabicLetters);
    }

    public static RootWord createForbiddingRootWord(RootWord presentTenseRoot) {
        return new RootWord(presentTenseRoot).withSarfTermType(FORBIDDING);
    }

    public static RootWord createImperativeRootWord(RootWord presentTenseRoot) {
        return new RootWord(presentTenseRoot).withSarfTermType(IMPERATIVE);
    }

    public static RootWord createPassiveParticipleFeminineRootWord(int firstRadicalIndex, int secondRadicalIndex,
                                                                   int thirdRadicalIndex,
                                                                   ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, PASSIVE_PARTICIPLE_FEMININE,
                arabicLetters);
    }

    public static RootWord createPassiveParticipleMasculineRootWord(int firstRadicalIndex, int secondRadicalIndex,
                                                                    int thirdRadicalIndex, ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, PASSIVE_PARTICIPLE_MASCULINE,
                arabicLetters);
    }

    public static RootWord createPastPassiveTenseRootWord(int firstRadicalIndex, int secondRadicalIndex,
                                                          int thirdRadicalIndex, ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, PAST_PASSIVE_TENSE,
                arabicLetters);
    }

    public static RootWord createPastTenseRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                                   ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, PAST_TENSE, arabicLetters);
    }

    public static RootWord createPresentPassiveTenseRootWord(int firstRadicalIndex, int secondRadicalIndex,
                                                             int thirdRadicalIndex, ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, PRESENT_PASSIVE_TENSE,
                arabicLetters);
    }

    public static RootWord createPresentTenseRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                                      ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex,
                thirdRadicalIndex, PRESENT_TENSE, arabicLetters);
    }

    public static RootWord createRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                          ArabicLetter... arabicLetters) {
        ArabicWord arabicWord = new ArabicWord(arabicLetters);
        return new RootWord().withSarfTermType(PAST_TENSE).withFirstRadicalIndex(firstRadicalIndex)
                .withSecondRadicalIndex(secondRadicalIndex).withThirdRadicalIndex(thirdRadicalIndex)
                .withFourthRadicalIndex(-1).withBaseWord(arabicWord).withRootWord(arabicWord);
    }

    public static RootWord createRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                          SarfTermType sarfTermType, ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, arabicLetters)
                .withSarfTermType(sarfTermType);
    }

    public static RootWord createVerbalNounRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                                    ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, VERBAL_NOUN, arabicLetters);
    }

    public static RootWord createZarfRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                              ArabicLetter... arabicLetters) {
        return createRootWord(firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, NOUN_OF_PLACE_AND_TIME,
                arabicLetters);
    }

    public static RootWord createRootWord(int firstRadicalIndex, int secondRadicalIndex, int thirdRadicalIndex,
                                          SarfTermType sarfTermType, ArabicWord root) {
        return new RootWord().withSarfTermType(sarfTermType).withFirstRadicalIndex(firstRadicalIndex)
                .withSecondRadicalIndex(secondRadicalIndex).withThirdRadicalIndex(thirdRadicalIndex).withRootWord(root);
    }
}
