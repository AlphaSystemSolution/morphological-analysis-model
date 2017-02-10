/**
 *
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.wordbyword.exception.InvalidChapterException;
import com.alphasystem.persistence.model.AbstractDocument;
import com.alphasystem.persistence.model.CascadeSave;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Chapter extends AbstractDocument {

    private static final long serialVersionUID = 2227615567873753719L;

    private String chapterName;

    protected Integer chapterNumber;

    protected Integer verseCount;

    @CascadeSave
    protected List<Verse> verses;

    /**
     *
     */
    public Chapter() {
        super();
        setVerses(null);
    }

    /**
     * @param chapterNumber
     * @param chapterName
     * @throws InvalidChapterException
     */
    public Chapter(Integer chapterNumber, String chapterName) throws InvalidChapterException {
        setChapterNumber(chapterNumber);
        setChapterName(chapterName);
        setVerses(null);
        initDisplayName();
    }

    public Chapter(Chapter src) {
        if (src == null) {
            throw new NullPointerException("src object cannot be null.");
        }
        setChapterNumber(src.getChapterNumber());
        setChapterName(src.getChapterName());
        setVerseCount(src.getVerseCount());
        setVerses(null);
        initDisplayName();
    }

    public boolean addVerse(Verse e) {
        return verses.add(e);
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public ArabicWord chapterNameWord() {
        return isBlank(chapterName) ? null : ArabicWord.fromUnicode(chapterName);
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber)
            throws InvalidChapterException {
        if (chapterNumber == null
                || (chapterNumber <= 0 || chapterNumber > 114)) {
            throw new InvalidChapterException(chapterNumber);
        }
        this.chapterNumber = chapterNumber;
    }

    public Verse getVerse(int verseNumber) {
        return verses.get(verseNumber - 1);
    }

    public Integer getVerseCount() {
        return verseCount;
    }

    public void setVerseCount(Integer verseCount) {
        this.verseCount = verseCount;
    }

    public List<Verse> getVerses() {
        return verses;
    }

    public void setVerses(List<Verse> verses) {
        this.verses = verses == null ? new ArrayList<Verse>() : verses;
    }

    @Override
    public void initDisplayName() {
        String dn = format("%s:%s", getClass().getSimpleName().toLowerCase(),
                chapterNumber);
        setDisplayName(dn);
        setId(dn);
    }

    public Chapter withChapterNumber(Integer chapterNumber) {
        if (chapterNumber != null) {
            setChapterNumber(chapterNumber);
        }
        return this;
    }

}
