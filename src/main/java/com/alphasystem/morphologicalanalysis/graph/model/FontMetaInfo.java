package com.alphasystem.morphologicalanalysis.graph.model;

import com.querydsl.core.annotations.QueryEntity;

/**
 * @author sali
 */
@QueryEntity
public class FontMetaInfo {

    protected String family;

    protected String weight;

    protected String posture;

    protected double size;

    public FontMetaInfo(){
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

    public FontMetaInfo withFamily(String family){
        setFamily(family);
        return this;
    }

    public FontMetaInfo withSize(double size){
        setSize(size);
        return this;
    }
}
