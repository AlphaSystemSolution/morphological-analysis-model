/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model;

import static java.lang.String.format;

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
public class Verse extends AbstractDocument {

	private static final long serialVersionUID = 2453854450176270449L;

	protected Integer chapterNumber;

	protected Integer verseNumber;

	@DBRef
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
		initDisplayName();
		setTokens(null);
	}

	public boolean addToken(Token e) {
		return tokens.add(e);
	}

	public Integer getChapterNumber() {
		return chapterNumber;
	}

	public Integer getTokenCount() {
		return tokens.size();
	}

	public List<Token> getTokens() {
		return tokens;
	}

	public ArabicWord getVerse() {
		return verse;
	}

	public Integer getVerseNumber() {
		return verseNumber;
	}

	@Override
	public void initDisplayName() {
		String dn = format("%s:%s", chapterNumber, verseNumber);
		setDisplayName(dn);
		setId(dn);
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

	public void setTokens(List<Token> tokens) {
		this.tokens = tokens == null ? new ArrayList<Token>() : tokens;
	}

	public void setVerse(ArabicWord verse) {
		this.verse = verse;
	}

	public void setVerseNumber(Integer verseNumber) {
		this.verseNumber = verseNumber;
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
