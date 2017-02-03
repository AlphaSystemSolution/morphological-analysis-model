/**
 *
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.ConversationType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.IncompleteVerb;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.VerbMode;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.VerbType;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.arabic.model.ArabicWord.concatenateWithSpace;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.ConversationType.THIRD_PERSON;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.VerbType.PERFECT;

/**
 * @author sali
 */
@Entity
@Document
public class VerbProperties extends AbstractProperties {

    private static final long serialVersionUID = 579863620988819896L;
    protected ConversationType conversationType;

    protected VerbType verbType;

    protected VerbMode mode;

    protected IncompleteVerb incompleteVerb;

    public VerbProperties() {
        super();
        setVerbType(null);
        setMode(null);
        setConversationType(null);
        setIncompleteVerb(null);
    }

    /**
     * @param src
     * @throws NullPointerException
     */
    public VerbProperties(VerbProperties src) throws NullPointerException {
        super(src);
        setVerbType(src.getVerbType());
        setMode(src.getMode());
        setConversationType(src.getConversationType());
        setIncompleteVerb(src.getIncompleteVerb());
    }

    public IncompleteVerb getIncompleteVerb() {
        return incompleteVerb;
    }

    public void setIncompleteVerb(IncompleteVerb incompleteVerb) {
        this.incompleteVerb = incompleteVerb;
    }

    public ConversationType getConversationType() {
        return conversationType;
    }

    public void setConversationType(ConversationType conversationType) {
        this.conversationType = conversationType == null ? THIRD_PERSON
                : conversationType;
    }

    @Override
    @Transient
    public ArabicWord label() {
        return concatenateWithSpace(gender.toLabel(),
                conversationType.toLabel(), number.toLabel());
    }

    public VerbMode getMode() {
        return mode;
    }

    public void setMode(VerbMode mode) {
        this.mode = mode;
    }

    public VerbType getVerbType() {
        return verbType;
    }

    public void setVerbType(VerbType verbType) {
        this.verbType = verbType == null ? PERFECT : verbType;
    }

    public VerbProperties withConversationType(ConversationType conversationType) {
        setConversationType(conversationType);
        return this;
    }

    public VerbProperties withVerbMode(VerbMode verbMode) {
        setMode(verbMode);
        return this;
    }

    public VerbProperties withVerbType(VerbType verbType) {
        setVerbType(verbType);
        return this;
    }
}
