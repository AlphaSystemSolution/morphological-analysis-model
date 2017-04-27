/**
 *
 */
package com.alphasystem.morphologicalengine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailedConjugation {

    private String id;

    // active values
    private VerbConjugationGroup pastTense;
    private VerbConjugationGroup presentTense;
    private NounConjugationGroup activeParticipleMasculine;
    private NounConjugationGroup activeParticipleFeminine;

    // passive values
    private VerbConjugationGroup pastPassiveTense;
    private VerbConjugationGroup presentPassiveTense;
    private NounConjugationGroup passiveParticipleMasculine;
    private NounConjugationGroup passiveParticipleFeminine;

    // imperative and forbidden values
    private VerbConjugationGroup imperative;
    private VerbConjugationGroup forbidding;

    // verbal noun values
    private NounConjugationGroup[] verbalNouns;

    // adverb values
    private NounConjugationGroup[] adverbs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VerbConjugationGroup getPastTense() {
        return pastTense;
    }

    public void setPastTense(VerbConjugationGroup pastTense) {
        this.pastTense = pastTense;
    }

    public VerbConjugationGroup getPresentTense() {
        return presentTense;
    }

    public void setPresentTense(VerbConjugationGroup presentTense) {
        this.presentTense = presentTense;
    }

    public NounConjugationGroup getActiveParticipleMasculine() {
        return activeParticipleMasculine;
    }

    public void setActiveParticipleMasculine(NounConjugationGroup activeParticipleMasculine) {
        this.activeParticipleMasculine = activeParticipleMasculine;
    }

    public NounConjugationGroup getActiveParticipleFeminine() {
        return activeParticipleFeminine;
    }

    public void setActiveParticipleFeminine(NounConjugationGroup activeParticipleFeminine) {
        this.activeParticipleFeminine = activeParticipleFeminine;
    }

    public VerbConjugationGroup getPastPassiveTense() {
        return pastPassiveTense;
    }

    public void setPastPassiveTense(VerbConjugationGroup pastPassiveTense) {
        this.pastPassiveTense = pastPassiveTense;
    }

    public VerbConjugationGroup getPresentPassiveTense() {
        return presentPassiveTense;
    }

    public void setPresentPassiveTense(VerbConjugationGroup presentPassiveTense) {
        this.presentPassiveTense = presentPassiveTense;
    }

    public NounConjugationGroup getPassiveParticipleMasculine() {
        return passiveParticipleMasculine;
    }

    public void setPassiveParticipleMasculine(NounConjugationGroup passiveParticipleMasculine) {
        this.passiveParticipleMasculine = passiveParticipleMasculine;
    }

    public NounConjugationGroup getPassiveParticipleFeminine() {
        return passiveParticipleFeminine;
    }

    public void setPassiveParticipleFeminine(NounConjugationGroup passiveParticipleFeminine) {
        this.passiveParticipleFeminine = passiveParticipleFeminine;
    }

    public VerbConjugationGroup getImperative() {
        return imperative;
    }

    public void setImperative(VerbConjugationGroup imperative) {
        this.imperative = imperative;
    }

    public VerbConjugationGroup getForbidding() {
        return forbidding;
    }

    public void setForbidding(VerbConjugationGroup forbidding) {
        this.forbidding = forbidding;
    }

    public NounConjugationGroup[] getVerbalNouns() {
        return verbalNouns;
    }

    public void setVerbalNouns(NounConjugationGroup[] verbalNouns) {
        this.verbalNouns = verbalNouns;
    }

    public NounConjugationGroup[] getAdverbs() {
        return adverbs;
    }

    public void setAdverbs(NounConjugationGroup[] adverbs) {
        this.adverbs = adverbs;
    }

    public boolean hasPassiveLine(){
        return pastPassiveTense != null || presentPassiveTense != null || passiveParticipleMasculine != null;
    }

}
