package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 * 
 */
public enum NumberType implements ArabicSupportEnum {

	SINGULAR("Singular", getWord(MEEM, FA, RA, DAL)),

	DUAL("Dual", getWord(MEEM, THA, NOON, YA)),

	PLURAL("Plural", getWord(JEEM, MEEM, AIN));

	private final String code;

	private final ArabicWord label;

	/**
	 * @param code
	 * @param label
	 */
	NumberType(String code, ArabicWord label) {
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
