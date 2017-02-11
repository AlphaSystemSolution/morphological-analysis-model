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
public enum NounKind implements ArabicSupportEnum {

	ACTIVE_PARTICIPLE("Active participle", getWord(FA, ALIF, AIN, LAM)),

	PASSIVE_PARTICIPLE("Passive participle", getWord(MEEM, FA, AIN, WAW, LAM)),

	VERBAL_NOUN("Verbal noun", getWord(MEEM, SAD, DAL, RA)),

	ADJECTIVE("Adjective", getWord(SAD, FA, TA));

	private final String code;

	private final ArabicWord label;

	/**
	 * @param code
	 * @param label
	 */
	NounKind(String code, ArabicWord label) {
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
