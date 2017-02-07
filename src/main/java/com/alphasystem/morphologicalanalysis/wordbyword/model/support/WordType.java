package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

/**
 * @author sali
 */
public enum WordType {

    NOUN(PartOfSpeech.NOUN, PartOfSpeech.PROPER_NOUN, PartOfSpeech.RELATIVE_PRONOUN, PartOfSpeech.DEMONSTRATIVE_PRONOUN,
            PartOfSpeech.TIME_ADVERB, PartOfSpeech.LOCATION_ADVERB, PartOfSpeech.PRONOUN),
    VERB(PartOfSpeech.VERB),
    PARTICLE(PartOfSpeech.GENITIVE_PARTICLE, PartOfSpeech.ACCUSATIVE_PARTICLE, PartOfSpeech.DEFINITE_ARTICLE, PartOfSpeech.EMPHATIC_PARTICLE,
            PartOfSpeech.IMPERATIVE_PARTICLE, PartOfSpeech.PARTICLE_OF_PURPOSE, PartOfSpeech.PARTICLE_OF_CONJUNCTION,
            PartOfSpeech.CONJUNCTION_PARTICLE_WAW, PartOfSpeech.CONJUNCTION_PARTICLE_FA, PartOfSpeech.SUBORDINATING_CONJUNCTION,
            PartOfSpeech.AMENDMENT_PARTICLE, PartOfSpeech.ANSWER_PARTICLE, PartOfSpeech.AVERSION_PARTICLE,
            PartOfSpeech.PARTICLE_OF_CAUSE, PartOfSpeech.PARTICLE_OF_CERTAINTY, PartOfSpeech.CIRCUMSTANTIAL_PARTICLE,
            PartOfSpeech.COMITATIVE_PARTICLE, PartOfSpeech.CONDITIONAL_PARTICLE, PartOfSpeech.EQUALIZATION_PARTICLE,
            PartOfSpeech.EXHORTATION_PARTICLE, PartOfSpeech.EXPLANATION_PARTICLE, PartOfSpeech.EXCEPTIVE_PARTICLE,
            PartOfSpeech.FUTURE_PARTICLE, PartOfSpeech.INCEPTIVE_PARTICLE, PartOfSpeech.PARTICLE_OF_INTERPRETATION,
            PartOfSpeech.INTERROGATIVE_PARTICLE, PartOfSpeech.NEGATIVE_PARTICLE, PartOfSpeech.PREVENTIVE_PARTICLE,
            PartOfSpeech.PROHIBITION_PARTICLE, PartOfSpeech.RESUMPTION_PARTICLE_WAW, PartOfSpeech.RESUMPTION_PARTICLE_FA,
            PartOfSpeech.RESTRICTION_PARTICLE, PartOfSpeech.RETRACTION_PARTICLE, PartOfSpeech.RESULT_PARTICLE,
            PartOfSpeech.SUPPLEMENTAL_PARTICLE, PartOfSpeech.SURPRISE_PARTICLE, PartOfSpeech.VOCATIVE_PARTICLE,
            PartOfSpeech.SUBJUNCTIVE_PARTICLE, PartOfSpeech.JUSSIVE_PARTICLE, PartOfSpeech.QURANIC_INITIAL,
            PartOfSpeech.QURANIC_PUNCTUATION);
    private final PartOfSpeech[] partOfSpeeches;

    WordType(PartOfSpeech... partOfSpeeches) {
        this.partOfSpeeches = partOfSpeeches;
    }

    public PartOfSpeech[] getPartOfSpeeches() {
        return partOfSpeeches;
    }
}
