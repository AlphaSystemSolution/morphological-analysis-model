/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model;

import static com.alphasystem.arabic.model.ArabicWord.fromUnicode;
import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.isBlank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.exception.InvalidChapterException;
import com.alphasystem.persistence.mongo.model.AbstractDocument;

/**
 * @author sali
 * 
 */
@Document
public class Chapter extends AbstractDocument {

	private static final long serialVersionUID = 2227615567873753719L;

	protected String chapterName;

	protected Integer chapterNumber;

	@DBRef
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
		initDisplayName();
		setVerses(null);
	}

	public boolean addVerse(Verse e) {
		return verses.add(e);
	}

	public String getChapterName() {
		return chapterName;
	}

	public ArabicWord getChapterNameWord() {
		return chapterNameWord;
	}

	public Integer getChapterNumber() {
		return chapterNumber;
	}

	public Verse getVerse(int verseNumber) {
		return verses.get(verseNumber - 1);
	}

	public Integer getVerseCount() {
		return verses.size();
	}

	public List<Verse> getVerses() {
		return verses;
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

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
		initChapterNameWord();
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

	public void setVerses(List<Verse> verses) {
		this.verses = verses == null ? new ArrayList<Verse>() : verses;
	}

	public Chapter withChapterNumber(Integer chapterNumber) {
		if (chapterNumber != null) {
			setChapterNumber(chapterNumber);
		}
		return this;
	}

}
