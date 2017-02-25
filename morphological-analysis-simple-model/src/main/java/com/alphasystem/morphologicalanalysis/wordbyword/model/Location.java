package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.common.model.Linkable;
import com.alphasystem.morphologicalanalysis.morphology.model.MorphologicalEntry;
import com.alphasystem.morphologicalanalysis.wordbyword.exception.InvalidChapterException;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NamedTag;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.WordType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location extends Linkable {

    private static final long serialVersionUID = 7895140946662001637L;

    private Integer chapterNumber;

    private Integer verseNumber;

    private Integer tokenNumber;

    private Integer locationNumber;

    private boolean hidden;

    /**
     * Start index of this location within token (inclusive)
     */
    private Integer startIndex;

    /**
     * End index of this location within token (exclusive)
     */
    private Integer endIndex;

    private WordType wordType;

    private MorphologicalEntry morphologicalEntry;

    private String derivedText;

    private String text;

    private NamedTag namedTag;

    private String translation;

    protected List<AbstractProperties> properties;

    /**
     *
     */
    public Location() {
        setStartIndex(null);
        setEndIndex(null);
        setWordType(null);
    }

    /**
     * @param chapterNumber
     * @param verseNumber
     * @param tokenNumber
     * @param locationNumber
     * @param wordType
     * @param hidden
     * @throws InvalidChapterException
     */
    public Location(Integer chapterNumber, Integer verseNumber, Integer tokenNumber, Integer locationNumber, WordType wordType, boolean hidden)
            throws InvalidChapterException {
        super();
        setChapterNumber(chapterNumber);
        setVerseNumber(verseNumber);
        setTokenNumber(tokenNumber);
        setLocationNumber(locationNumber);
        setHidden(hidden);
        setStartIndex(null);
        setEndIndex(null);
        setWordType(wordType);
    }

    /**
     * @param chapterNumber
     * @param verseNumber
     * @param tokenNumber
     * @param locationNumber
     * @param wordType
     * @throws InvalidChapterException
     */
    public Location(Integer chapterNumber, Integer verseNumber, Integer tokenNumber, Integer locationNumber, WordType wordType)
            throws InvalidChapterException {
        this(chapterNumber, verseNumber, tokenNumber, locationNumber, wordType, false);
    }

    /**
     * Copy constructor
     *
     * @param src
     * @throws NullPointerException
     */
    public Location(Location src) throws NullPointerException {
        super();
        if (src == null) {
            throw new NullPointerException("Source is null.");
        }
        setChapterNumber(src.getChapterNumber());
        setVerseNumber(src.getVerseNumber());
        setTokenNumber(src.getTokenNumber());
        setLocationNumber(src.getLocationNumber());
        setHidden(src.isHidden());
        setStartIndex(src.getStartIndex());
        setEndIndex(src.getEndIndex());
        setWordType(src.getWordType());
        setNamedTag(src.getNamedTag());
        setTranslation(src.getTranslation());
        setProperties(src.getProperties());
        initDisplayName();
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
        this.endIndex = ((endIndex == null) || (endIndex <= 0)) ? 0 : endIndex;
    }

    public Integer getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(Integer locationIndex) {
        this.locationNumber = locationIndex;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getDerivedText() {
        return derivedText;
    }

    public void setDerivedText(String derivedText) {
        this.derivedText = derivedText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public NamedTag getNamedTag() {
        return namedTag;
    }

    public void setNamedTag(NamedTag namedTag) {
        this.namedTag = namedTag;
    }

    public WordType getWordType() {
        return wordType;
    }

    public void setWordType(WordType wordType) {
        WordType current = this.wordType;
        this.wordType = (wordType == null) ? WordType.NOUN : wordType;
        if (current == null || !this.wordType.equals(current)) {
            initProperties();
        }
    }

    public boolean addProperties(AbstractProperties abstractProperties) {
        final boolean added = !properties.contains(abstractProperties);
        if (added) {
            properties.add(abstractProperties);
        }
        return added;
    }

    public boolean removeProperties(AbstractProperties abstractProperties) {
        final int i = properties.indexOf(abstractProperties);
        final boolean removed = i >= 0;
        if (removed) {
            properties.remove(i);
        }
        return removed;
    }

    public List<AbstractProperties> getProperties() {
        if (properties.isEmpty() && wordType != null) {
            properties = new ArrayList<>();
            properties.add(AbstractProperties.create(wordType));
            initDisplayName();
        }
        return properties;
    }

    public void setProperties(List<AbstractProperties> properties) {
        this.properties = new ArrayList<>();
        if (properties != null && !properties.isEmpty()) {
            properties.forEach(p -> this.properties.add(AbstractProperties.copy(p)));
        }
    }

    public MorphologicalEntry getMorphologicalEntry() {
        if (morphologicalEntry == null) {
            morphologicalEntry = new MorphologicalEntry();
        }
        return morphologicalEntry;
    }

    public void setMorphologicalEntry(MorphologicalEntry morphologicalEntry) {
        this.morphologicalEntry = morphologicalEntry;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = ((startIndex == null) || (startIndex <= 0)) ? 0 : startIndex;
    }

    public ArabicWord locationWord() {
        ArabicWord locationWord = null;
        if (!StringUtils.isBlank(text)) {
            locationWord = ArabicWord.fromUnicode(text);
        }
        return locationWord;
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
        String ver = hidden ? ":1" : "";
        String dn = format("%s:%s:%s:%s%s", chapterNumber, verseNumber,
                tokenNumber, locationNumber, ver);
        setDisplayName(dn);
    }

    private void initProperties() {
        properties = new ArrayList<>();
        getProperties();
    }

    public boolean isTransient() {
        return startIndex == 0 && endIndex == 0;
    }

    /**
     * Checks whether this location is before the given location. This method will only returns true if the chapter and
     * verse number of this location is matches the chapter and verse number of given location.
     *
     * @param other
     * @return
     */
    public boolean before(Location other) {
        boolean valid = getChapterNumber().equals(other.getChapterNumber()) &&
                getVerseNumber().equals(other.getVerseNumber()) && getTokenNumber() <= other.getTokenNumber();
        if (valid) {
            valid = getLocationNumber() < other.getLocationNumber();
        }
        return valid;
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

    public Location withHidden(boolean hidden) {
        setHidden(hidden);
        return this;
    }
}
