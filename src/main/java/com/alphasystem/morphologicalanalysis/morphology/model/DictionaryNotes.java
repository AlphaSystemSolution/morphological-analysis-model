package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.persistence.model.AbstractDocument;
import com.alphasystem.persistence.model.CascadeSave;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sali
 */
@Entity
@Document
public class DictionaryNotes extends AbstractDocument {

    @DBRef
    @CascadeSave
    protected RootLetters rootLetters;

    protected String notes;

    public DictionaryNotes() {
        super();
    }

    public RootLetters getRootLetters() {
        return rootLetters;
    }

    public void setRootLetters(RootLetters rootLetters) {
        this.rootLetters = rootLetters;
    }

    public boolean isEmpty() {
        return rootLetters == null || rootLetters.isEmpty();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public void initDisplayName() {
        if (rootLetters == null || rootLetters.isEmpty()) {
            super.initDisplayName();
        } else {
            setDisplayName(rootLetters.getDisplayName());
        }

    }
}
