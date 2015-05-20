package com.alphasystem.morphologicalanalysis.model.support;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.KAF;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.RA;
import static com.alphasystem.arabic.model.ArabicLetterType.TA_MARBUTA;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

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
	private NounType(String code, ArabicWord label) {
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
