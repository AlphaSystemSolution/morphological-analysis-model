/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType;
import com.querydsl.core.annotations.QueryEntity;

/**
 * @author sali
 * 
 */
@QueryEntity
public class ParticleProperties extends AbstractProperties {

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
