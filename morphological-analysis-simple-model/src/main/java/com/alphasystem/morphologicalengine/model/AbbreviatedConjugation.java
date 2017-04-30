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
	private AbbreviatedRecord pastTense;
	private AbbreviatedRecord presentTense;
	private AbbreviatedRecord activeParticipleMasculine;
	private AbbreviatedRecord activeParticipleFeminine;

	// default passive values
	private AbbreviatedRecord pastPassiveTense;
	private AbbreviatedRecord presentPassiveTense;
	private AbbreviatedRecord passiveParticipleMasculine;
	private AbbreviatedRecord passiveParticipleFeminine;

	// default imperative and forbidden values
	private AbbreviatedRecord imperative;
	private AbbreviatedRecord forbidding;

	// default verbal noun values
	private AbbreviatedRecord[] verbalNouns;

	// default adverb values
	private AbbreviatedRecord[] adverbs;

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

	public AbbreviatedRecord getPastTense() {
		return pastTense;
	}

	public void setPastTense(AbbreviatedRecord pastTense) {
		this.pastTense = pastTense;
	}

	public AbbreviatedRecord getPresentTense() {
		return presentTense;
	}

	public void setPresentTense(AbbreviatedRecord presentTense) {
		this.presentTense = presentTense;
	}

	public AbbreviatedRecord[] getVerbalNouns() {
		return verbalNouns;
	}

	public void setVerbalNouns(AbbreviatedRecord[] verbalNouns) {
		this.verbalNouns = verbalNouns;
	}

	public AbbreviatedRecord getActiveParticipleMasculine() {
		return activeParticipleMasculine;
	}

	public void setActiveParticipleMasculine(AbbreviatedRecord activeParticipleMasculine) {
		this.activeParticipleMasculine = activeParticipleMasculine;
	}

	public AbbreviatedRecord getActiveParticipleFeminine() {
		return activeParticipleFeminine;
	}

	public void setActiveParticipleFeminine(AbbreviatedRecord activeParticipleFeminine) {
		this.activeParticipleFeminine = activeParticipleFeminine;
	}

	public AbbreviatedRecord getPastPassiveTense() {
		return pastPassiveTense;
	}

	public void setPastPassiveTense(AbbreviatedRecord pastPassiveTense) {
		this.pastPassiveTense = pastPassiveTense;
	}

	public AbbreviatedRecord getPresentPassiveTense() {
		return presentPassiveTense;
	}

	public void setPresentPassiveTense(AbbreviatedRecord presentPassiveTense) {
		this.presentPassiveTense = presentPassiveTense;
	}

	public AbbreviatedRecord getPassiveParticipleMasculine() {
		return passiveParticipleMasculine;
	}

	public void setPassiveParticipleMasculine(AbbreviatedRecord passiveParticipleMasculine) {
		this.passiveParticipleMasculine = passiveParticipleMasculine;
	}

	public AbbreviatedRecord getPassiveParticipleFeminine() {
		return passiveParticipleFeminine;
	}

	public void setPassiveParticipleFeminine(AbbreviatedRecord passiveParticipleFeminine) {
		this.passiveParticipleFeminine = passiveParticipleFeminine;
	}

	public AbbreviatedRecord getImperative() {
		return imperative;
	}

	public void setImperative(AbbreviatedRecord imperative) {
		this.imperative = imperative;
	}

	public AbbreviatedRecord getForbidding() {
		return forbidding;
	}

	public void setForbidding(AbbreviatedRecord forbidding) {
		this.forbidding = forbidding;
	}

	public AbbreviatedRecord[] getAdverbs() {
		return adverbs;
	}

	public void setAdverbs(AbbreviatedRecord[] adverbs) {
		this.adverbs = adverbs;
	}

	public boolean hasPassiveLine() {
		return pastPassiveTense != null || presentPassiveTense != null || passiveParticipleMasculine != null;
	}

	@Override
	public int hashCode() {
		Object[] values = new Object[]{pastTense, presentTense, activeParticipleMasculine, pastPassiveTense,
				presentPassiveTense, passiveParticipleMasculine, imperative, forbidding};
		if (!ArrayUtils.isEmpty(verbalNouns)) {
			values = ArrayUtils.addAll(values, verbalNouns);
		}
		if (!ArrayUtils.isEmpty(adverbs)) {
			values = ArrayUtils.addAll(values, adverbs);
		}
		return Arrays.deepHashCode(values);
	}
}
