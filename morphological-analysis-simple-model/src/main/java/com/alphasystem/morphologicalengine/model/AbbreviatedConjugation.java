/**
 *
 */
package com.alphasystem.morphologicalengine.model;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

import com.alphasystem.morphologicalengine.model.abbrvconj.ActiveLine;
import com.alphasystem.morphologicalengine.model.abbrvconj.AdverbLine;
import com.alphasystem.morphologicalengine.model.abbrvconj.ImperativeAndForbiddingLine;
import com.alphasystem.morphologicalengine.model.abbrvconj.PassiveLine;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbbreviatedConjugation {

    private ConjugationHeader conjugationHeader;

    // default active values
    private String pastTense;
    private String presentTense;
    private String activeParticiple;

    // default passive values
    private String pastPassiveTense;
    private String presentPassiveTense;
    private String passiveParticiple;

    // default imperative and forbidden values
    private String imperative;
    private String forbidding;

    // default verbal noun values
    private String[] verbalNouns;

    // default adverb values
    private String[] adverbs;

    @Deprecated
    private ActiveLine activeLine;

    @Deprecated
    private PassiveLine passiveLine;

    @Deprecated
    private ImperativeAndForbiddingLine imperativeAndForbiddingLine;

    @Deprecated
    private AdverbLine adverbLine;

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

    public String getActiveParticiple() {
        return activeParticiple;
    }

    public void setActiveParticiple(String activeParticiple) {
        this.activeParticiple = activeParticiple;
    }

    public AbbreviatedConjugation activeParticiple(String activeParticiple) {
        setActiveParticiple(activeParticiple);
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

    public String getPassiveParticiple() {
        return passiveParticiple;
    }

    public void setPassiveParticiple(String passiveParticiple) {
        this.passiveParticiple = passiveParticiple;
    }

    public AbbreviatedConjugation passiveParticiple(String passiveParticipleMasculine) {
        setPassiveParticiple(passiveParticipleMasculine);
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
        return pastPassiveTense != null || presentPassiveTense != null || passiveParticiple != null;
    }

    @Deprecated
    public ActiveLine getActiveLine() {
        return activeLine;
    }

    @Deprecated
    public void setActiveLine(ActiveLine activeLine) {
        this.activeLine = activeLine;
    }

    @Deprecated
    public AbbreviatedConjugation activeLine(ActiveLine activeLine) {
        setActiveLine(activeLine);
        return this;
    }

    @Deprecated
    public PassiveLine getPassiveLine() {
        return passiveLine;
    }

    @Deprecated
    public void setPassiveLine(PassiveLine passiveLine) {
        this.passiveLine = passiveLine;
    }

    @Deprecated
    public AbbreviatedConjugation passiveLine(PassiveLine passiveLine) {
        setPassiveLine(passiveLine);
        return this;
    }

    @Deprecated
    public ImperativeAndForbiddingLine getImperativeAndForbiddingLine() {
        return imperativeAndForbiddingLine;
    }

    @Deprecated
    public void setImperativeAndForbiddingLine(ImperativeAndForbiddingLine imperativeAndForbiddingLine) {
        this.imperativeAndForbiddingLine = imperativeAndForbiddingLine;
    }

    @Deprecated
    public AbbreviatedConjugation imperativeAndForbiddingLine(ImperativeAndForbiddingLine imperativeAndForbiddingLine) {
        setImperativeAndForbiddingLine(imperativeAndForbiddingLine);
        return this;
    }

    @Deprecated
    public AdverbLine getAdverbLine() {
        return adverbLine;
    }

    @Deprecated
    public void setAdverbLine(AdverbLine adverbLine) {
        this.adverbLine = adverbLine;
    }

    @Deprecated
    public AbbreviatedConjugation adverbLine(AdverbLine adverbLine) {
        setAdverbLine(adverbLine);
        return this;
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{pastTense, presentTense, activeParticiple, pastPassiveTense,
                presentPassiveTense, passiveParticiple, imperative, forbidding, verbalNouns, adverbs});
    }
}
