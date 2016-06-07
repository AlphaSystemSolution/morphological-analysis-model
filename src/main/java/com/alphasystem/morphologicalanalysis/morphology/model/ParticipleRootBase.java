package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.morphologicalanalysis.morphology.model.support.Noun;

/**
 * @author sali
 */
public class ParticipleRootBase extends NounRootBase<Noun, Noun, Noun> {

    public ParticipleRootBase(Noun singularBaseWord) {
        this(singularBaseWord, singularBaseWord);
    }

    public ParticipleRootBase(Noun singularBaseWord, Noun pluralBaseWord) {
        this(singularBaseWord, singularBaseWord, pluralBaseWord);
    }

    public ParticipleRootBase(Noun singularBaseWord, Noun dualBaseWord, Noun pluralBaseWord) {
        super(singularBaseWord, dualBaseWord, pluralBaseWord);
    }
}
