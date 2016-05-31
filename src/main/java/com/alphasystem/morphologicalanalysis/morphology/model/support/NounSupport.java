package com.alphasystem.morphologicalanalysis.morphology.model.support;

/**
 * @author sali
 */
public interface NounSupport extends RootWordSupport {

    enum Flexibility {
        FULLY_FLEXIBLE, PARTLY_FLEXIBLE, NON_FLEXIBLE
    }

    boolean isFeminine();

    Flexibility getFlexibility();
}
