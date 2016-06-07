package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.morphologicalanalysis.morphology.model.support.BrokenPlural;
import com.alphasystem.morphologicalanalysis.morphology.model.support.NounOfPlaceAndTime;

/**
 * @author sali
 */
public class BrokenPluralAdverbRootBase extends NounRootBase<NounOfPlaceAndTime, NounOfPlaceAndTime, BrokenPlural> {

    public BrokenPluralAdverbRootBase(NounOfPlaceAndTime singularBaseWord, BrokenPlural pluralBaseWord) {
        super(singularBaseWord, singularBaseWord, pluralBaseWord);
    }

}
