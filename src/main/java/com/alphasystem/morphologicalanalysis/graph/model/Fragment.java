package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.common.model.Related;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.RelationshipType;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents series of {@link Token}(s) and create fragment / phrase relationship. The fragment could be
 * a phrase like <emp>Idafah</emp> or it could be nominal or verbal sentences.
 *
 * @author sali
 * @see Token
 */
@Document
public class Fragment extends Related {

    @DBRef(lazy = true)
    protected List<Token> tokens;

    protected RelationshipType relationshipType;

    public Fragment() {
        super();
        setTokens(null);
        initDisplayName();
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = new ArrayList<>();
        if (tokens != null) {
            this.tokens.addAll(tokens);
        }
    }

    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }
}
