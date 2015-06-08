package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.common.model.Related;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Location;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.RelationshipType;
import com.alphasystem.persistence.mongo.model.AbstractDocument;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import static java.lang.String.format;

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
     * Reference to dependent location
     */
    @DBRef
    protected Related dependent;

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
    }

    @Override
    public void initDisplayName() {
        String dn1 = dependent == null ? "" : dependent.getDisplayName();
        String dn2 = owner == null ? "" : owner.getDisplayName();
        setDisplayName(format("%s::%s", dn1, dn2));
    }

    public Related getDependent() {
        return dependent;
    }

    public void setDependent(Related dependent) {
        this.dependent = dependent;
        if (this.dependent != null) {
            initDisplayName();
        }
    }

    public Related getOwner() {
        return owner;
    }

    public void setOwner(Related owner) {
        this.owner = owner;
        if (this.owner != null) {
            initDisplayName();
        }
    }

    public RelationshipType getRelationship() {
        return relationship;
    }

    public void setRelationship(RelationshipType relationship) {
        this.relationship = relationship;
    }
}
