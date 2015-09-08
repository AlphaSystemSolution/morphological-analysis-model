package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.AlternateStatus;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.RelationshipType;
import com.alphasystem.persistence.mongo.model.CascadeSave;
import org.springframework.data.mongodb.core.mapping.DBRef;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.RELATIONSHIP;

/**
 * @author sali
 */
public class RelationshipNode extends GraphNode {

    private static final long serialVersionUID = -958480666990518422L;

    protected AlternateStatus alternateStatus;
    protected RelationshipType relationshipType;
    private Double controlX1;
    private Double controlY1;
    private Double controlX2;
    private Double controlY2;
    private Double t1;
    private Double t2;

    @DBRef
    @CascadeSave
    private LinkSupport dependent;

    @DBRef
    @CascadeSave
    private LinkSupport owner;

    public RelationshipNode() {
        this(null);
    }

    public RelationshipNode(String id) {
        super(id, RELATIONSHIP);
    }

    public LinkSupport getDependent() {
        return dependent;
    }

    public void setDependent(LinkSupport dependent) {
        this.dependent = dependent;
    }

    public LinkSupport getOwner() {
        return owner;
    }

    public void setOwner(LinkSupport owner) {
        this.owner = owner;
    }

    public AlternateStatus getAlternateStatus() {
        return alternateStatus;
    }

    public void setAlternateStatus(AlternateStatus alternateStatus) {
        this.alternateStatus = alternateStatus;
    }

    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    public Double getControlX1() {
        return controlX1;
    }

    public void setControlX1(Double controlX1) {
        this.controlX1 = controlX1;
    }

    public Double getControlY1() {
        return controlY1;
    }

    public void setControlY1(Double controlY1) {
        this.controlY1 = controlY1;
    }

    public Double getControlX2() {
        return controlX2;
    }

    public void setControlX2(Double controlX2) {
        this.controlX2 = controlX2;
    }

    public Double getControlY2() {
        return controlY2;
    }

    public void setControlY2(Double controlY2) {
        this.controlY2 = controlY2;
    }

    public Double getT1() {
        return t1;
    }

    public void setT1(Double t1) {
        this.t1 = t1;
    }

    public Double getT2() {
        return t2;
    }

    public void setT2(Double t2) {
        this.t2 = t2;
    }

}
