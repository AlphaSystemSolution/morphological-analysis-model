/**
 *
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;
import org.apache.commons.lang3.StringUtils;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 */
public enum RelationshipType implements ArabicSupportEnum {

    NONE(ArabicLetters.WORD_SPACE),

    MUDAF(getWord(MEEM, DDAD, ALIF, FA)),

    MUDAF_ILAIH(getWord(MEEM, DDAD, ALIF, FA, SPACE, ALIF_HAMZA_BELOW, LAM, YA,
            HA), "#4AA02C"),

    IDAFAH(getWord(ALIF_HAMZA_BELOW, DDAD, ALIF, FA, TA_MARBUTA), "#336633"),

    MOWSOOF(getWord(MEEM, WAW, SAD, WAW, FA)),

    SIFAH(getWord(SAD, FA, TA_MARBUTA), "#993838"),

    JAR_MAJROOR(getWord(JEEM, ALIF, RA, SPACE, WAW, SPACE, MEEM, JEEM, RA, WAW, RA), "#DC381F"),

    MAJROOR(getWord(MEEM, JEEM, RA, WAW, RA), "#8D38C9"),

    SILLAH(getWord(SAD, LAM, TA_MARBUTA), "#6DEF9B"),

    MUBTADA(getWord(MEEM, BA, TA, DAL, ALIF_HAMZA_ABOVE)),

    KHABAR(getWord(KHA, BA, RA), "#0041C2"),

    MUTALIQ(getWord(MEEM, TA, AIN, LAM, QAF), "#3BB9FF"),

    ISM(getWord(ALIF_HAMZA_BELOW, SEEN, MEEM), "#800000"),

    FAIIL(getWord(FA, ALIF, AIN, LAM), "#4C5F6A"),

    MAFOOL(getWord(MEEM, FA, AIN, WAW, LAM), "#FF8040"),

    MAFOOL_BHI(getWord(MEEM, FA, AIN, WAW, LAM, SPACE, BA, HA), "#FF8040"),

    MAFOOL_FIHI(getWord(MEEM, FA, AIN, WAW, LAM, SPACE, FA, YA, HA), "#FF8040"),

    //
    ;

    private final ArabicWord label;
    private final String colorCode;

    RelationshipType(ArabicWord label) {
        this(label, null);
    }

    RelationshipType(ArabicWord label, String colorCode) {
        this.label = label;
        this.colorCode = StringUtils.isBlank(colorCode) ? "#000000" : colorCode;

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

    public String getColorCode() {
        return colorCode;
    }
}
