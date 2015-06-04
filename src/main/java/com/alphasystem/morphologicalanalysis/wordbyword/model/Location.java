/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.wordbyword.exception.InvalidChapterException;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NamedTag;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.PartOfSpeech;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.RootWord;
import com.alphasystem.persistence.mongo.model.AbstractDocument;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.PartOfSpeech.NOUN;
import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 * 
 */
@Document
public class Location extends AbstractDocument {

	private static final long serialVersionUID = 7895140946662001637L;

	protected Integer chapterNumber;

	protected Integer verseNumber;

	protected Integer tokenNumber;

	protected Integer locationNumber;

	/**
	 * Start index of this location within token (inclusive)
	 */
	protected Integer startIndex;

	/**
	 * End index of this location within token (exclusive)
	 */
	protected Integer endIndex;

	protected PartOfSpeech partOfSpeech;

	protected RootWord rootWord;

	protected NamedTag namedTag;

	protected NamedTemplate formTemplate;

	protected String translation;

	protected AbstractProperties properties;

	/**
	 * 
	 */
	public Location() {
	}

	/**
	 * @param chapterNumber
	 * @param verseNumber
	 * @param tokenNumber
	 * @param locationNumber
	 * @throws InvalidChapterException
	 */
	@PersistenceConstructor
	public Location(Integer chapterNumber, Integer verseNumber,
			Integer tokenNumber, Integer locationNumber)
			throws InvalidChapterException {
		super();
		setChapterNumber(chapterNumber);
		setVerseNumber(verseNumber);
		setTokenNumber(tokenNumber);
		setLocationNumber(locationNumber);
		initDisplayName();
		setPartOfSpeech(null);
		setRootWord(new RootWord());
		setStartIndex(null);
		setEndIndex(null);
	}

	public Integer getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(Integer chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	public Integer getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex == null || endIndex.intValue() <= 0 ? 0
				: endIndex;
	}

	public NamedTemplate getFormTemplate() {
		return formTemplate;
	}

	public void setFormTemplate(NamedTemplate formTemplate) {
		this.formTemplate = formTemplate;
	}

	public Integer getLocationNumber() {
		return locationNumber;
	}

	public void setLocationNumber(Integer locationIndex) {
		this.locationNumber = locationIndex;
	}

	public NamedTag getNamedTag() {
		return namedTag;
	}

	public void setNamedTag(NamedTag namedTag) {
		this.namedTag = namedTag;
	}

	public PartOfSpeech getPartOfSpeech() {
		return partOfSpeech;
	}

	public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
		this.partOfSpeech = partOfSpeech == null ? NOUN : partOfSpeech;
		initProperties();
	}

	public AbstractProperties getProperties() {
		if (properties == null && partOfSpeech != null) {
			Class<? extends AbstractProperties> propertiesClass = partOfSpeech
					.getPropertiesClass();
			try {
				properties = propertiesClass.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
				properties = new ParticleProperties();
			}
			String id = format("%s:%s", getDisplayName(), partOfSpeech);
			properties.setDisplayName(id);
			properties.setId(id);
		}
		return properties;
	}

	public void setProperties(AbstractProperties properties) {
		this.properties = properties;
	}

	public RootWord getRootWord() {
		return rootWord;
	}

	public void setRootWord(RootWord rootWord) {
		this.rootWord = rootWord;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex == null || startIndex.intValue() <= 0 ? 0
				: startIndex;
	}

	public Integer getTokenNumber() {
		return tokenNumber;
	}

	public void setTokenNumber(Integer tokenNumber) {
		this.tokenNumber = tokenNumber;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public Integer getVerseNumber() {
		return verseNumber;
	}

	public void setVerseNumber(Integer verseNumber) {
		this.verseNumber = verseNumber;
	}

	@Override
	public void initDisplayName() {
		String dn = format("%s:%s:%s:%s", chapterNumber, verseNumber,
				tokenNumber, locationNumber);
		setDisplayName(dn);
	}

	private void initProperties() {
		properties = null;
		getProperties();
	}

	public boolean isTransient() {
		return startIndex == 0 && endIndex == 0;
	}

	public Location withChapterNumber(Integer chapterNumber) {
		if (chapterNumber != null) {
			setChapterNumber(chapterNumber);
		}
		return this;
	}

	public Location withEndIndex(Integer endIndex) {
		if (endIndex != null) {
			setEndIndex(endIndex);
		}
		return this;
	}

	public Location withForm(NamedTemplate formTemplate) {
		if (formTemplate != null) {
			setFormTemplate(formTemplate);
		}
		return this;
	}

	public Location withLocationIndex(Integer locationIndex) {
		if (locationIndex != null) {
			setLocationNumber(locationIndex);
		}
		return this;
	}

	public Location withNamedTag(NamedTag namedTag) {
		if (namedTag != null) {
			setNamedTag(namedTag);
		}
		return this;
	}

	public Location withPartOfSpeech(PartOfSpeech partOfSpeech) {
		if (partOfSpeech != null) {
			setPartOfSpeech(partOfSpeech);
		}
		return this;
	}

	public Location withProperties(AbstractProperties properties) {
		if (properties != null) {
			setProperties(properties);
		}
		return this;
	}

	public Location withRootWord(RootWord rootWord) {
		if (rootWord != null) {
			setRootWord(rootWord);
		}
		return this;
	}

	public Location withStartIndex(Integer startIndex) {
		if (startIndex != null) {
			setStartIndex(startIndex);
		}
		return this;
	}

	public Location withTokenNumber(Integer tokenNumber) {
		if (tokenNumber != null) {
			setTokenNumber(tokenNumber);
		}
		return this;
	}

	public Location withTranslation(String translation) {
		if (!isBlank(translation)) {
			setTranslation(translation);
		}
		return this;
	}

	public Location withVerseNumber(Integer verseNumber) {
		if (verseNumber != null) {
			setVerseNumber(verseNumber);
		}
		return this;
	}

}
