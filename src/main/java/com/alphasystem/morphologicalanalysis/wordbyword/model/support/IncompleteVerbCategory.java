package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum IncompleteVerbCategory implements ArabicSupportEnum {

    KANA_AND_ITS_SISTERS("Kana and its sisters", KanaAndSisters.class, KanaFamily.values(),
            getWord(KAF, ALIF, NOON, SPACE, WAW, SPACE, ALIF_HAMZA_ABOVE, KHA, WAW, ALIF, TA, HA, ALIF));

    private final String code;
    private final ArabicWord label;
    private final IncompleteVerbType[] members;
    private final Class<?> typeClassName;

    IncompleteVerbCategory(String code, Class<?> typeClassName, IncompleteVerbType[] members, ArabicWord label) {
        this.code = code;
        this.typeClassName = typeClassName;
        this.members = members;
        this.label = label;
    }

    public Class<?> getTypeClassName() {
        return typeClassName;
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
