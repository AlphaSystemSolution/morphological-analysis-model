/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 * 
 */
public enum GenderType implements ArabicSupportEnum {

	MASCULINE("Masculine", getWord(MEEM, THAL, KAF, RA)),

	FEMININE("Feminine", getWord(MEEM, WAW_HAMZA_ABOVE, NOON, THA));

	private final String code;

	private final ArabicWord label;

	/**
	 * @param code
	 * @param label
	 */
	GenderType(String code, ArabicWord label) {
		this.code = code;
		this.label = label;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public ArabicWord toLabel() {
		return label;
	}

	@Override
	public String getName() {
		return name();
	}
}
