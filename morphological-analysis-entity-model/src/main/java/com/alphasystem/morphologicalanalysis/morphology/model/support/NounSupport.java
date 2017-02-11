package com.alphasystem.morphologicalanalysis.morphology.model.support;

/**
 * @author sali
 */
public interface NounSupport extends RootWordSupport {

    boolean isFeminine();

    Flexibility getFlexibility();

    String getSingularRootName();

    String getDualRootName();

    String getPluralRootName();
}
