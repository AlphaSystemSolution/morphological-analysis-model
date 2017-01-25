package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.HIDDEN;

/**
 * @author sali
 */
@Entity
@Document
public class HiddenNode extends TerminalNode {

    private static final long serialVersionUID = -4235206430262308685L;

    public HiddenNode() {
        this(null);
    }

    public HiddenNode(Token token) {
        this(null, token);
    }

    private HiddenNode(String id, Token token) {
        super(id, token, HIDDEN);
    }
}
