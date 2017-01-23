package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.common.model.Linkable;
import com.alphasystem.morphologicalanalysis.morphology.model.MorphologicalEntry;
import com.alphasystem.morphologicalanalysis.wordbyword.exception.InvalidChapterException;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NamedTag;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.PartOfSpeech;
import com.alphasystem.persistence.model.CascadeSave;
import org.apache.commons.lang3.StringUtils;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.PartOfSpeech.NOUN;
import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 */
@Entity
@Document
public class Location extends Linkable {

    private static final long serialVersionUID = 7895140946662001637L;

    protected Integer chapterNumber;

    protected Integer verseNumber;

    protected Integer tokenNumber;

    private Integer locationNumber;

    protected boolean hidden;

    /**
     * Start index of this location within token (inclusive)
     */
    private Integer startIndex;

    /**
     * End index of this location within token (exclusive)
     */
    private Integer endIndex;

    private PartOfSpeech partOfSpeech;

    @DBRef
    @CascadeSave
    private MorphologicalEntry morphologicalEntry;

    private String text;

    private NamedTag namedTag;

    protected String translation;

    protected AbstractProperties properties;

    @Transient private ArabicWord locationWord;

    /**
     *
     */
    public Location() {
        setStartIndex(null);
        setEndIndex(null);
        setPartOfSpeech(null);
    }

    /**
     * @param chapterNumber
     * @param verseNumber
     * @param tokenNumber
     * @param locationNumber
     * @param hidden
     * @throws InvalidChapterException
     */
    public Location(Integer chapterNumber, Integer verseNumber,
                    Integer tokenNumber, Integer locationNumber, boolean hidden)
            throws InvalidChapterException {
        super();
        setChapterNumber(chapterNumber);
        setVerseNumber(verseNumber);
        setTokenNumber(tokenNumber);
        setLocationNumber(locationNumber);
        setHidden(hidden);
        setStartIndex(null);
        setEndIndex(null);
        setPartOfSpeech(null);
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
        this(chapterNumber, verseNumber, tokenNumber, locationNumber, false);
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
        setPartOfSpeech(src.getPartOfSpeech());
        setNamedTag(src.getNamedTag());
        setTranslation(src.getTranslation());
        setProperties(AbstractProperties.copy(src.getProperties()));
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        initLocationWord();
    }

    private void initLocationWord() {
        if (!StringUtils.isBlank(text)) {
            locationWord = ArabicWord.fromUnicode(text);
        }
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
        this.partOfSpeech = (partOfSpeech == null) ? NOUN : partOfSpeech;
        // setting part of speech will make properties re-initialized, which will override the location
        // properties, there is a case where we don't want to have this override to be happened.

        // Case 1: We already have value in the DB and from UI we selected the location from drop down,
        // from "LocationPropertiesSkin" line 47 we changed the common properties view (this class) and
        // that will trigger the change in part of speech, that's why we are here.
        // Now we need to change the part of speech in UI but will reset the properties as well which is we
        // want to be happened. So we want to keep track current sets of properties and put them back once
        // part of speech is set

        // Case 2: This is completely new sets of properties, when properties are initialized by default they
        // are assigned "NOUN" as part of speech, now if we are changing to some other type of part of speech
        // then holding of current sets of properties will not work, in this case we want the override to be
        // happened

        // trick is to find out that if current location is transient or not, init properties only if the location
        // is transient
        if (isTransient()) {
            initProperties();
        }
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
            initDisplayName();
            String id = format("%s:%s", getDisplayName(), partOfSpeech);
            properties.setId(id);
        }
        return properties;
    }

    public void setProperties(AbstractProperties properties) {
        this.properties = properties;
    }

    public MorphologicalEntry getMorphologicalEntry() {
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

    public ArabicWord getLocationWord() {
        if (locationWord == null) {
            initLocationWord();
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
        properties = null;
        getProperties();
    }

    public boolean isTransient() {
        return startIndex == 0 && endIndex == 0;
    }

    public void updatePartOfSpeech(PartOfSpeech partOfSpeech){
        this.partOfSpeech = (partOfSpeech == null) ? NOUN : partOfSpeech;
        initProperties();
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
