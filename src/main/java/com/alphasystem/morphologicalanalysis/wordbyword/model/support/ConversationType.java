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
	ConversationType(String code, ArabicWord label) {
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
