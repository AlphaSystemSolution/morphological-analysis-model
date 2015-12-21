package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.HIDDEN;

/**
 * @author sali
 */
@QueryEntity
@Document
@TypeAlias("HiddenNode")
public class HiddenNode extends TerminalNode {

    private static final long serialVersionUID = -4235206430262308685L;

    public HiddenNode() {
        this(null);
    }

    public HiddenNode(Token token) {
        this(null, token);
    }

    public HiddenNode(String id, Token token) {
        super(id, token, HIDDEN);
    }
}
