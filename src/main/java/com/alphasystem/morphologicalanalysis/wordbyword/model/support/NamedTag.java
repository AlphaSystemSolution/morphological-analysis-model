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
public enum NamedTag implements ArabicSupportEnum {

	NAME_OF_ALLAH(getWord(LAM, FA, DTHA, SPACE, ALIF, LAM, JEEM, LAM, ALIF,
			LAM, TA_MARBUTA));

	private final ArabicWord label;

	NamedTag(ArabicWord label) {
		this.label = label;
	}

	@Override
	public String getCode() {
		return name();
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
