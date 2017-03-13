/**
 *
 */
package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.persistence.model.AbstractSimpleDocument;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConjugationConfiguration extends AbstractSimpleDocument {

    private boolean removePassiveLine;
    private boolean skipRuleProcessing;

    public ConjugationConfiguration() {
        super();
    }

    public ConjugationConfiguration(ConjugationConfiguration src){
        if(src == null){
            throw new NullPointerException("src cannot be null.");
        }
        setSkipRuleProcessing(src.isSkipRuleProcessing());
        setRemovePassiveLine(src.isRemovePassiveLine());
    }

    public boolean isRemovePassiveLine() {
        return removePassiveLine;
    }

    public void setRemovePassiveLine(boolean removePassiveLine) {
        this.removePassiveLine = removePassiveLine;
    }

    public boolean isSkipRuleProcessing() {
        return skipRuleProcessing;
    }

    public void setSkipRuleProcessing(boolean skipRuleProcessing) {
        this.skipRuleProcessing = skipRuleProcessing;
    }

    public ConjugationConfiguration removePassiveLine(boolean removePassiveLine) {
        setRemovePassiveLine(removePassiveLine);
        return this;
    }

    public ConjugationConfiguration skipRuleProcessing(boolean skipRuleProcessing) {
        setSkipRuleProcessing(skipRuleProcessing);
        return this;
    }
}
