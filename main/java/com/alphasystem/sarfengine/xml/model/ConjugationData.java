//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.01 at 04:51:01 PM EDT 
//

package com.alphasystem.sarfengine.xml.model;

import com.alphasystem.arabic.model.NamedTemplate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import static com.alphasystem.arabic.model.NamedTemplate.FORM_I_CATEGORY_A_GROUP_U_TEMPLATE;

/**
 * <p>
 * Java class for ConjugationData complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="ConjugationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="translation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstRadical" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondRadical" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thirdRadical" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fourthRadical" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verbalNouns" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adverbs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuration" type="{http://www.alphasystem.com/sarfengine/xml/model}ConjugationConfiguration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConjugationData", propOrder = {"template", "translation",
        "rootLetters", "container", "configuration"})
public class ConjugationData {

    @XmlElement(required = true)
    protected NamedTemplate template = FORM_I_CATEGORY_A_GROUP_U_TEMPLATE;
    protected String translation;
    @XmlElement(required = true)
    protected RootLetters rootLetters;
    protected VernalNounAndAdverbContainer container = new VernalNounAndAdverbContainer();
    protected ConjugationConfiguration configuration = new ConjugationConfiguration();

    /**
     * Gets the value of the container property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the adverbs property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <p>
     * <pre>
     * getContainer().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VernalNounAndAdverbContainer }
     */
    public VernalNounAndAdverbContainer getContainer() {
        if (container == null) {
            container = new VernalNounAndAdverbContainer();
        }
        return this.container;
    }

    /**
     * Sets the value of the container property.
     *
     * @param container allowed object is {@link VernalNounAndAdverbContainer }
     */
    public void setContainer(VernalNounAndAdverbContainer container) {
        this.container = container;
    }

    public ConjugationConfiguration getConfiguration() {
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

    public ConjugationData withRootLetters(RootLetters value) {
        setRootLetters(value);
        return this;
    }

    public ConjugationData withTemplate(NamedTemplate value) {
        setTemplate(value);
        return this;
    }

    public ConjugationData withTranslation(String value) {
        setTranslation(value);
        return this;
    }

    public ConjugationData withContainer(VernalNounAndAdverbContainer container) {
        setContainer(container);
        return this;
    }

    public ConjugationData withConfiguration(ConjugationConfiguration value) {
        setConfiguration(value);
        return this;
    }

}
