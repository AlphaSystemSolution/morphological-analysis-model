package com.alphasystem.morphologicalanalysis.morphology.model.support;

/**
 * @author sali
 */
public interface NounSupport extends RootWordSupport {

    String name();

    boolean isFeminine();

    Flexibility getFlexibility();

}
