package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

/**
 * @author sali
 */
public abstract class IncompleteVerb<T extends IncompleteVerbType> {

    protected T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
