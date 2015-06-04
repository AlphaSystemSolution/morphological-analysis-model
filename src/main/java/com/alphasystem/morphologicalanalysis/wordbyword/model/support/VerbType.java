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
public enum VerbType implements ArabicSupportEnum {

	PERFECT("Perfect", getWord(MEEM, ALIF, DDAD)),

	IMPERFECT("Imperfect", getWord(MEEM, DDAD, ALIF, RA, AIN)),

	PERFECT_PASSIVE("Perfect passive", getWord(MEEM, ALIF, DDAD, SPACE, MEEM, BA,
			NOON, YA, SPACE, ALIF, LAM, LAM, MEEM, JEEM, HA, WAW, LAM)),

	IMPERFECT_PASSIVE("Imperfect passive",
			getWord(MEEM, DDAD, ALIF, RA, AIN, SPACE, MEEM, BA, NOON, YA,
					SPACE, ALIF, LAM, LAM, MEEM, JEEM, HA, WAW, LAM)),

	COMMAND("Imperative", getWord(ALIF_HAMZA_ABOVE, MEEM, RA));

	private final String code;

	private final ArabicWord label;

	/**
	 * @param code
	 * @param label
	 */
	VerbType(String code, ArabicWord label) {
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
