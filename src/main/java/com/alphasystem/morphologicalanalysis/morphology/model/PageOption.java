package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.morphologicalanalysis.morphology.model.support.PageOrientation;
import com.alphasystem.persistence.model.AbstractSimpleDocument;

/**
 * @author sali
 */
public class PageOption extends AbstractSimpleDocument {

    private PageOrientation orientation;

    public PageOption(){
        setOrientation(null);
    }

    public PageOrientation getOrientation() {
        return orientation;
    }

    public void setOrientation(PageOrientation orientation) {
        this.orientation = (orientation == null) ? PageOrientation.PORTRAIT : orientation;
    }

    public PageOption orientation(PageOrientation orientation) {
        setOrientation(orientation);
        return this;
    }
}
