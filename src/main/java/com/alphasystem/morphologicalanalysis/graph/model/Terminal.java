package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.graph.model.support.TerminalType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.alphasystem.persistence.mongo.model.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.graph.model.support.TerminalType.TERMINAL;
import static java.lang.String.format;

/**
 * @author sali
 */
@Document
public class Terminal extends AbstractDocument {

    private static final long serialVersionUID = -8747858955802083485L;

    @DBRef
    protected Token token;

    protected TerminalType terminalType;

    public Terminal() {
        this(null);
    }

    public Terminal(Token token) {
        this(token, TERMINAL);
    }

    public Terminal(Token token, TerminalType terminalType) {
        super();
        setToken(token);
        setTerminalType(terminalType);
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
        initDisplayName();
    }

    public TerminalType getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(TerminalType terminalType) {
        this.terminalType = terminalType == null ? TERMINAL : terminalType;
        initDisplayName();
    }

    @Override
    public void initDisplayName() {
        String dn = token == null ? "" : token.getDisplayName();
        setDisplayName(format("%s:%s", dn, getTerminalType()));
    }
}
