package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.alphasystem.persistence.mongo.model.AbstractDocument;
import com.alphasystem.persistence.mongo.model.CascadeSave;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * @author sali
 */
@Document
public class DependencyGraph extends AbstractDocument {

    protected Integer chapterNumber;

    protected Integer verseNumber;

    protected Integer firstTokenIndex;

    protected Integer lastTokenIndex;

    @DBRef(lazy = true)
    @CascadeSave
    protected List<Token> tokens;

    @DBRef(lazy = true)
    @CascadeSave
    protected List<Relationship> relationships;

    @DBRef(lazy = true)
    @CascadeSave
    protected List<Fragment> fragments;

    public DependencyGraph() {
        super();
        setTokens(null);
        setRelationships(null);
        setFragments(null);
    }

    @PersistenceConstructor
    public DependencyGraph(Integer chapterNumber, Integer verseNumber, Integer firstTokenIndex,
                           Integer lastTokenIndex) {
        super();
        this.chapterNumber = chapterNumber;
        this.verseNumber = verseNumber;
        this.firstTokenIndex = firstTokenIndex;
        this.lastTokenIndex = lastTokenIndex;
        initDisplayName();
        setTokens(null);
        setRelationships(null);
        setFragments(null);
    }

    public Integer getLastTokenIndex() {
        return lastTokenIndex;
    }

    public void setLastTokenIndex(Integer lastTokenIndex) {
        this.lastTokenIndex = lastTokenIndex;
    }

    @Override
    public void initDisplayName() {
        setDisplayName(format("%s:%s:%s:%s", chapterNumber, verseNumber, firstTokenIndex, lastTokenIndex));
    }

    public List<Fragment> getFragments() {
        return fragments;
    }

    public void setFragments(List<Fragment> fragments) {
        this.fragments = new ArrayList<>();
        if (fragments != null) {
            this.fragments.addAll(fragments);
        }
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = new ArrayList<>();
        if (tokens != null && !tokens.isEmpty()) {
            this.tokens.addAll(tokens);

        }
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public Integer getFirstTokenIndex() {
        return firstTokenIndex;
    }

    public void setFirstTokenIndex(Integer firstTokenIndex) {
        this.firstTokenIndex = firstTokenIndex;
    }

    public Integer getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(Integer verseNumber) {
        this.verseNumber = verseNumber;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = new ArrayList<>();
        if (relationships != null) {
            this.relationships.addAll(relationships);
        }
    }
}
