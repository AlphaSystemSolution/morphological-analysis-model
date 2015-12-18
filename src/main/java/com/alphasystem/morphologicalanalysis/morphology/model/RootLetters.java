/**
 *
 */
package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.arabic.model.ArabicLetterType;
import com.alphasystem.persistence.model.AbstractDocument;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.util.AppUtil.isGivenType;
import static com.alphasystem.util.HashCodeUtil.hash;
import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 */
@Entity
@Document
@TypeAlias("RootLetters")
public class RootLetters extends AbstractDocument {

    protected ArabicLetterType firstRadical;
    protected ArabicLetterType secondRadical;
    protected ArabicLetterType thirdRadical;
    protected ArabicLetterType fourthRadical;

    @PersistenceConstructor
    public RootLetters() {
        this(FA, AIN, LAM);
    }

    /**
     * @param firstRadical
     * @param secondRadical
     * @param thirdRadical
     */
    public RootLetters(ArabicLetterType firstRadical, ArabicLetterType secondRadical, ArabicLetterType thirdRadical) {
        this(firstRadical, secondRadical, thirdRadical, null);
    }

    /**
     * @param firstRadical
     * @param secondRadical
     * @param thirdRadical
     * @param fourthRadical
     */
    public RootLetters(ArabicLetterType firstRadical, ArabicLetterType secondRadical, ArabicLetterType thirdRadical,
                       ArabicLetterType fourthRadical) {
        this.firstRadical = firstRadical;
        this.secondRadical = secondRadical;
        this.thirdRadical = thirdRadical;
        this.fourthRadical = fourthRadical;
    }

    private static String getValue(ArabicLetterType arabicLetterType) {
        return (arabicLetterType == null) ? "" : arabicLetterType.toCode();
    }

    public ArabicLetterType getFirstRadical() {
        return firstRadical;
    }

    public void setFirstRadical(ArabicLetterType firstRadical) {
        this.firstRadical = firstRadical;
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

    public ArabicLetterType getFourthRadical() {
        return fourthRadical;
    }

    public void setFourthRadical(ArabicLetterType fourthRadical) {
        this.fourthRadical = fourthRadical;
    }

    @Override
    public void initDisplayName() {
        String displayName = format("%s%s%s%s", getValue(firstRadical), getValue(secondRadical),
                getValue(thirdRadical), getValue(fourthRadical));
        if (isBlank(displayName.trim())) {
            super.initDisplayName();
        } else {
            setDisplayName(displayName);
        }
    }

    public boolean isEmpty() {
        return firstRadical == null || secondRadical == null || thirdRadical == null;
    }

    @Override
    public boolean equals(Object obj) {
        boolean empty = isEmpty();
        boolean result = empty && super.equals(obj);
        if (!empty && isGivenType(RootLetters.class, obj)) {
            RootLetters other = (RootLetters) obj;
            boolean equalFirstRadical = getFirstRadical().equals(other.getFirstRadical());
            boolean equalSecondRadical = getSecondRadical().equals(other.getSecondRadical());
            boolean equalThirdRadical = getThirdRadical().equals(other.getThirdRadical());
            ArabicLetterType otherFourthRadical = other.getFourthRadical();
            boolean equalFourthRadical = (fourthRadical == null && otherFourthRadical == null) ||
                    (fourthRadical != null && fourthRadical.equals(otherFourthRadical));
            result = equalFirstRadical && equalSecondRadical && equalThirdRadical && equalFourthRadical;
        }
        return result;
    }

    @Override
    public int compareTo(AbstractDocument o) {
        boolean empty = isEmpty();
        int result = empty ? super.compareTo(o) : 0;
        if (!empty && isGivenType(RootLetters.class, o)) {
            RootLetters other = (RootLetters) o;
            int firstRadicalCompare = getFirstRadical().compareTo(other.getFirstRadical());
            int secondRadicalCompare = getSecondRadical().compareTo(other.getSecondRadical());
            int thirdRadicalCompare = getThirdRadical().compareTo(other.getThirdRadical());
            ArabicLetterType otherFourthRadical = other.getFourthRadical();
            int fourthRadicalCompare = ((fourthRadical == null) && (otherFourthRadical == null)) ? 0 :
                    ((fourthRadical == null) ? -1 : fourthRadical.compareTo(otherFourthRadical));
            result = firstRadicalCompare;
            if (result == 0) {
                result = secondRadicalCompare;
                if (result == 0) {
                    result = thirdRadicalCompare;
                    if (result == 0) {
                        result = fourthRadicalCompare;
                    }
                }
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        int hashCode = hash(super.hashCode(), firstRadical);
        hashCode = hash(hashCode, secondRadical);
        hashCode = hash(hashCode, thirdRadical);
        hashCode = hash(hashCode, fourthRadical);
        return hashCode;
    }

    @Override
    public String toString() {
        String displayName = getDisplayName();
        if (isBlank(displayName)) {
            initDisplayName();
            displayName = getDisplayName();
        }
        return displayName;
    }

    public RootLetters withFirstRadical(ArabicLetterType firstRadical) {
        setFirstRadical(firstRadical);
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

    public RootLetters withFourthRadical(ArabicLetterType fourthRadical) {
        setFourthRadical(fourthRadical);
        return this;
    }

}
