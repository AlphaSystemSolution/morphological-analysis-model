/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model.support;

import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.SAD;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

import com.alphasystem.arabic.model.ArabicLetterType;
import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

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
	private ProNounType(String code, ArabicWord label) {
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
