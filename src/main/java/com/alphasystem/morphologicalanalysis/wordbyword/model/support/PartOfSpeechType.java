package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;

/**
 * @author sali
 */
public interface PartOfSpeechType extends ArabicSupportEnum {

    String DEFAULT_COLOR = "#000000";

    String getColorCode();
}
