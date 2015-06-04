/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

/**
 * @author sali
 * 
 */
public enum LocationType implements ArabicSupportEnum {

	PREFIX, STEM, SUFFIX;

	@Override
	public String getCode() {
		return name();
	}

	@Override
	public ArabicWord getLabel() {
		return null;
	}

	@Override
	public String getName() {
		return name();
	}
}
