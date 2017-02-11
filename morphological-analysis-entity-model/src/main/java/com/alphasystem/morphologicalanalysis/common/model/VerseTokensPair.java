package com.alphasystem.morphologicalanalysis.common.model;

import com.alphasystem.persistence.model.AbstractDocument;
import com.alphasystem.persistence.model.AbstractSimpleDocument;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.util.AppUtil.isInstanceOf;
import static com.alphasystem.util.HashCodeUtil.hash;
import static java.lang.String.format;

/**
 * @author sali
 */
@Entity
@Document
public class VerseTokensPair extends AbstractDocument {

    private Integer verseNumber;
    private Integer firstTokenIndex;
    private Integer lastTokenIndex;

    public VerseTokensPair(){
    }

    public VerseTokensPair(Integer verseNumber) {
        this(verseNumber, 1);
    }

    public VerseTokensPair(Integer verseNumber, Integer firstTokenIndex) {
        this(verseNumber, firstTokenIndex, -1);
    }

    @PersistenceConstructor
    public VerseTokensPair(Integer verseNumber, Integer firstTokenIndex, Integer lastTokenIndex) {
        super();
        setVerseNumber(verseNumber);
        setFirstTokenIndex(firstTokenIndex);
        setLastTokenIndex(lastTokenIndex);
        initDisplayName();
    }

    @Override
    public void initDisplayName() {
        setDisplayName(toString());
    }

    public Integer getFirstTokenIndex() {
        return firstTokenIndex;
    }

    public void setFirstTokenIndex(Integer firstTokenIndex) {
        this.firstTokenIndex = (firstTokenIndex == null || firstTokenIndex <= 0) ? 1 : firstTokenIndex;
    }

    public Integer getLastTokenIndex() {
        return lastTokenIndex;
    }

    public void setLastTokenIndex(Integer lastTokenIndex) {
        this.lastTokenIndex = (lastTokenIndex == null || lastTokenIndex <= 0) ? -1 : lastTokenIndex;
    }

    public Integer getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(Integer verseNumber) {
        this.verseNumber = verseNumber == null ? -1 : verseNumber;
    }

    @Override
    public int hashCode() {
        int hc = super.hashCode();
        hc = hash(hc, getVerseNumber());
        hc = hash(hc, getFirstTokenIndex());
        return hash(hc, getLastTokenIndex());
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = super.equals(obj);
        if (isInstanceOf(VerseTokensPair.class, obj)) {
            VerseTokensPair o = (VerseTokensPair) obj;
            result = getVerseNumber().equals(o.getVerseNumber()) && getFirstTokenIndex().equals(o.getFirstTokenIndex())
                    && getLastTokenIndex().equals(o.getLastTokenIndex());
        }
        return result;
    }

    @Override
    public int compareTo(AbstractSimpleDocument obj) {
        int result = super.compareTo(obj);
        if (isInstanceOf(VerseTokensPair.class, obj)) {
            VerseTokensPair o = (VerseTokensPair) obj;
            result = getVerseNumber().compareTo(o.getVerseNumber());
            if (result == 0) {
                result = getFirstTokenIndex().compareTo(o.getFirstTokenIndex());
                if (result == 0) {
                    result = getLastTokenIndex().compareTo(o.getLastTokenIndex());
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return format("%s:%s:%s", verseNumber, firstTokenIndex, lastTokenIndex);
    }
}
