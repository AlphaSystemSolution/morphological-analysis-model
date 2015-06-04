package com.alphasystem.morphologicalanalysis.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 */
public enum EmptyNodeType implements ArabicSupportEnum {

    NOMINATIVE_NOUN("Nominative Noun", "#000080",
            getWord(ALIF_HAMZA_BELOW, SEEN, MEEM, SPACE, MEEM, RA, FA, WAW, AIN));

    private static final String DEFAULT_COLOR = "#000000";

    private final String code;

    private final String colorCode;

    private final ArabicWord label;

    EmptyNodeType(String code, ArabicWord label) {
        this(code, null, label);
    }

    EmptyNodeType(String code, String colorCode, ArabicWord label) {
        this.code = code;
        this.colorCode = isBlank(colorCode) ? DEFAULT_COLOR : colorCode;
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

    public String getColorCode() {
        return colorCode;
    }

    @Override
    public String getName() {
        return name();
    }
}
