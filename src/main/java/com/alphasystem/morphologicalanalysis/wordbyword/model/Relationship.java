package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.RelationshipType;
import com.alphasystem.persistence.mongo.model.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sali
 */
@Document
public class Relationship extends AbstractDocument {

    @DBRef
    protected Location child;

    @DBRef
    protected Location owner;

    protected RelationshipType relationship;

    /**
     *
     */
    public Relationship() {
        super();
        initDisplayName();
    }

    public Location getChild() {
        return child;
    }

    public void setChild(Location child) {
        this.child = child;
    }

    public Location getOwner() {
        return owner;
    }

    public void setOwner(Location owner) {
        this.owner = owner;
    }

    public RelationshipType getRelationship() {
        return relationship;
    }

    public void setRelationship(RelationshipType relationship) {
        this.relationship = relationship;
    }
}
