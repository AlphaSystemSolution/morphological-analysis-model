package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.EMPTY;

/**
 * @author sali
 */
@Document
public class EmptyNode extends TerminalNode {

    private static final long serialVersionUID = 4662177614289449818L;

    public EmptyNode() {
        this(null);
    }

    public EmptyNode(String id, Token token) {
        super(id, token, EMPTY);
    }

    public EmptyNode(Token token) {
        this(null, token);
    }

}
