package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.morphology.model.support.NounOfPlaceAndTime;
import com.alphasystem.morphologicalanalysis.morphology.model.support.VerbalNoun;
import com.alphasystem.persistence.model.AbstractDocument;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedHashSet;
import java.util.Set;

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

    protected Set<VerbalNoun> verbalNouns;

    protected Set<NounOfPlaceAndTime> nounOfPlaceAndTimes;

    protected ConjugationConfiguration configuration;

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
