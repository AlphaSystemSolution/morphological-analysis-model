package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.morphology.IllegalEntryException;
import com.alphasystem.persistence.model.AbstractDocument;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author sali
 */
@Entity
@Document
@TypeAlias("MorphologicalGroup")
public class MorphologicalGroup extends AbstractDocument {

    @DBRef
    protected RootLetters rootLetters;

    protected Map<NamedTemplate, MorphologicalEntry> entries;

    public MorphologicalGroup() {
        super();
    }

    public RootLetters getRootLetters() {
        return rootLetters;
    }

    public void setRootLetters(RootLetters rootLetters) {
        this.rootLetters = rootLetters;
    }

    public Map<NamedTemplate, MorphologicalEntry> getEntries() {
        if (entries == null) {
            entries = new HashMap<>();
        }
        return entries;
    }

    public void setEntries(Map<NamedTemplate, MorphologicalEntry> entries) throws IllegalEntryException {
        this.entries = new HashMap<>();
        if (entries != null) {
            for (Entry<NamedTemplate, MorphologicalEntry> entry : entries.entrySet()) {
                addEntry(entry.getValue());
            }
        }
    }

    /**
     * @param entry
     * @throws IllegalEntryException
     */
    public void addEntry(MorphologicalEntry entry) throws IllegalEntryException {
        if (entry == null || entry.getRootLetters() == null || entry.getRootLetters().isEmpty() || entry.getForm() == null) {
            return;
        }
        if (rootLetters == null) {
            setRootLetters(entry.getRootLetters());
        } else {
            if (!rootLetters.equals(entry.getRootLetters())) {
                throw new IllegalEntryException(String.format(""));
            }
        }
        getEntries().put(entry.getForm(), entry);
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
