//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.01 at 04:51:01 PM EDT 
//

package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.morphology.model.support.VerbalNoun;
import com.alphasystem.persistence.model.AbstractSimpleDocument;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sali
 */
@Entity
@Document
public class ConjugationData extends AbstractSimpleDocument {

    protected NamedTemplate template;
    protected String translation;
    protected RootLetters rootLetters;
    protected List<VerbalNoun> verbalNouns;
    protected ConjugationConfiguration configuration = new ConjugationConfiguration();

    public ConjugationData() {
        setTemplate(NamedTemplate.FORM_I_CATEGORY_A_GROUP_U_TEMPLATE);
    }

    public List<VerbalNoun> getVerbalNouns() {
        if (verbalNouns == null) {
            verbalNouns = new ArrayList<>();
        }
        return verbalNouns;
    }

    public void setVerbalNouns(List<VerbalNoun> verbalNouns) {
        this.verbalNouns = new ArrayList<>();
        this.verbalNouns.addAll(verbalNouns);
    }

    public void addVerbalNouns(VerbalNoun... verbalNouns) {
        getVerbalNouns().addAll(Arrays.asList(verbalNouns));
    }

    public ConjugationConfiguration getConfiguration() {
        if (configuration == null) {
            configuration = new ConjugationConfiguration();
        }
        return configuration;
    }

    public void setConfiguration(ConjugationConfiguration configuration) {
        this.configuration = configuration == null ? new ConjugationConfiguration()
                : configuration;
    }

    /**
     * Gets the value of the rootLetters property.
     *
     * @return possible object is {@link RootLetters }
     */
    public RootLetters getRootLetters() {
        if (rootLetters == null) {
            rootLetters = new RootLetters();
        }
        return rootLetters;
    }

    /**
     * Sets the value of the rootLetters property.
     *
     * @param value allowed object is {@link RootLetters }
     */
    public void setRootLetters(RootLetters value) {
        this.rootLetters = value;
    }

    /**
     * Gets the value of the template property.
     *
     * @return possible object is {@link NamedTemplate }
     */
    public NamedTemplate getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     *
     * @param value allowed object is {@link NamedTemplate }
     */
    public void setTemplate(NamedTemplate value) {
        this.template = value;
    }

    /**
     * Gets the value of the translation property.
     *
     * @return possible object is {@link String }
     */
    public String getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     *
     * @param value allowed object is {@link String }
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

}
