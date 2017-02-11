package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.IMPLIED;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImpliedNode extends TerminalNode {

    private static final long serialVersionUID = 4662177614289449818L;

    public ImpliedNode() {
        this(null);
    }

    private ImpliedNode(String id, Token token) {
        super(id, token, IMPLIED);
    }

    public ImpliedNode(Token token) {
        this(null, token);
    }

}
