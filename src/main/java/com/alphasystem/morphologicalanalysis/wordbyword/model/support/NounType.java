package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 * 
 */
public enum NounType implements ArabicSupportEnum {

	INDEFINITE("Indefinite", getWord(NOON, KAF, RA, TA_MARBUTA)),

	DEFINITE("Definite", getWord(MEEM, AIN, RA, FA, TA_MARBUTA));

	private final String code;

	private final ArabicWord label;

	/**
	 * @param code
	 * @param label
	 */
	NounType(String code, ArabicWord label) {
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
