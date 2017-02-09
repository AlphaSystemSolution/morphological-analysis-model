//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.01 at 04:51:01 PM EDT 
//

package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.persistence.model.AbstractSimpleDocument;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 */
public class ConjugationTemplate extends AbstractSimpleDocument {

    protected List<ConjugationData> data;
    protected ChartConfiguration chartConfiguration;

    public ConjugationTemplate() {
        setChartConfiguration(null);
    }

    public ChartConfiguration getChartConfiguration() {
        return chartConfiguration;
    }

    public void setChartConfiguration(ChartConfiguration chartConfiguration) {
        this.chartConfiguration = (chartConfiguration == null) ? new ChartConfiguration() : chartConfiguration;
    }

    public List<ConjugationData> getData() {
        if (data == null) {
            data = new ArrayList<>();
        }
        return this.data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param data allowed object is {@link ConjugationData }
     */
    public void setData(List<ConjugationData> data) {
        this.data = data;
    }

    public ConjugationTemplate withData(Collection<ConjugationData> values) {
        if (values != null) {
            getData().addAll(values);
        }
        return this;
    }

    public ConjugationTemplate withData(ConjugationData... values) {
        if (values != null) {
            for (ConjugationData value : values) {
                getData().add(value);
            }
        }
        return this;
    }

    public ConjugationTemplate withData(List<ConjugationData> data) {
        setData(data);
        return this;
    }

}
