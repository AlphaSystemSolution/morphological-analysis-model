package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.REFERENCE;

/**
 * @author sali
 */
@Entity
@Document
public class ReferenceNode extends TerminalNode {

    private static final long serialVersionUID = -8741419835337379396L;

    public ReferenceNode() {
        this(null);
    }

    public ReferenceNode(Token token){
        this(null, token);
    }

    public ReferenceNode(String id, Token token) {
        super(id, token, REFERENCE);
    }
}
