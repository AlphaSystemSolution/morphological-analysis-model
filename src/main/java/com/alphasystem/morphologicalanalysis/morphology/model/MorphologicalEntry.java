package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.morphology.model.support.NounOfPlaceAndTime;
import com.alphasystem.morphologicalanalysis.morphology.model.support.VerbalNoun;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Location;
import com.alphasystem.persistence.model.AbstractDocument;
import com.alphasystem.persistence.model.CascadeSave;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.String.format;

/**
 * @author sali
 */
@Entity
@Document
public class MorphologicalEntry extends AbstractDocument {

    @DBRef
    @CascadeSave
    protected RootLetters rootLetters;

    protected NamedTemplate form;

    @Indexed(name = "group-tag")
    protected String groupTag;

    protected Set<VerbalNoun> verbalNouns;

    protected Set<NounOfPlaceAndTime> nounOfPlaceAndTimes;

    protected ConjugationConfiguration configuration;

    protected String shortTranslation;

    @DBRef(lazy = true)
    protected Set<Location> locations;

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

    public Set<NounOfPlaceAndTime> getNounOfPlaceAndTimes() {
        if (nounOfPlaceAndTimes == null) {
            nounOfPlaceAndTimes = new LinkedHashSet<>();
        }
        return nounOfPlaceAndTimes;
    }

    public void setNounOfPlaceAndTimes(Set<NounOfPlaceAndTime> nounOfPlaceAndTimes) {
        this.nounOfPlaceAndTimes = new LinkedHashSet<>();
        if (nounOfPlaceAndTimes != null) {
            this.nounOfPlaceAndTimes.addAll(nounOfPlaceAndTimes);
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

    public Set<Location> getLocations() {
        if (locations == null) {
            locations = new HashSet<>();
        }
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = new HashSet<>();
        if (locations != null) {
            this.locations.addAll(locations);
        }
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

}
