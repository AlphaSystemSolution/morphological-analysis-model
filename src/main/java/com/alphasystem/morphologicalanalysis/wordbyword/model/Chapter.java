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

import static com.alphasystem.arabic.model.ArabicWord.fromUnicode;
import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 * 
 */
@Entity
@Document
public class Chapter extends AbstractDocument {

	private static final long serialVersionUID = 2227615567873753719L;

	protected String chapterName;

	@Indexed(
			unique = true,
			name = "chapter_number"
	)
	protected Integer chapterNumber;

	@Indexed(
			name = "verse_count"
	)
	protected Integer verseCount;

	@DBRef (lazy = true)
	@CascadeSave
	protected List<Verse> verses;

	@Transient
	protected ArabicWord chapterNameWord;

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
	@PersistenceConstructor
	public Chapter(Integer chapterNumber, String chapterName)
			throws InvalidChapterException {
		setChapterNumber(chapterNumber);
		setChapterName(chapterName);
		setVerses(null);
	}

	public boolean addVerse(Verse e) {
		return verses.add(e);
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
		initChapterNameWord();
	}

	public ArabicWord getChapterNameWord() {
		return chapterNameWord;
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

	private void initChapterNameWord() {
		this.chapterNameWord = isBlank(chapterName) ? null
				: fromUnicode(chapterName);
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
