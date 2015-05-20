/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model;

import static com.alphasystem.morphologicalanalysis.model.support.GenderType.MASCULINE;
import static com.alphasystem.morphologicalanalysis.model.support.NumberType.SINGULAR;

import org.springframework.data.annotation.Transient;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.model.support.GenderType;
import com.alphasystem.morphologicalanalysis.model.support.NumberType;
import com.alphasystem.persistence.mongo.model.AbstractDocument;

/**
 * @author sali
 * 
 */
public abstract class AbstractProperties extends AbstractDocument {

	private static final long serialVersionUID = 8386413187448630570L;

	public static boolean isNoun(AbstractProperties properties) {
		return properties != null
				&& NounProperties.class.isAssignableFrom(properties.getClass());
	}

	public static boolean isParticle(AbstractProperties properties) {
		return properties == null
				|| ParticleProperties.class.isAssignableFrom(properties
						.getClass());
	}

	public static boolean isPronoun(AbstractProperties properties) {
		return properties != null
				&& ProNounProperties.class.isAssignableFrom(properties
						.getClass());
	}

	public static boolean isVerb(AbstractProperties properties) {
		return properties != null
				&& VerbProperties.class.isAssignableFrom(properties.getClass());
	}

	protected NumberType number;

	protected GenderType gender;

	protected AbstractProperties() {
		setNumber(null);
		setGender(null);
	}

	public GenderType getGender() {
		return gender;
	}

	@Transient
	public ArabicWord getLabel() {
		return null;
	}

	public NumberType getNumber() {
		return number;
	}

	public void setGender(GenderType gender) {
		this.gender = gender == null ? MASCULINE : gender;
	}

	public void setNumber(NumberType number) {
		this.number = number == null ? SINGULAR : number;
	}

	public AbstractProperties withGenderType(GenderType gender) {
		setGender(gender);
		return this;
	}

	public AbstractProperties withNumberType(NumberType number) {
		setNumber(number);
		return this;
	}
}
