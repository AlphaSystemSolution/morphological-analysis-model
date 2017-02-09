package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.persistence.model.AbstractSimpleDocument;

import static java.lang.String.format;

/**
 * @author sali
 */
public class FontMetaInfo extends AbstractSimpleDocument {

    private String family;
    private String weight;
    private String posture;
    private double size;

    public FontMetaInfo() {
        super();
    }

    public FontMetaInfo(String family, String weight, String posture, double size) {
        this.family = family;
        this.weight = weight;
        this.posture = posture;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPosture() {
        return posture;
    }

    public void setPosture(String posture) {
        this.posture = posture;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public FontMetaInfo withFamily(String family) {
        setFamily(family);
        return this;
    }

    public FontMetaInfo withSize(double size) {
        setSize(size);
        return this;
    }

    @Override
    public String toString() {
        return format("%s:%s:%s:%s:%s:%s", getClass().getSimpleName(), id, family, weight, posture, size);
    }
}
