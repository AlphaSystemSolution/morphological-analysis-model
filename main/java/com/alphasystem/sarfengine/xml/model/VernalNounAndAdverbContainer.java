package com.alphasystem.sarfengine.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sali
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VernalNounAndAdverbContainerType", propOrder = {"verbalNouns", "adverbs"})
public class VernalNounAndAdverbContainer {

    protected List<VerbalNoun> verbalNouns;
    protected List<NounOfPlaceAndTime> adverbs;

    public VernalNounAndAdverbContainer() {
        setVerbalNouns(null);
        setAdverbs(null);
    }

    public List<VerbalNoun> getVerbalNouns() {
        return verbalNouns;
    }

    public void setVerbalNouns(List<VerbalNoun> verbalNouns) {
        this.verbalNouns = new ArrayList<>();
        if (verbalNouns != null) {
            this.verbalNouns.addAll(verbalNouns);
        }
    }

    public List<NounOfPlaceAndTime> getAdverbs() {
        return adverbs;
    }

    public void setAdverbs(List<NounOfPlaceAndTime> adverbs) {
        this.adverbs = new ArrayList<>();
        if (adverbs != null) {
            this.adverbs.addAll(adverbs);
        }
    }
}
