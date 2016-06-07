package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.morphologicalanalysis.morphology.model.support.NounOfPlaceAndTime;

/**
 * @author sali
 */
public class AdverbRootBase extends NounRootBase<NounOfPlaceAndTime, NounOfPlaceAndTime, NounOfPlaceAndTime> {

    public AdverbRootBase(NounOfPlaceAndTime singularBaseWord) {
        this(singularBaseWord, singularBaseWord);
    }

    public AdverbRootBase(NounOfPlaceAndTime singularBaseWord, NounOfPlaceAndTime pluralBaseWord) {
        this(singularBaseWord, singularBaseWord, pluralBaseWord);
    }

    public AdverbRootBase(NounOfPlaceAndTime singularBaseWord, NounOfPlaceAndTime dualBaseWord, NounOfPlaceAndTime pluralBaseWord) {
        super(singularBaseWord, dualBaseWord, pluralBaseWord);
    }
}
