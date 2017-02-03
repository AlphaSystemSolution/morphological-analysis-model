package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

/**
 * @author sali
 */
public enum WordType {

    NOUN(NounPartOfSpeechType.values()),
    PRO_NOUN(ProNounPartOfSpeechType.values()),
    VERB(VerbPartOfSpeechType.values()),
    PARTICLE(ParticlePartOfSpeechType.values());
    private final PartOfSpeechType[] partOfSpeeches;

    WordType(PartOfSpeechType... partOfSpeeches) {
        this.partOfSpeeches = partOfSpeeches;
    }

    public PartOfSpeechType[] getPartOfSpeeches() {
        return partOfSpeeches;
    }
}
