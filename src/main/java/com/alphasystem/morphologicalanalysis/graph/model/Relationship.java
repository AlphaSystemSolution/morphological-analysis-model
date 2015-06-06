package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.common.model.Related;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Location;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.RelationshipType;
import com.alphasystem.persistence.mongo.model.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This class represents actual relationship between two {@link Location}(s) or {@link Fragment}(s).
 * Typical example of relationship between is <emp>Harf of Jar</emp> and <emp>Ism majroor</emp>.
 *
 * @author sali
 * @see Location
 * @see Fragment
 */
@Document
public class Relationship extends AbstractDocument {

    /**
     * Reference to child location
     */
    @DBRef
    protected Related child;

    /**
     * Reference to owner location
     */
    @DBRef
    protected Related owner;

    /**
     *
     */
    protected RelationshipType relationship;

    /**
     *
     */
    public Relationship() {
        super();
        initDisplayName();
    }

    public Related getChild() {
        return child;
    }

    public void setChild(Related child) {
        this.child = child;
    }

    public Related getOwner() {
        return owner;
    }

    public void setOwner(Related owner) {
        this.owner = owner;
    }

    public RelationshipType getRelationship() {
        return relationship;
    }

    public void setRelationship(RelationshipType relationship) {
        this.relationship = relationship;
    }
}
