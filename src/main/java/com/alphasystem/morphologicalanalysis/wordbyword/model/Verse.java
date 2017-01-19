/**
 *
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.wordbyword.exception.InvalidChapterException;
import com.alphasystem.persistence.model.AbstractDocument;
import com.alphasystem.persistence.model.CascadeSave;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * @author sali
 */
@Entity
@Document
public class Verse extends AbstractDocument {

    private static final long serialVersionUID = 2453854450176270449L;

    protected Integer chapterNumber;

    protected Integer verseNumber;

    @Indexed(name = "token_count")
    protected Integer tokenCount;

    @DBRef
    @CascadeSave
    protected List<Token> tokens;

    @Transient
    protected ArabicWord verse;

    /**
     *
     */
    public Verse() {
        setTokens(null);
    }

    /**
     * @param chapterNumber
     * @param verseNumber
     * @throws InvalidChapterException
     */
    @PersistenceConstructor
    public Verse(Integer chapterNumber, Integer verseNumber)
            throws InvalidChapterException {
        setChapterNumber(chapterNumber);
        setVerseNumber(verseNumber);
        setTokens(null);
    }

    public boolean addToken(Token e) {
        return tokens.add(e);
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber)
            throws InvalidChapterException {
        if (chapterNumber == null
                || (chapterNumber <= 0 || chapterNumber > 114)) {
            throw new InvalidChapterException(format(
                    "Invalid chapter Number {%s}", chapterNumber));
        }
        this.chapterNumber = chapterNumber;
    }

    public Integer getTokenCount() {
        return tokenCount;
    }

    public void setTokenCount(Integer tokenCount) {
        this.tokenCount = tokenCount;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = new ArrayList<>();
        if (tokens != null && !tokens.isEmpty()) {
            this.tokens.addAll(tokens);
        }
    }

    public ArabicWord getVerse() {
        return verse;
    }

    public void setVerse(ArabicWord verse) {
        this.verse = verse;
    }

    public Integer getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(Integer verseNumber) {
        this.verseNumber = verseNumber;
    }

    @Override
    public void initDisplayName() {
        String dn = format("%s:%s", chapterNumber, verseNumber);
        setDisplayName(dn);
        setId(dn);
    }

    public Verse withChapterNumber(Integer chapterNumber) {
        if (chapterNumber != null) {
            setChapterNumber(chapterNumber);
        }
        return this;
    }

    public Verse withVerseNumber(Integer verseNumber) {
        if (verseNumber != null) {
            setVerseNumber(verseNumber);
        }
        return this;
    }
}
