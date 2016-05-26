package com.alphasystem.morphologicalanalysis.morphology.model.support;

import com.alphasystem.arabic.model.ArabicSupport;
import com.alphasystem.morphologicalanalysis.morphology.model.RootWord;

/**
 * @author sali
 */
public interface NounSupport extends ArabicSupport {

    enum Flexibility {
        FULLY_FLEXIBLE, PARTLY_FLEXIBLE, NON_FLEXIBLE
    }

    RootWord getRootWord();

    boolean isFeminine();

    Flexibility getFlexibility();
}
