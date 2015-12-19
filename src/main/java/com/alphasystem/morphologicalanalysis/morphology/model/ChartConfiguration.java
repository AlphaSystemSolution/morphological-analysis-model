/**
 *
 */
package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.morphologicalanalysis.morphology.model.support.SortDirection;
import com.alphasystem.morphologicalanalysis.morphology.model.support.SortDirective;
import com.alphasystem.persistence.model.AbstractSimpleDocument;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.morphology.model.support.SortDirection.ASCENDING;
import static com.alphasystem.morphologicalanalysis.morphology.model.support.SortDirective.NONE;

/**
 * @author sali
 */
@QueryEntity
@Document
@TypeAlias("ChartConfiguration")
public class ChartConfiguration extends AbstractSimpleDocument {

    private boolean omitToc;
    private boolean omitAbbreviatedConjugation;
    private boolean omitDetailedConjugation;
    private boolean omitTitle;
    private boolean omitHeader;
    private boolean omitSarfTermCaption;
    private SortDirective sortDirective;
    private SortDirection sortDirection;

    public ChartConfiguration() {
        setSortDirection(null);
        setSortDirection(null);
    }

    public SortDirection getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(SortDirection sortDirection) {
        this.sortDirection = (sortDirection == null) ? ASCENDING : sortDirection;
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
