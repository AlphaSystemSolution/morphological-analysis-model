/**
 *
 */
package com.alphasystem.sarfengine.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author sali
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConjugationConfigurationType")
public class ConjugationConfiguration {

    @XmlAttribute(name = "remove-passive-line", required = false)
    private boolean removePassiveLine;

    @XmlAttribute(name = "skip-rule-processing", required = false)
    private boolean skipRuleProcessing;

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
