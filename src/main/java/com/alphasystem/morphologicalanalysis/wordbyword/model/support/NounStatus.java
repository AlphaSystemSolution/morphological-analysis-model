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
public enum NounStatus implements ArabicSupportEnum {

	NOMINATIVE("Nominative", getWord(MEEM, RA, FA, WAW, AIN)),

	ACCUSATIVE("Accusative", getWord(MEEM, NOON, SAD, WAW, BA)),

	GENETIVE("Genitive", getWord(MEEM, JEEM, RA, WAW, RA));

	private final String code;

	private final ArabicWord label;

	/**
	 * @param code
	 * @param label
	 */
	NounStatus(String code, ArabicWord label) {
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
