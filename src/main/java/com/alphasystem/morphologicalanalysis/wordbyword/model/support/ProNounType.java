/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicLetterType;
import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 * 
 */
public enum ProNounType implements ArabicSupportEnum {

	DETACHED("Detached", getWord(MEEM, NOON, FA, SAD, LAM)),

	ATTACHED("Attached", getWord(MEEM, ArabicLetterType.TA, SAD, LAM));

	private final String code;

	private final ArabicWord label;

	/**
	 * @param code
	 * @param label
	 */
	ProNounType(String code, ArabicWord label) {
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
