package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.alphasystem.persistence.mongo.model.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sali
 */
@Document
public class DependencyGraph extends AbstractDocument {

    protected Integer chapterNumber;

    protected Integer verseNumber;

    protected Integer segmentNumber;

    protected List<Token> tokens;

    protected List<Relationship> relationships;

    public DependencyGraph() {
        super();
        initDisplayName();
        setTokens(null);
        setRelationships(null);
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
