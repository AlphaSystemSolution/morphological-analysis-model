package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicWord;

/**
 * @author sali
 */
public enum DummyFamily implements IncompleteVerbType {

    ;

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ArabicWord toLabel() {
        return null;
    }
}
