/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model.support;

import static com.alphasystem.arabic.model.ArabicLetterType.ALIF;
import static com.alphasystem.arabic.model.ArabicLetterType.DTHA;
import static com.alphasystem.arabic.model.ArabicLetterType.FA;
import static com.alphasystem.arabic.model.ArabicLetterType.JEEM;
import static com.alphasystem.arabic.model.ArabicLetterType.LAM;
import static com.alphasystem.arabic.model.ArabicLetterType.SPACE;
import static com.alphasystem.arabic.model.ArabicLetterType.TA_MARBUTA;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

/**
 * @author sali
 * 
 */
public enum NamedTag implements ArabicSupportEnum {

	NAME_OF_ALLAH(getWord(LAM, FA, DTHA, SPACE, ALIF, LAM, JEEM, LAM, ALIF,
			LAM, TA_MARBUTA));

	private final ArabicWord label;

	private NamedTag(ArabicWord label) {
		this.label = label;
	}

	@Override
	public String getCode() {
		return name();
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
