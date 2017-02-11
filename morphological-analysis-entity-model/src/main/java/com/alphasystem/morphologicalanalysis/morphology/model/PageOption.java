package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.morphologicalanalysis.morphology.model.support.PageOrientation;
import com.alphasystem.persistence.model.AbstractSimpleDocument;

/**
 * @author sali
 */
public class PageOption extends AbstractSimpleDocument {

    private PageOrientation orientation;

    public PageOption() {
        setOrientation(null);
    }

    /**
     * Copy constructor.
     *
     * @param src source object
     * @throws NullPointerException if <code>src</code> is null.
     */
    public PageOption(PageOption src) {
        if (src == null) {
            throw new NullPointerException("source object can not be null");
        }
        setOrientation(src.getOrientation());
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
