package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.morphology.model.support.VerbalNoun;
import com.alphasystem.persistence.model.AbstractDocument;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.String.format;

/**
 * @author sali
 */
@Entity
@Document
public class MorphologicalEntry extends AbstractDocument {

    protected RootLetters rootLetters;

    protected NamedTemplate form;

    @Indexed(name = "group-tag") private String groupTag;

    protected Set<VerbalNoun> verbalNouns;

    protected ConjugationConfiguration configuration;

    private String shortTranslation;

    public MorphologicalEntry() {
        super();
    }

    @PersistenceConstructor
    public MorphologicalEntry(RootLetters rootLetters, NamedTemplate form) {
        super();
        setRootLetters(rootLetters);
        setForm(form);
        initDisplayName();
    }

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

    public String getGroupTag() {
        return groupTag;
    }

    public void setGroupTag(String groupTag) {
        this.groupTag = groupTag;
    }

    public Set<VerbalNoun> getVerbalNouns() {
        if (verbalNouns == null) {
            verbalNouns = new LinkedHashSet<>();
        }
        return verbalNouns;
    }

    public void setVerbalNouns(Set<VerbalNoun> verbalNouns) {
        this.verbalNouns = new LinkedHashSet<>();
        if (verbalNouns != null) {
            this.verbalNouns.addAll(verbalNouns);
        }
    }

    public ConjugationConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ConjugationConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getShortTranslation() {
        return shortTranslation;
    }

    public void setShortTranslation(String shortTranslation) {
        this.shortTranslation = shortTranslation;
    }

    public boolean isEmpty() {
        return rootLetters == null || rootLetters.isEmpty() || form == null;
    }

    @Override
    public void initDisplayName() {
        if (isEmpty()) {
            super.initDisplayName();
        } else {
            String displayName = rootLetters.getDisplayName();
            setDisplayName(format("%s:%s", form.name(), displayName));
            groupTag = displayName;
        }
    }

    public VerbalNoun[] toVerbalNounArray() {
        VerbalNoun[] verbalNouns = null;
        if (this.verbalNouns != null && !this.verbalNouns.isEmpty()) {
            verbalNouns = this.verbalNouns.toArray(new VerbalNoun[0]);
        }
        return verbalNouns;
    }

}
