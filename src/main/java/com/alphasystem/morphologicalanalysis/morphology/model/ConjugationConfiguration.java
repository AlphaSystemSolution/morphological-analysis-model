/**
 *
 */
package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.persistence.model.AbstractSimpleDocument;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sali
 */
@Entity
@Document
public class ConjugationConfiguration extends AbstractSimpleDocument {

    private boolean removePassiveLine;
    private boolean skipRuleProcessing;

    public ConjugationConfiguration() {
        super();
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

    public ConjugationConfiguration withRemovePassiveLine(
            boolean removePassiveLine) {
        setRemovePassiveLine(removePassiveLine);
        return this;
    }

    public ConjugationConfiguration withSkipRuleProcessing(
            boolean skipRuleProcessing) {
        setSkipRuleProcessing(skipRuleProcessing);
        return this;
    }
}
