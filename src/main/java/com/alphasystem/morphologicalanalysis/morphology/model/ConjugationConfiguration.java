/**
 *
 */
package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.persistence.model.AbstractSimpleDocument;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sali
 */
@QueryEntity
@Document(collection = ConjugationConfiguration.CONJUGATION_CONFIGURATION)
@TypeAlias(ConjugationConfiguration.CONJUGATION_CONFIGURATION)
public class ConjugationConfiguration extends AbstractSimpleDocument {

    static final String CONJUGATION_CONFIGURATION = "conjugation_configuration";

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
