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
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

import static com.alphasystem.arabic.model.ArabicWord.fromUnicode;
import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 */
@Entity
@Document
public class Token extends AbstractDocument {

    private static final long serialVersionUID = 15155700997755124L;

    private Integer chapterNumber;

    private Integer verseNumber;

    private Integer tokenNumber;

    private String token;

    private String translation;

    /**
     * For empty or hidden location will set as true to mark that this location was added for
     * Tree bank dependency graph
     */
    private boolean hidden;

    @DBRef
    @CascadeSave
    private List<Location> locations;

    @Transient private ArabicWord tokenWord;

    /**
     *
     */
    public Token() {
        super();
        setLocations(null);
    }

    /**
     * @param chapterNumber
     * @param verseNumber
     * @param tokenNumber
     * @param token
     * @throws InvalidChapterException
     */
    @PersistenceConstructor
    public Token(Integer chapterNumber, Integer verseNumber,
                 Integer tokenNumber, String token) throws InvalidChapterException {
        setChapterNumber(chapterNumber);
        setVerseNumber(verseNumber);
        setTokenNumber(tokenNumber);
        setToken(token);
        setLocations(null);
        setHidden(false);
        initDisplayName();
    }

    /**
     * @param src
     * @throws NullPointerException
     */
    public Token(Token src) throws NullPointerException {
        if (src == null) {
            throw new NullPointerException("Source is null.");
        }
        setChapterNumber(src.getChapterNumber());
        setVerseNumber(src.getVerseNumber());
        setTokenNumber(src.getTokenNumber());
        setToken(src.getToken());
        setHidden(src.isHidden());
        setLocations(src.getLocations());
        initDisplayName();
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean addLocation(Location e) {
        return locations.add(e);
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public Integer getLocationCount() {
        return locations.size();
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = new ArrayList<>();
        if (locations != null && !locations.isEmpty()) {
            locations.forEach(l -> {
                if (l != null) {
                    this.locations.add(new Location(l));
                }
            });
        }
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
        initTokenWord();
    }

    public Integer getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(Integer tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    @Transient
    public ArabicWord tokenWord() {
        if (tokenWord == null) {
            initTokenWord();
        }
        return tokenWord;
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
        String r = hidden ? ":1" : "";
        String dn = format("%s:%s:%s%s", chapterNumber, verseNumber, tokenNumber, r);
        setDisplayName(dn);
    }

    private void initTokenWord() {
        tokenWord = isBlank(token) ? null : fromUnicode(token);
    }

    public Token withChapterNumber(Integer chapterNumber) {
        if (chapterNumber != null) {
            setChapterNumber(chapterNumber);
        }
        return this;
    }

    public Token withTokenNumber(Integer tokenNumber) {
        if (tokenNumber != null) {
            setTokenNumber(tokenNumber);
        }
        return this;
    }

    public Token withVerseNumber(Integer verseNumber) {
        if (verseNumber != null) {
            setVerseNumber(verseNumber);
        }
        return this;
    }

    public Token withToken(String token) {
        if (!isBlank(token)) {
            setToken(token);
        }
        return this;
    }

    public Token withHidden(boolean hidden) {
        setHidden(hidden);
        return this;
    }
}
