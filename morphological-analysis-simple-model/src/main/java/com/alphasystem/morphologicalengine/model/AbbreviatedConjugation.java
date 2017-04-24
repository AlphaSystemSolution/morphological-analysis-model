/**
 *
 */
package com.alphasystem.morphologicalengine.model;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbbreviatedConjugation {

    private String id;

    private ConjugationHeader conjugationHeader;

    // default active values
    private String pastTense;
    private String presentTense;
    private String activeParticipleMasculine;
    private String activeParticipleFeminine;
    

    // default passive values
    private String pastPassiveTense;
    private String presentPassiveTense;
    private String passiveParticipleMasculine;
    private String passiveParticipleFeminine;

    // default imperative and forbidden values
    private String imperative;
    private String forbidding;

    // default verbal noun values
    private String[] verbalNouns;

    // default adverb values
    private String[] adverbs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConjugationHeader getConjugationHeader() {
        return conjugationHeader;
    }

    public void setConjugationHeader(ConjugationHeader conjugationHeader) {
        this.conjugationHeader = conjugationHeader;
    }

    public String getPastTense() {
        return pastTense;
    }

    public void setPastTense(String pastTense) {
        this.pastTense = pastTense;
    }

    public AbbreviatedConjugation pastTense(String pastTense) {
        setPastTense(pastTense);
        return this;
    }

    public String getPresentTense() {
        return presentTense;
    }

    public void setPresentTense(String presentTense) {
        this.presentTense = presentTense;
    }

    public AbbreviatedConjugation presentTense(String presentTense) {
        setPresentTense(presentTense);
        return this;
    }

    public String[] getVerbalNouns() {
        return verbalNouns;
    }

    public void setVerbalNouns(String[] verbalNouns) {
        this.verbalNouns = verbalNouns;
    }

    public AbbreviatedConjugation verbalNouns(String... verbalNouns) {
        this.verbalNouns = ArrayUtils.addAll(this.verbalNouns, verbalNouns);
        return this;
    }

    public String getActiveParticipleMasculine() {
        return activeParticipleMasculine;
    }

    public void setActiveParticipleMasculine(String activeParticipleMasculine) {
        this.activeParticipleMasculine = activeParticipleMasculine;
    }

    public AbbreviatedConjugation activeParticipleMasculine(String activeParticipleMasculine) {
        setActiveParticipleMasculine(activeParticipleMasculine);
        return this;
    }

    public String getActiveParticipleFeminine() {
        return activeParticipleFeminine;
    }

    public void setActiveParticipleFeminine(String activeParticipleFeminine) {
        this.activeParticipleFeminine = activeParticipleFeminine;
    }

    public AbbreviatedConjugation activeParticipleFeminine(String activeParticipleFeminine) {
        setActiveParticipleFeminine(activeParticipleFeminine);
        return this;
    }

    public String getPastPassiveTense() {
        return pastPassiveTense;
    }

    public void setPastPassiveTense(String pastPassiveTense) {
        this.pastPassiveTense = pastPassiveTense;
    }

    public AbbreviatedConjugation pastPassiveTense(String pastPassiveTense) {
        setPastPassiveTense(pastPassiveTense);
        return this;
    }

    public String getPresentPassiveTense() {
        return presentPassiveTense;
    }

    public void setPresentPassiveTense(String presentPassiveTense) {
        this.presentPassiveTense = presentPassiveTense;
    }

    public AbbreviatedConjugation presentPassiveTense(String presentPassiveTense) {
        setPresentPassiveTense(presentPassiveTense);
        return this;
    }

    public String getPassiveParticipleMasculine() {
        return passiveParticipleMasculine;
    }

    public void setPassiveParticipleMasculine(String passiveParticipleMasculine) {
        this.passiveParticipleMasculine = passiveParticipleMasculine;
    }

    public AbbreviatedConjugation passiveParticipleMasculine(String passiveParticipleMasculine) {
        setPassiveParticipleMasculine(passiveParticipleMasculine);
        return this;
    }

    public String getPassiveParticipleFeminine() {
        return passiveParticipleFeminine;
    }

    public void setPassiveParticipleFeminine(String passiveParticipleFeminine) {
        this.passiveParticipleFeminine = passiveParticipleFeminine;
    }

    public AbbreviatedConjugation passiveParticipleFeminine(String passiveParticipleFeminine) {
        setPassiveParticipleFeminine(passiveParticipleFeminine);
        return this;
    }

    public String getImperative() {
        return imperative;
    }

    public void setImperative(String imperative) {
        this.imperative = imperative;
    }

    public AbbreviatedConjugation imperative(String imperative) {
        setImperative(imperative);
        return this;
    }

    public String getForbidding() {
        return forbidding;
    }

    public void setForbidding(String forbidding) {
        this.forbidding = forbidding;
    }

    public AbbreviatedConjugation forbidding(String forbidding) {
        setForbidding(forbidding);
        return this;
    }

    public String[] getAdverbs() {
        return adverbs;
    }

    public void setAdverbs(String[] adverbs) {
        this.adverbs = adverbs;
    }

    public AbbreviatedConjugation adverbs(String... adverbs) {
        this.adverbs = ArrayUtils.addAll(this.adverbs, adverbs);
        return this;
    }

    public boolean hasPassiveLine(){
        return pastPassiveTense != null || presentPassiveTense != null || passiveParticipleMasculine != null;
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{pastTense, presentTense, activeParticipleMasculine, pastPassiveTense,
                presentPassiveTense, passiveParticipleMasculine, imperative, forbidding, verbalNouns, adverbs});
    }
}
