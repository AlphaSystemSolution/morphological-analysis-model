/**
 *
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicLetterType;
import com.alphasystem.persistence.model.AbstractSimpleDocument;
import org.springframework.data.annotation.PersistenceConstructor;

import static com.alphasystem.util.IdGenerator.nextId;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 */
public class RootWord extends AbstractSimpleDocument {

    private static final long serialVersionUID = 1870389910904806332L;

    protected ArabicLetterType firstRadical;

    protected ArabicLetterType secondRadical;

    protected ArabicLetterType thirdRadical;

    protected ArabicLetterType fourthRadical;

    public RootWord() {
        this(null, null, null, null);
    }

    @PersistenceConstructor
    public RootWord(ArabicLetterType firstRadical,
                    ArabicLetterType secondRadical, ArabicLetterType thirdRadical,
                    ArabicLetterType fourthRadical) {
        super(nextId());
        this.firstRadical = firstRadical;
        this.secondRadical = secondRadical;
        this.thirdRadical = thirdRadical;
        this.fourthRadical = fourthRadical;
    }

    /**
     * Copy Constructor.
     *
     * @param src
     * @throws NullPointerException
     */
    public RootWord(RootWord src) throws NullPointerException {
        super(nextId());
        if (src == null) {
            throw new NullPointerException("Source is null.");
        }
        setFirstRadical(src.getFirstRadical());
        setSecondRadical(src.getSecondRadical());
        setThirdRadical(src.getThirdRadical());
        setFourthRadical(src.getFourthRadical());
    }

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

    public String toCode() {
        StringBuilder builder = new StringBuilder();
        builder.append((firstRadical == null) ? "" : firstRadical.toCode())
                .append((secondRadical == null) ? "" : secondRadical.toCode())
                .append((thirdRadical == null) ? "" : thirdRadical.toCode())
                .append((fourthRadical == null) ? "" : fourthRadical.toCode());
        String result = builder.toString().trim();
        return isBlank(result) ? null : result;
    }

}
