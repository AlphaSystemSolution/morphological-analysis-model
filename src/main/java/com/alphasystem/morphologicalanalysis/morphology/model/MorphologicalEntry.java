package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.persistence.model.AbstractDocument;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import static java.lang.String.format;

/**
 * @author sali
 */
@Document
@TypeAlias("MorphologicalEntry")
public class MorphologicalEntry extends AbstractDocument {

    @DBRef
    protected RootLetters rootLetters;

    protected NamedTemplate form;

    protected String dictionary;

    public NamedTemplate getForm() {
        return form;
    }

    public void setForm(NamedTemplate form) {
        this.form = form;
    }

    public RootLetters getRootLetters() {
        return rootLetters;
    }

    public void setRootLetters(RootLetters rootLetters) {
        this.rootLetters = rootLetters;
    }

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public void initDisplayName() {
        if (rootLetters != null && !rootLetters.isEmpty() && form != null) {
            setDisplayName(format("%s:%s", form.name(), rootLetters.getDisplayName()));
        } else {
            super.initDisplayName();
        }
    }
}
