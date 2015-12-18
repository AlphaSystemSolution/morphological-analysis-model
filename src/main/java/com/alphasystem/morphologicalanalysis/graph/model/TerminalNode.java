package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.alphasystem.persistence.model.CascadeSave;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.TERMINAL;
import static java.lang.String.format;

/**
 * @author sali
 */
@QueryEntity
@Document
public class TerminalNode extends LineSupport {

    private static final long serialVersionUID = -2286312045728788322L;
    private static final FontMetaInfo DEFAULT_FONT = new FontMetaInfo("Arabic Typesetting", "NORMAL", "REGULAR", 24.0);
    private static final FontMetaInfo DEFAULT_TRANSLATION_FONT = new FontMetaInfo("Century Gothic", "NORMAL",
            "REGULAR", 10.0);

    /**
     * x location for translation
     */
    protected Double translationX;

    /**
     * y location for translation
     */
    protected Double translationY;

    protected FontMetaInfo translationFont;

    @DBRef
    protected Token token;

    @DBRef
    @CascadeSave
    protected List<PartOfSpeechNode> partOfSpeechNodes;

    public TerminalNode() {
        this((String) null);
    }

    public TerminalNode(String id) {
        this(id, null);
    }

    public TerminalNode(Token token) {
        this(null, token);
    }

    public TerminalNode(String id, Token token) {
        this(id, token, TERMINAL);
    }

    protected TerminalNode(String id, Token token, GraphNodeType type) {
        super(id, type);
        setPartOfSpeechNodes(null);
        setTranslationFont(null);
        setToken(token);
    }

    @Override
    public void initDisplayName() {
        String dn = token == null ? null : token.getDisplayName();
        if (token != null) {
            setChapterNumber(token.getChapterNumber());
            setVerseNumber(token.getVerseNumber());
            setTokenNumber(token.getTokenNumber());
        }
        String ver = getVersion() <= 0 ? "" : format(":%s", getVersion());
        setDisplayName(format("%s%s:%s", dn, ver, getGraphNodeType()));
    }

    @Override
    FontMetaInfo getDefaultFont() {
        return DEFAULT_FONT;
    }

    public List<PartOfSpeechNode> getPartOfSpeechNodes() {
        return partOfSpeechNodes;
    }

    public void setPartOfSpeechNodes(List<PartOfSpeechNode> partOfSpeechNodes) {
        this.partOfSpeechNodes = partOfSpeechNodes == null ? new ArrayList<>() : partOfSpeechNodes;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Double getTranslationX() {
        return translationX;
    }

    public void setTranslationX(Double translationX) {
        this.translationX = getPositiveValue(translationX);
    }

    public Double getTranslationY() {
        return translationY;
    }

    public void setTranslationY(Double translationY) {
        this.translationY = getPositiveValue(translationY);
    }

    public FontMetaInfo getTranslationFont() {
        return translationFont;
    }

    public void setTranslationFont(FontMetaInfo translationFont) {
        this.translationFont = translationFont == null ? DEFAULT_TRANSLATION_FONT : translationFont;
    }
}
