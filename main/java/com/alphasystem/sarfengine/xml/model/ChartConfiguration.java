/**
 *
 */
package com.alphasystem.sarfengine.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import static com.alphasystem.sarfengine.xml.model.SortDirection.DEFAULT;
import static com.alphasystem.sarfengine.xml.model.SortDirective.NONE;

/**
 * @author sali
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChartConfigurationType")
public class ChartConfiguration {

    @XmlAttribute(name = "omit-toc", required = false)
    private boolean omitToc;

    @XmlAttribute(name = "omit-abbreviated-conjugation", required = false)
    private boolean omitAbbreviatedConjugation;

    @XmlAttribute(name = "omit-detailed-conjugation", required = false)
    private boolean omitDetailedConjugation;

    @XmlAttribute(name = "omit-title", required = false)
    private boolean omitTitle;

    @XmlAttribute(name = "omit-header", required = false)
    private boolean omitHeader;

    @XmlAttribute(name = "omit-sarf-term-caption", required = false)
    private boolean omitSarfTermCaption;

    @XmlAttribute(name = "sort-directive", required = true)
    private SortDirective sortDirective;

    @XmlAttribute(name = "sort-direction", required = true)
    private SortDirection sortDirection;

    public ChartConfiguration() {
        setSortDirection(null);
        setSortDirection(null);
    }

    public SortDirection getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(SortDirection sortDirection) {
        this.sortDirection = (sortDirection == null) ? DEFAULT : sortDirection;
    }

    public SortDirective getSortDirective() {
        return sortDirective;
    }

    public void setSortDirective(SortDirective sortDirective) {
        this.sortDirective = (sortDirective == null) ? NONE : sortDirective;
    }

    public boolean isOmitAbbreviatedConjugation() {
        return omitAbbreviatedConjugation;
    }

    public void setOmitAbbreviatedConjugation(boolean omitAbbreviatedConjugation) {
        this.omitAbbreviatedConjugation = omitAbbreviatedConjugation;
    }

    public boolean isOmitDetailedConjugation() {
        return omitDetailedConjugation;
    }

    public void setOmitDetailedConjugation(boolean omitDetailedConjugation) {
        this.omitDetailedConjugation = omitDetailedConjugation;
    }

    public boolean isOmitHeader() {
        return omitHeader;
    }

    public void setOmitHeader(boolean omitHeader) {
        this.omitHeader = omitHeader;
    }

    public boolean isOmitSarfTermCaption() {
        return omitSarfTermCaption;
    }

    public void setOmitSarfTermCaption(boolean omitSarfTermCaption) {
        this.omitSarfTermCaption = omitSarfTermCaption;
    }

    public boolean isOmitTitle() {
        return omitTitle;
    }

    public void setOmitTitle(boolean omitTitle) {
        this.omitTitle = omitTitle;
    }

    public boolean isOmitToc() {
        return omitToc;
    }

    public void setOmitToc(boolean omitToc) {
        this.omitToc = omitToc;
    }

    public ChartConfiguration withOmitAbbreviatedConjugation(
            boolean omitAbbreviatedConjugation) {
        setOmitAbbreviatedConjugation(omitAbbreviatedConjugation);
        return this;
    }

    public ChartConfiguration withOmitDetailedConjugation(
            boolean omitDetailedConjugation) {
        setOmitDetailedConjugation(omitDetailedConjugation);
        return this;
    }

    public ChartConfiguration withOmitHeader(boolean omitHeader) {
        setOmitHeader(omitHeader);
        return this;
    }

    public ChartConfiguration withOmitTitle(boolean omitTitle) {
        setOmitTitle(omitTitle);
        return this;
    }

    public ChartConfiguration withOmitToc(boolean omitToc) {
        setOmitToc(omitToc);
        return this;
    }

    public ChartConfiguration withSortDirection(SortDirection sortDirection) {
        setSortDirection(sortDirection);
        return this;
    }

    public ChartConfiguration withSortDirective(SortDirective sortDirective) {
        setSortDirective(sortDirective);
        return this;
    }
}
