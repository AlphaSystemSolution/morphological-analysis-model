/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model.support;

import static com.alphasystem.arabic.model.ArabicLetterType.KAF;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.RA;
import static com.alphasystem.arabic.model.ArabicLetterType.THA;
import static com.alphasystem.arabic.model.ArabicLetterType.THAL;
import static com.alphasystem.arabic.model.ArabicLetterType.WAW_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

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
	private GenderType(String code, ArabicWord label) {
		this.code = code;
		this.label = label;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public ArabicWord getLabel() {
		return label;
	}

	@Override
	public String getName() {
		return name();
	}
}
