/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.GenderType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NumberType;

/**
 * @author sali
 * 
 */
public class ParticleProperties extends AbstractProperties {

	private static final long serialVersionUID = 3916962887098806402L;

	@Override
	public void setGender(GenderType gender) {
		this.gender = null;
	}

	@Override
	public void setNumber(NumberType number) {
		this.number = null;
	}
}
