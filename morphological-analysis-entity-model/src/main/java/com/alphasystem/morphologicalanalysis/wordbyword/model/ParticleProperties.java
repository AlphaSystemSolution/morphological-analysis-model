/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.ParticlePartOfSpeechType;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sali
 * 
 */
@Entity
@Document
public class ParticleProperties extends AbstractProperties<ParticlePartOfSpeechType> {

	private static final long serialVersionUID = 3916962887098806402L;

	public ParticleProperties() {
		super();
	}

	/**
	 * @param src
	 * @throws NullPointerException
	 */
	public ParticleProperties(ParticleProperties src) throws NullPointerException {
		super(src);
	}

	@Override
	public void setGender(GenderType gender) {
		this.gender = null;
	}

	@Override
	public void setNumber(NumberType number) {
		this.number = null;
	}
}
