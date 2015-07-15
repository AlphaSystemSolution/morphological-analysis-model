/**
 *
 */
package com.alphasystem.sarfengine.xml.model;

import com.alphasystem.arabic.model.ArabicLetterType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author sali
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootLetters", propOrder = {"firstRadical", "secondRadical",
        "thirdRadical", "fourthRadical"})
public class RootLetters {

    @XmlElement(required = true)
    protected ArabicLetterType firstRadical;
    @XmlElement(required = true)
    protected ArabicLetterType secondRadical;
    @XmlElement(required = true)
    protected ArabicLetterType thirdRadical;
    protected ArabicLetterType fourthRadical;

    public ArabicLetterType getFirstRadical() {
        return firstRadical;
    }

    public void setFirstRadical(ArabicLetterType firstRadical) {
        this.firstRadical = firstRadical;
    }

    public ArabicLetterType getFourthRadical() {
        return fourthRadical;
    }

    public void setFourthRadical(ArabicLetterType fourthRadical) {
        this.fourthRadical = fourthRadical;
    }

    public ArabicLetterType getSecondRadical() {
        return secondRadical;
    }

    public void setSecondRadical(ArabicLetterType secondRadical) {
        this.secondRadical = secondRadical;
    }

    public ArabicLetterType getThirdRadical() {
        return thirdRadical;
    }

    public void setThirdRadical(ArabicLetterType thirdRadical) {
        this.thirdRadical = thirdRadical;
    }

    private String getValue(ArabicLetterType arabicLetterType) {
        return arabicLetterType == null ? "" : Character.valueOf(
                arabicLetterType.getUnicode()).toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getValue(firstRadical)).append(" ")
                .append(getValue(secondRadical)).append(" ")
                .append(getValue(thirdRadical)).append(" ")
                .append(getValue(fourthRadical));
        return builder.toString();
    }

    public RootLetters withFirstRadical(ArabicLetterType firstRadical) {
        setFirstRadical(firstRadical);
        return this;
    }

    public RootLetters withFourthRadical(ArabicLetterType fourthRadical) {
        setFourthRadical(fourthRadical);
        return this;
    }

    public RootLetters withSecondRadical(ArabicLetterType secondRadical) {
        setSecondRadical(secondRadical);
        return this;
    }

    public RootLetters withThirdRadical(ArabicLetterType thirdRadical) {
        setThirdRadical(thirdRadical);
        return this;
    }

}
