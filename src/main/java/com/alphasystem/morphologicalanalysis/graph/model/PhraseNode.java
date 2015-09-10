package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.AlternateStatus;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.RelationshipType;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.PHRASE;

/**
 * @author sali
 */
@Document
public class PhraseNode extends LinkSupport {

    private static final long serialVersionUID = 8563558531527217502L;

    @DBRef
    protected List<PartOfSpeechNode> fragments;
    protected AlternateStatus alternateStatus;
    protected RelationshipType relationshipType;

    public PhraseNode() {
        this(null);
    }

    public PhraseNode(String id) {
        super(id, PHRASE);
        setFragments(null);
    }

    public AlternateStatus getAlternateStatus() {
        return alternateStatus;
    }

    public void setAlternateStatus(AlternateStatus alternateStatus) {
        this.alternateStatus = alternateStatus;
    }

    public List<PartOfSpeechNode> getFragments() {
        return fragments;
    }

    public void setFragments(List<PartOfSpeechNode> fragments) {
        this.fragments = new ArrayList<>();
        if (fragments != null) {
            this.fragments.addAll(fragments);
        }
    }

    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }


}
