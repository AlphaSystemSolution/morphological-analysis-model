package com.alphasystem.morphologicalanalysis.model.support;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.DAL;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.JEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.RA;
import static com.alphasystem.arabic.model.ArabicLetterType.THA;
import static com.alphasystem.arabic.model.ArabicLetterType.YA;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

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
	private NumberType(String code, ArabicWord label) {
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
