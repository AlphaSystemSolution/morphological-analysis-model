/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model.support;

import static com.alphasystem.arabic.model.ArabicLetterType.AIN;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.ALIF_HAMZA_ABOVE;
import static com.alphasystem.arabic.model.ArabicLetterType.BA;
import static com.alphasystem.arabic.model.ArabicLetterType.DDAD;
import static com.alphasystem.arabic.model.ArabicLetterType.HA;
import static com.alphasystem.arabic.model.ArabicLetterType.JEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.MEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.NOON;
import static com.alphasystem.arabic.model.ArabicLetterType.RA;
import static com.alphasystem.arabic.model.ArabicLetterType.SPACE;
import static com.alphasystem.arabic.model.ArabicLetterType.WAW;
import static com.alphasystem.arabic.model.ArabicLetterType.YA;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

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
	private VerbType(String code, ArabicWord label) {
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
