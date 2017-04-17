/**
 *
 */
package com.alphasystem.morphologicalengine.model.abbrvconj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static java.util.Objects.hash;

/**
 * @author sali
 */
@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImperativeAndForbiddingLine {

    private String imperative;
    private String imperativeWithPrefix;
    private String forbidding;
    private String forbiddingWithPrefix;

    public String getImperative() {
        return imperative;
    }

    public void setImperative(String imperative) {
        this.imperative = imperative;
    }

    public ImperativeAndForbiddingLine imperative(String imperative) {
        setImperative(imperative);
        return this;
    }

    public String getForbidding() {
        return forbidding;
    }

    public void setForbidding(String forbidding) {
        this.forbidding = forbidding;
    }

    public ImperativeAndForbiddingLine forbidding(String forbidding) {
        setForbidding(forbidding);
        return this;
    }

    public String getImperativeWithPrefix() {
        return imperativeWithPrefix;
    }

    public void setImperativeWithPrefix(String imperativeWithPrefix) {
        this.imperativeWithPrefix = imperativeWithPrefix;
    }

    public ImperativeAndForbiddingLine imperativeWithPrefix(String imperativeWithPrefix) {
        setImperativeWithPrefix(imperativeWithPrefix);
        return this;
    }

    public String getForbiddingWithPrefix() {
        return forbiddingWithPrefix;
    }

    public void setForbiddingWithPrefix(String forbiddingWithPrefix) {
        this.forbiddingWithPrefix = forbiddingWithPrefix;
    }

    public ImperativeAndForbiddingLine forbiddingWithPrefix(String forbiddingWithPrefix) {
        setForbiddingWithPrefix(forbiddingWithPrefix);
        return this;
    }

    @Override
    public int hashCode() {
        return hash(imperative, forbidding);
    }
}
