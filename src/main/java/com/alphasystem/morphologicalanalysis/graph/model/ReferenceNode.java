package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.REFERENCE;

/**
 * @author sali
 */
public class ReferenceNode extends TerminalNode {

    private static final long serialVersionUID = -8741419835337379396L;

    public ReferenceNode() {
        this(null);
    }

    public ReferenceNode(Token token) {
        this(null, token);
    }

    private ReferenceNode(String id, Token token) {
        super(id, token, REFERENCE);
    }
}
