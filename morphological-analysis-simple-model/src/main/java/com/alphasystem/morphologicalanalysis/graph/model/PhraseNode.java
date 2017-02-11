package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.AlternateStatus;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.RelationshipType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.PHRASE;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PhraseNode extends LinkSupport {

    private static final long serialVersionUID = 8563558531527217502L;

    private List<PartOfSpeechNode> fragments;
    private AlternateStatus alternateStatus;
    private List<RelationshipType> relationships;

    public PhraseNode() {
        this(null);
    }

    public PhraseNode(String id) {
        super(id, PHRASE);
        setFragments(null);
        setRelationships(null);
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

    private void setFragments(List<PartOfSpeechNode> fragments) {
        this.fragments = new ArrayList<>();
        if (fragments != null) {
            this.fragments.addAll(fragments);
        }
    }

    public List<RelationshipType> getRelationships() {
        return relationships;
    }

    private void setRelationships(List<RelationshipType> relationships) {
        this.relationships = new ArrayList<>();
        if (relationships != null) {
            this.relationships.addAll(relationships);
        }
    }
}
