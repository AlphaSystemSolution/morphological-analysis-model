/**
 *
 */
package com.alphasystem.morphologicalengine.model.abbrvconj;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.ArrayUtils;

import static java.util.Objects.hash;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActiveLine {

    private String pastTense;

    private String presentTense;

    private String[] verbalNouns;

    private String verbalNoun;

    private String activeParticipleMasculine;

    private String activeParticipleValue;

    public String getPastTense() {
        return pastTense;
    }

    public void setPastTense(String pastTense) {
        this.pastTense = pastTense;
    }

    public ActiveLine pastTense(String pastTense) {
        setPastTense(pastTense);
        return this;
    }

    public String getPresentTense() {
        return presentTense;
    }

    public void setPresentTense(String presentTense) {
        this.presentTense = presentTense;
    }

    public ActiveLine presentTense(String presentTense) {
        setPresentTense(presentTense);
        return this;
    }

    public String getVerbalNoun() {
        return verbalNoun;
    }

    public void setVerbalNoun(String verbalNoun) {
        this.verbalNoun = verbalNoun;
    }

    public ActiveLine verbalNoun(String verbalNoun) {
        setVerbalNoun(verbalNoun);
        return this;
    }

    public String[] getVerbalNouns() {
        return verbalNouns;
    }

    public void setVerbalNouns(String[] verbalNouns) {
        this.verbalNouns = verbalNouns;
    }

    public ActiveLine verbalNouns(String... verbalNouns) {
        this.verbalNouns = ArrayUtils.addAll(this.verbalNouns, verbalNouns);
        return this;
    }

    public String getActiveParticipleMasculine() {
        return activeParticipleMasculine;
    }

    public void setActiveParticipleMasculine(String activeParticipleMasculine) {
        this.activeParticipleMasculine = activeParticipleMasculine;
    }

    public ActiveLine activeParticipleMasculine(String activeParticipleMasculine) {
        setActiveParticipleMasculine(activeParticipleMasculine);
        return this;
    }

    public String getActiveParticipleValue() {
        return activeParticipleValue;
    }

    public void setActiveParticipleValue(String activeParticipleValue) {
        this.activeParticipleValue = activeParticipleValue;
    }

    public ActiveLine activeParticipleValue(String activeParticipleValue) {
        setActiveParticipleValue(activeParticipleValue);
        return this;
    }

    @Override
    public int hashCode() {
        return hash(pastTense, presentTense, activeParticipleMasculine, verbalNouns);
    }

}
