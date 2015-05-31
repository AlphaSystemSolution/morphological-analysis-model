/**
 *
 */
package com.alphasystem.morphologicalanalysis.model.support;

import com.alphasystem.arabic.model.ArabicLetter;
import com.alphasystem.arabic.model.ArabicLetters;
import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;
import org.apache.commons.lang3.StringUtils;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;
import static com.alphasystem.arabic.model.DiacriticType.SHADDA;

/**
 * @author sali
 */
public enum GrammaticalRelationship implements ArabicSupportEnum {

    NONE(ArabicLetters.WORD_SPACE),

    MUDAF(getWord(MEEM, DDAD, ALIF, FA)),

    MUDAF_ILAIH(getWord(MEEM, DDAD, ALIF, FA, SPACE, ALIF_HAMZA_BELOW, LAM, YA,
            HA), "#4AA02C"),

    MOWSOOF(getWord(MEEM, WAW, SAD, WAW, FA)),

    SIFAH(getWord(SAD, FA, TA_MARBUTA), "#F6F6F6"),

    JAR_MAJROOR(getWord(JEEM, ALIF, RA, SPACE, WAW, SPACE, MEEM, JEEM, RA, WAW, RA), "#DC381F"),

    MAJROOR(getWord(MEEM, JEEM, RA, WAW, RA), "#8D38C9"),

    ISM_INNA(getWord(new ArabicLetter(ALIF_HAMZA_BELOW), new ArabicLetter(SEEN), new ArabicLetter(MEEM),
            new ArabicLetter(SPACE), new ArabicLetter(LEFT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK),
            new ArabicLetter(SPACE), new ArabicLetter(ALIF_HAMZA_BELOW), new ArabicLetter(NOON, SHADDA),
            new ArabicLetter(SPACE), new ArabicLetter(RIGHT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK)), "#800000"),

    KHABAR_INNA(getWord(new ArabicLetter(KHA), new ArabicLetter(BA), new ArabicLetter(RA),
            new ArabicLetter(SPACE),new ArabicLetter(LEFT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK),
            new ArabicLetter(SPACE), new ArabicLetter(ALIF_HAMZA_BELOW), new ArabicLetter(NOON, SHADDA),
            new ArabicLetter(SPACE), new ArabicLetter(RIGHT_POINTING_DOUBLE_ANGLE_QUOTATION_MARK)), "#008080"),

    MUTALIQ(getWord(MEEM, TA, AIN, LAM, QAF), "#3BB9FF")

    //
    ;

    private final ArabicWord label;
    private final String colorCode;

    GrammaticalRelationship(ArabicWord label) {
        this(label, null);
    }

    GrammaticalRelationship(ArabicWord label, String colorCode) {
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
