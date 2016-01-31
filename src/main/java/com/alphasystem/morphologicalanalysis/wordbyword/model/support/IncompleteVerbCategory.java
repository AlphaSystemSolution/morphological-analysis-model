package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicLetters.WORD_SPACE;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum IncompleteVerbCategory implements ArabicSupportEnum {

    DUMMY("", Dummy.class, DummyFamily.values(), WORD_SPACE),
    KANA_AND_ITS_SISTERS("Kana and its sisters", KanaAndSisters.class, KanaFamily.values(),
            getWord(KAF, ALIF, NOON, SPACE, WAW, SPACE, ALIF_HAMZA_ABOVE, KHA, WAW, ALIF, TA, HA, ALIF));

    private final String code;
    private final ArabicWord label;
    private final IncompleteVerbType[] members;
    private final Class<? extends IncompleteVerb> categoryClassName;

    IncompleteVerbCategory(String code, Class<? extends IncompleteVerb> categoryClassName,
                           IncompleteVerbType[] members, ArabicWord label) {
        this.code = code;
        this.categoryClassName = categoryClassName;
        this.members = members;
        this.label = label;
    }

    public IncompleteVerbType[] getMembers() {
        return members;
    }

    public Class<? extends IncompleteVerb> getCategoryClassName() {
        return categoryClassName;
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
