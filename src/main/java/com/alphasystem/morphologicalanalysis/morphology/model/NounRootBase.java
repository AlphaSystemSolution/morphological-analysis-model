package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.morphologicalanalysis.morphology.model.support.NounSupport;

/**
 * @author sali
 */
public abstract class NounRootBase<S extends Enum<S> & NounSupport, D extends Enum<D> & NounSupport, P extends Enum<P> & NounSupport> {

    protected final S singularBaseWord;
    protected final D dualBaseWord;
    protected final P pluralBaseWord;

    protected NounRootBase(S singularBaseWord, D dualBaseWord, P pluralBaseWord) {
        this.singularBaseWord = singularBaseWord;
        this.dualBaseWord = dualBaseWord;
        this.pluralBaseWord = pluralBaseWord;
    }

    public S getSingularBaseWord() {
        return singularBaseWord;
    }

    public D getDualBaseWord() {
        return dualBaseWord;
    }

    public P getPluralBaseWord() {
        return pluralBaseWord;
    }
}
