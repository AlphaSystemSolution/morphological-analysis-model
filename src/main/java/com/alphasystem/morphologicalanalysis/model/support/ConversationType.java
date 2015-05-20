/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model.support;

import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.BA;
import static com.alphasystem.arabic.model.ArabicLetterType.GHAIN;
import static com.alphasystem.arabic.model.ArabicLetterType.KAF;
import static com.alphasystem.arabic.model.ArabicLetterType.KHA;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.TA;
import static com.alphasystem.arabic.model.ArabicLetterType.TTA;
import static com.alphasystem.arabic.model.ArabicLetterType.YA_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

/**
 * @author sali
 * 
 */
public enum ConversationType implements ArabicSupportEnum {

	THIRD_PERSON("Third person", getWord(GHAIN, ALIF, YA_HAMZA_ABOVE, BA)),

	SECOND_PERSON("Second person", getWord(MEEM, KHA, ALIF, TTA, BA)),

	FIRST_PERSON("First person", getWord(MEEM, TA, KAF, LAM, MEEM));

	private final String code;

	private final ArabicWord label;

	/**
	 * @param code
	 * @param label
	 */
	private ConversationType(String code, ArabicWord label) {
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
