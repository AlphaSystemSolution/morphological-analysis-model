package com.alphasystem.morphologicalengine.model;

import com.alphasystem.morphologicalanalysis.morphology.model.support.SarfTermType;
import com.alphasystem.util.IdGenerator;

/**
 * @author sali
 */
public class ConjugationGroup {

    private SarfTermType termType;

    private String id;

    public SarfTermType getTermType() {
        return termType;
    }

    public void setTermType(SarfTermType termType) {
        this.termType = termType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = (id == null) ? IdGenerator.nextId() : id;
    }

    public String defaultValue() {
        return null;
    }

    public boolean empty() {
        return false;
    }
}
