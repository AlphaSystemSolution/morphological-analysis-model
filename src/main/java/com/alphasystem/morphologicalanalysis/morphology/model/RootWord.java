//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.01 at 04:51:01 PM EDT 
//

package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.arabic.model.ArabicLetter;
import com.alphasystem.arabic.model.ArabicLetterType;
import com.alphasystem.arabic.model.ArabicSupport;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.morphology.model.support.SarfTermType;
import com.alphasystem.persistence.model.AbstractDocument;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.arabic.model.ArabicWord.fromUnicode;
import static com.alphasystem.util.AppUtil.isGivenType;
import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 */
@Document
@TypeAlias("RootWord")
public class RootWord extends AbstractDocument implements ArabicSupport {

    protected int firstRadicalIndex = 0;
    protected int secondRadicalIndex = 1;
    protected int thirdRadicalIndex = 2;
    protected int fourthRadicalIndex = -1;
    protected SarfTermType sarfTermType;
    protected String rootWordValue;
    protected String baseRootWordValue;

    @Transient
    private ArabicWord rootWord;
    @Transient
    private ArabicWord baseWord;
    @Transient
    private ArabicLetter firstRadical;
    @Transient
    private ArabicLetter secondRadical;
    @Transient
    private ArabicLetter thirdRadical;
    @Transient
    private ArabicLetter fourthRadical;

    /**
     * Default constructor
     */
    @PersistenceConstructor
    public RootWord() {
        this(null);
    }

    /**
     * Copy constructor to copy values from given source root word
     *
     * @param src source root word to copy value from
     */
    public RootWord(RootWord src) {
        this(src, null, null, null);
    }

    /**
     * Copy constructor to copy values from given source root word and replacing radicals with given values.
     *
     * @param src           source root word to copy value from
     * @param firstRadical  first radical to replace
     * @param secondRadical second radical to replace
     * @param thirdRadical  third radical to replace
     */
    public RootWord(RootWord src, ArabicLetterType firstRadical,
                    ArabicLetterType secondRadical, ArabicLetterType thirdRadical) {
        this(src, firstRadical, secondRadical, thirdRadical, null);
    }

    /**
     * Copy constructor to copy values from given source root word and replacing radicals with given values.
     *
     * @param src           source root word to copy value from
     * @param firstRadical  first radical to replace
     * @param secondRadical second radical to replace
     * @param thirdRadical  third radical to replace
     * @param fourthRadical fourth radical to replace
     */
    public RootWord(RootWord src, ArabicLetterType firstRadical,
                    ArabicLetterType secondRadical, ArabicLetterType thirdRadical,
                    ArabicLetterType fourthRadical) {
        if (src != null) {
            setRootWordValue(src.getRootWordValue());
            setBaseRootWordValue(src.getBaseRootWordValue());
            setRootWord(new ArabicWord(src.getRootWord()));
            setBaseWord(new ArabicWord(src.getBaseWord()));
            setFirstRadicalIndex(src.getFirstRadicalIndex());
            setSecondRadicalIndex(src.getSecondRadicalIndex());
            setThirdRadicalIndex(src.getThirdRadicalIndex());
            setFourthRadicalIndex(src.getFourthRadicalIndex());
            setSarfTermType(src.getSarfTermType());
        }
        if (firstRadical != null && secondRadical != null
                && thirdRadical != null) {
            setRootWord(replaceLetters(getRootWord(), firstRadical, firstRadicalIndex, secondRadical,
                    secondRadicalIndex, thirdRadical, thirdRadicalIndex, fourthRadical, fourthRadicalIndex));
            setBaseWord(replaceLetters(getBaseWord(), firstRadical, firstRadicalIndex, secondRadical,
                    secondRadicalIndex, thirdRadical, thirdRadicalIndex, fourthRadical, fourthRadicalIndex));
        }
    }

    public static ArabicWord replaceLetters(ArabicWord src,
                                            ArabicLetterType firstRadical, int firstRadicalIndex,
                                            ArabicLetterType secondRadical, int secondRadicalIndex,
                                            ArabicLetterType thirdRadical, int thirdRadicalIndex,
                                            ArabicLetterType fourthRadical, int fourthRadicalIndex) {
        if (src == null) {
            return null;
        }
        ArabicWord arabicWord = new ArabicWord(src)
                .replaceLetter(firstRadicalIndex, firstRadical)
                .replaceLetter(secondRadicalIndex, secondRadical)
                .replaceLetter(thirdRadicalIndex, thirdRadical);
        if (fourthRadicalIndex > -1 && fourthRadical != null) {
            arabicWord = arabicWord.replaceLetter(fourthRadicalIndex,
                    fourthRadical);
        }
        return arabicWord;
    }

    private static String getValue(ArabicLetter arabicLetter) {
        return (arabicLetter == null) ? "" : arabicLetter.toUnicode();
    }

    private boolean compare(ArabicLetter l1, ArabicLetter l2) {
        boolean result = false;
        if (l1 == null && l2 == null) {
            result = true;
        } else if (l1 != null && l2 != null) {
            result = l1.equals(l2);
        }
        return result;
    }

    private boolean compare(Integer l1, Integer l2) {
        boolean result = false;
        if (l1 == null && l2 == null) {
            result = true;
        } else if (l1 != null && l2 != null) {
            result = l1.equals(l2);
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = super.equals(obj);
        if (isGivenType(RootWord.class, obj)) {
            RootWord o = (RootWord) obj;
            result = compare(getFirstRadical(), o.getFirstRadical())
                    && compare(getFirstRadicalIndex(), o.getFirstRadicalIndex())
                    && compare(getSecondRadical(), o.getSecondRadical())
                    && compare(getSecondRadicalIndex(), o.getSecondRadicalIndex())
                    && compare(getThirdRadical(), o.getThirdRadical())
                    && compare(getThirdRadicalIndex(), o.getThirdRadicalIndex())
                    && compare(getFourthRadical(), o.getFourthRadical())
                    && compare(getFourthRadicalIndex(), o.getFourthRadicalIndex());
        }
        return result;
    }

    public ArabicWord getBaseWord() {
        if (baseWord == null && !isBlank(baseRootWordValue)) {
            baseWord = fromUnicode(baseRootWordValue);
        }
        return baseWord;
    }

    public void setBaseWord(ArabicWord baseWord) {
        this.baseWord = baseWord;
    }

    public ArabicLetter getFirstRadical() {
        if (firstRadical == null) {
            firstRadical = getLetter(firstRadicalIndex);
        }
        return firstRadical;
    }

    public void setFirstRadical(ArabicLetter firstRadical) {
        this.firstRadical = firstRadical;
    }

    /**
     * Gets the value of the firstRadicalIndex property.
     */
    public int getFirstRadicalIndex() {
        return firstRadicalIndex;
    }

    /**
     * Sets the value of the firstRadicalIndex property.
     */
    public void setFirstRadicalIndex(int value) {
        this.firstRadicalIndex = (value < 0) ? 0 : value;
        setFirstRadical(null);
    }

    public ArabicLetter getSecondRadical() {
        if (secondRadical == null) {
            secondRadical = getLetter(secondRadicalIndex);
        }
        return secondRadical;
    }

    public void setSecondRadical(ArabicLetter secondRadical) {
        this.secondRadical = secondRadical;
    }

    /**
     * Gets the value of the secondRadicalIndex property.
     */
    public int getSecondRadicalIndex() {
        return secondRadicalIndex;
    }

    /**
     * Sets the value of the secondRadicalIndex property.
     */
    public void setSecondRadicalIndex(int value) {
        this.secondRadicalIndex = (value <= 0) ? 1 : value;
        setSecondRadical(null);
    }

    public ArabicLetter getThirdRadical() {
        if (thirdRadical == null) {
            thirdRadical = getLetter(thirdRadicalIndex);
        }
        return thirdRadical;
    }

    public void setThirdRadical(ArabicLetter thirdRadical) {
        this.thirdRadical = thirdRadical;
    }

    /**
     * Gets the value of the thirdRadicalIndex property.
     */
    public int getThirdRadicalIndex() {
        return thirdRadicalIndex;
    }

    /**
     * Sets the value of the thirdRadicalIndex property.
     */
    public void setThirdRadicalIndex(int value) {
        this.thirdRadicalIndex = (value <= 1) ? 2 : value;
        setThirdRadical(null);
    }

    public ArabicLetter getFourthRadical() {
        if (fourthRadicalIndex > -1 && fourthRadical == null) {
            fourthRadical = getLetter(fourthRadicalIndex);
        }
        return fourthRadical;
    }

    public void setFourthRadical(ArabicLetter fourthRadical) {
        this.fourthRadical = fourthRadical;
    }

    /**
     * Gets the value of the fourthRadicalIndex property.
     */
    public int getFourthRadicalIndex() {
        return fourthRadicalIndex;
    }

    /**
     * Sets the value of the fourthRadicalIndex property.
     */
    public void setFourthRadicalIndex(int value) {
        this.fourthRadicalIndex = value;
        setFourthRadical(null);
    }

    public String getBaseRootWordValue() {
        return baseRootWordValue;
    }

    public void setBaseRootWordValue(String baseRootWordValue) {
        this.baseRootWordValue = baseRootWordValue;
    }

    public String getRootWordValue() {
        return rootWordValue;
    }

    public void setRootWordValue(String rootWordValue) {
        this.rootWordValue = rootWordValue;
    }

    private ArabicLetter getLetter(int index) {
        ArabicWord rootWord = getRootWord();
        if (index < 0 || index >= rootWord.getLength()) {
            return null;
        }
        return rootWord.getLetter(index);
    }

    public ArabicWord getRootWord() {
        if (rootWord == null && !isBlank(rootWordValue)) {
            rootWord = fromUnicode(rootWordValue);
        }
        return rootWord;
    }

    public void setRootWord(ArabicWord rootWord) {
        this.rootWord = rootWord;
    }

    /**
     * Gets the value of the sarfTermType property.
     *
     * @return possible object is {@link SarfTermType }
     */
    public SarfTermType getSarfTermType() {
        return sarfTermType;
    }

    /**
     * Sets the value of the sarfTermType property.
     *
     * @param value allowed object is {@link SarfTermType }
     */
    public void setSarfTermType(SarfTermType value) {
        this.sarfTermType = value;
    }

    public boolean isTriLiteral() {
        return fourthRadical == null;
    }

    @Override
    public ArabicWord getLabel() {
        return getRootWord();
    }

    @Override
    public void initDisplayName() {
        String displayName = String.format("%s %s %s %s", getValue(firstRadical), getValue(secondRadical),
                getValue(thirdRadical), getValue(fourthRadical));
        if (isBlank(displayName.trim())) {
            super.initDisplayName();
        } else {
            setDisplayName(displayName);
        }
    }

    @Override
    public String toString() {
        return format("%s - {%s}", sarfTermType, rootWord.toBuckWalter());
    }

    public RootWord withFirstRadicalIndex(int value) {
        setFirstRadicalIndex(value);
        return this;
    }

    public RootWord withFourthRadicalIndex(int value) {
        setFourthRadicalIndex(value);
        return this;
    }

    public RootWord withSarfTermType(SarfTermType value) {
        setSarfTermType(value);
        return this;
    }

    public RootWord withSecondRadicalIndex(int value) {
        setSecondRadicalIndex(value);
        return this;
    }

    public RootWord withThirdRadicalIndex(int value) {
        setThirdRadicalIndex(value);
        return this;
    }

    public RootWord withRootWord(ArabicWord value) {
        if (value != null) {
            setRootWord(value);
            rootWordValue = value.toUnicode();
        }
        return this;
    }

    public RootWord withBaseWord(ArabicWord value) {
        if (value != null) {
            setBaseWord(value);
            baseRootWordValue = value.toUnicode();
        }
        return this;
    }

}