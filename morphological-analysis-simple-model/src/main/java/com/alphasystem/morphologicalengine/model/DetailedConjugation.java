/**
 *
 */
package com.alphasystem.morphologicalengine.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.ArrayUtils;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DetailedConjugation {

    private VerbDetailedConjugationPair activeTensePair;

    private NounDetailedConjugationPair[] verbalNounPairs;

    private NounDetailedConjugationPair activeParticiplePair;

    private VerbDetailedConjugationPair passiveTensePair;

    private NounDetailedConjugationPair passiveParticiplePair;

    private VerbDetailedConjugationPair imperativeAndForbiddingPair;

    private NounDetailedConjugationPair[] adverbPairs;


    public VerbDetailedConjugationPair getActiveTensePair() {
        return activeTensePair;
    }

    public void setActiveTensePair(VerbDetailedConjugationPair activeTensePair) {
        this.activeTensePair = activeTensePair;
    }

    public DetailedConjugation activeTensePair(VerbDetailedConjugationPair activeTensePair) {
        setActiveTensePair(activeTensePair);
        return this;
    }

    public NounDetailedConjugationPair[] getVerbalNounPairs() {
        return verbalNounPairs;
    }

    public void setVerbalNounPairs(NounDetailedConjugationPair[] verbalNounPairs) {
        this.verbalNounPairs = verbalNounPairs;
    }

    public DetailedConjugation verbalNounPairs(NounDetailedConjugationPair... verbalNounPairs) {
        this.verbalNounPairs = ArrayUtils.addAll(this.verbalNounPairs, verbalNounPairs);
        return this;
    }

    public NounDetailedConjugationPair getActiveParticiplePair() {
        return activeParticiplePair;
    }

    public void setActiveParticiplePair(NounDetailedConjugationPair activeParticiplePair) {
        this.activeParticiplePair = activeParticiplePair;
    }

    public DetailedConjugation activeParticiplePair(NounDetailedConjugationPair activeParticiplePair) {
        setActiveParticiplePair(activeParticiplePair);
        return this;
    }

    public VerbDetailedConjugationPair getPassiveTensePair() {
        return passiveTensePair;
    }

    public void setPassiveTensePair(VerbDetailedConjugationPair passiveTensePair) {
        this.passiveTensePair = passiveTensePair;
    }

    public DetailedConjugation passiveTensePair(VerbDetailedConjugationPair passiveTensePair) {
        setPassiveTensePair(passiveTensePair);
        return this;
    }

    public NounDetailedConjugationPair getPassiveParticiplePair() {
        return passiveParticiplePair;
    }

    public void setPassiveParticiplePair(NounDetailedConjugationPair passiveParticiplePair) {
        this.passiveParticiplePair = passiveParticiplePair;
    }

    public DetailedConjugation passiveParticiplePair(NounDetailedConjugationPair passiveParticiplePair) {
        setPassiveParticiplePair(passiveParticiplePair);
        return this;
    }

    public VerbDetailedConjugationPair getImperativeAndForbiddingPair() {
        return imperativeAndForbiddingPair;
    }

    public void setImperativeAndForbiddingPair(VerbDetailedConjugationPair imperativeAndForbiddingPair) {
        this.imperativeAndForbiddingPair = imperativeAndForbiddingPair;
    }

    public DetailedConjugation imperativeAndForbiddingPair(VerbDetailedConjugationPair imperativeAndForbiddingPair) {
        setImperativeAndForbiddingPair(imperativeAndForbiddingPair);
        return this;
    }

    public NounDetailedConjugationPair[] getAdverbPairs() {
        return adverbPairs;
    }

    public void setAdverbPairs(NounDetailedConjugationPair[] adverbPairs) {
        this.adverbPairs = adverbPairs;
    }

    public DetailedConjugation adverbPairs(NounDetailedConjugationPair... adverbPairs) {
        this.adverbPairs = ArrayUtils.addAll(this.adverbPairs, adverbPairs);
        return this;
    }
}
