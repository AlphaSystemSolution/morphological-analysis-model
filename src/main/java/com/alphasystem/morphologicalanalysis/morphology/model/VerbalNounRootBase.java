package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.morphologicalanalysis.morphology.model.support.VerbalNoun;

/**
 * @author sali
 */
public class VerbalNounRootBase extends NounRootBase<VerbalNoun, VerbalNoun, VerbalNoun> {

    public VerbalNounRootBase(VerbalNoun singularBaseWord) {
        this(singularBaseWord, singularBaseWord);
    }

    public VerbalNounRootBase(VerbalNoun singularBaseWord, VerbalNoun pluralBaseWord) {
        this(singularBaseWord, singularBaseWord, pluralBaseWord);
    }

    public VerbalNounRootBase(VerbalNoun singularBaseWord, VerbalNoun dualBaseWord, VerbalNoun pluralBaseWord) {
        super(singularBaseWord, dualBaseWord, pluralBaseWord);
    }
}
