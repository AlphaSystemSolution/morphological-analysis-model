/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model.support;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.DAL;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.RA;
import static com.alphasystem.arabic.model.ArabicLetterType.SAD;
import static com.alphasystem.arabic.model.ArabicLetterType.TA;
import static com.alphasystem.arabic.model.ArabicLetterType.WAW;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

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
	private NounKind(String code, ArabicWord label) {
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
