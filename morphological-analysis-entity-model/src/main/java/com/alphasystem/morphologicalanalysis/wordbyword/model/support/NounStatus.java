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
public enum NounStatus implements ArabicSupportEnum {

	NOMINATIVE("Nominative", getWord(MEEM, RA, FA, WAW, AIN), getWord(RA, FA, AIN)),

	ACCUSATIVE("Accusative", getWord(MEEM, NOON, SAD, WAW, BA), getWord(NOON, SAD, BA)),

	GENITIVE("Genitive", getWord(MEEM, JEEM, RA, WAW, RA), getWord(JEEM, RA));

	private final String code;
	private final ArabicWord longLabel;
    private final ArabicWord shortLabel;

	/**
	 * @param code name of the status
	 * @param longLabel long label of status
     * @param shortLabel short label of status
	 */
	NounStatus(String code, ArabicWord longLabel, ArabicWord shortLabel) {
		this.code = code;
		this.longLabel = longLabel;
        this.shortLabel = shortLabel;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public ArabicWord toLabel() {
		return longLabel;
	}

    public ArabicWord getLongLabel() {
        return longLabel;
    }

    public ArabicWord getShortLabel() {
        return shortLabel;
    }

    @Override
	public String getName() {
		return name();
	}
}
