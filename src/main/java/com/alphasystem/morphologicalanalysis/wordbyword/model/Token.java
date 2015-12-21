/**
 *
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.wordbyword.exception.InvalidChapterException;
import com.alphasystem.persistence.model.AbstractDocument;
import com.alphasystem.persistence.model.CascadeSave;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;
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
@QueryEntity
@Document
@TypeAlias("Token")
public class Token extends AbstractDocument {

    private static final long serialVersionUID = 15155700997755124L;

    protected Integer chapterNumber;

    protected Integer verseNumber;

    protected Integer tokenNumber;

    protected String token;

    /**
     * For empty or hidden location will set as true to mark that this location was added for
     * Tree bank dependency graph
     */
    protected boolean hidden;
    @DBRef
    @CascadeSave
    protected List<Location> locations;
    @Transient
    protected ArabicWord tokenWord;

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

    public ArabicWord getTokenWord() {
        return tokenWord;
    }

    public String getTranslation() {
        StringBuilder builder = new StringBuilder();
        if (locations != null && !locations.isEmpty()) {
            Location location = locations.get(0);
            String translation = location.getTranslation();
            translation = isBlank(translation) ? "" : translation;
            builder.append(translation);
            for (int i = 1; i < locations.size(); i++) {
                builder.append(" ");
                location = locations.get(i);
                translation = location.getTranslation();
                translation = isBlank(translation) ? ""
                        : translation;
                builder.append(translation);
            }
        }
        return builder.toString();
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
