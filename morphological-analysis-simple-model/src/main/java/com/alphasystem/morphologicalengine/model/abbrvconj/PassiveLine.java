/**
 *
 */
package com.alphasystem.morphologicalengine.model.abbrvconj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static java.util.Objects.hash;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PassiveLine {

    private String pastPassiveTense;

    private String presentPassiveTense;

    private String[] verbalNouns;

    private String verbalNoun;

    private String passiveParticipleMasculine;

    private String passiveParticipleValue;

    public String getPastPassiveTense() {
        return pastPassiveTense;
    }

    public void setPastPassiveTense(String pastPassiveTense) {
        this.pastPassiveTense = pastPassiveTense;
    }

    public PassiveLine pastPassiveTense(String pastPassiveTense) {
        setPastPassiveTense(pastPassiveTense);
        return this;
    }

    public String getPresentPassiveTense() {
        return presentPassiveTense;
    }

    public void setPresentPassiveTense(String presentPassiveTense) {
        this.presentPassiveTense = presentPassiveTense;
    }

    public PassiveLine presentPassiveTense(String presentPassiveTense) {
        setPresentPassiveTense(presentPassiveTense);
        return this;
    }

    public String getVerbalNoun() {
        return verbalNoun;
    }

    public void setVerbalNoun(String verbalNoun) {
        this.verbalNoun = verbalNoun;
    }

    public PassiveLine verbalNoun(String verbalNoun) {
        setVerbalNoun(verbalNoun);
        return this;
    }

    public String[] getVerbalNouns() {
        return verbalNouns;
    }

    public void setVerbalNouns(String[] verbalNouns) {
        this.verbalNouns = verbalNouns;
    }

    public PassiveLine verbalNouns(String... verbalNouns) {
        setVerbalNouns(verbalNouns);
        return this;
    }

    public String getPassiveParticipleMasculine() {
        return passiveParticipleMasculine;
    }

    public void setPassiveParticipleMasculine(String passiveParticipleMasculine) {
        this.passiveParticipleMasculine = passiveParticipleMasculine;
    }

    public PassiveLine passiveParticipleMasculine(String passiveParticipleMasculine) {
        setPassiveParticipleMasculine(passiveParticipleMasculine);
        return this;
    }

    public String getPassiveParticipleValue() {
        return passiveParticipleValue;
    }

    public void setPassiveParticipleValue(String passiveParticipleValue) {
        this.passiveParticipleValue = passiveParticipleValue;
    }

    public PassiveLine passiveParticipleValue(String passiveParticipleValue) {
        setPassiveParticipleValue(passiveParticipleValue);
        return this;
    }

    @Override
    public int hashCode() {
        return hash(pastPassiveTense, presentPassiveTense, passiveParticipleMasculine, verbalNouns);
    }

    public boolean isNull() {
        return pastPassiveTense == null && presentPassiveTense == null
                && passiveParticipleMasculine == null;
    }

}
