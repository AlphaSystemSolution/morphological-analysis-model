/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model;

import com.alphasystem.morphologicalanalysis.model.support.GenderType;
import com.alphasystem.morphologicalanalysis.model.support.NumberType;

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
