package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

/**
 * @author sali
 */
public abstract class IncompleteVerb<T extends IncompleteVerbType> {

    protected IncompleteVerbCategory category;
    protected T type;

    public IncompleteVerbCategory getCategory() {
        return category;
    }

    public void setCategory(IncompleteVerbCategory category) {
        this.category = category;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
