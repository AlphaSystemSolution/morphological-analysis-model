package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.IMPLIED;

/**
 * @author sali
 */
@QueryEntity
@Document
@TypeAlias("ImpliedNode")
public class ImpliedNode extends TerminalNode {

    private static final long serialVersionUID = 4662177614289449818L;

    public ImpliedNode() {
        this(null);
    }

    public ImpliedNode(String id, Token token) {
        super(id, token, IMPLIED);
    }

    public ImpliedNode(Token token) {
        this(null, token);
    }

}
