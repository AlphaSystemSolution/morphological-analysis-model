package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.HIDDEN;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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
