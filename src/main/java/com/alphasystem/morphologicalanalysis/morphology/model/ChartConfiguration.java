/**
 *
 */
package com.alphasystem.morphologicalanalysis.morphology.model;

import com.alphasystem.arabic.ui.util.FontUtilities;
import com.alphasystem.morphologicalanalysis.morphology.model.support.SortDirection;
import com.alphasystem.morphologicalanalysis.morphology.model.support.SortDirective;
import com.alphasystem.persistence.model.AbstractSimpleDocument;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.morphology.model.support.SortDirection.ASCENDING;
import static com.alphasystem.morphologicalanalysis.morphology.model.support.SortDirective.NONE;

/**
 * @author sali
 */
@Entity
@Document
public class ChartConfiguration extends AbstractSimpleDocument {

    private boolean omitToc;
    private boolean omitAbbreviatedConjugation;
    private boolean omitDetailedConjugation;
    private boolean omitTitle;
    private boolean omitHeader;
    private boolean omitSarfTermCaption;
    private SortDirective sortDirective;
    private SortDirection sortDirection;
    private String arabicFontFamily;
    private String translationFontFamily;
    private long arabicFontSize;
    private long translationFontSize;
    private long headingFontSize;

    public ChartConfiguration() {
        setSortDirection(null);
        setSortDirection(null);
        setArabicFontFamily(null);
        setTranslationFontFamily(null);
        setArabicFontSize(0);
        setTranslationFontSize(0);
        setHeadingFontSize(0);
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

    public String getArabicFontFamily() {
        return arabicFontFamily;
    }

    public void setArabicFontFamily(String arabicFontFamily) {
        this.arabicFontFamily = (arabicFontFamily == null) ? FontUtilities.getDefaultArabicFontName() : arabicFontFamily;
    }

    public String getTranslationFontFamily() {
        return translationFontFamily;
    }

    public void setTranslationFontFamily(String translationFontFamily) {
        this.translationFontFamily = (translationFontFamily == null) ? FontUtilities.getDefaultEnglishFont() : translationFontFamily;
    }

    public long getArabicFontSize() {
        return arabicFontSize;
    }

    public void setArabicFontSize(long arabicFontSize) {
        this.arabicFontSize = (arabicFontSize <= 0) ? 20 : arabicFontSize;
    }

    public long getTranslationFontSize() {
        return translationFontSize;
    }

    public void setTranslationFontSize(long translationFontSize) {
        this.translationFontSize = (translationFontSize <= 0) ? 12 : translationFontSize;
    }

    public long getHeadingFontSize() {
        return headingFontSize;
    }

    public void setHeadingFontSize(long headingFontSize) {
        this.headingFontSize = (headingFontSize <= 0) ? 36 : headingFontSize;
    }

    public ChartConfiguration omitAbbreviatedConjugation(boolean omitAbbreviatedConjugation) {
        setOmitAbbreviatedConjugation(omitAbbreviatedConjugation);
        return this;
    }

    public ChartConfiguration omitDetailedConjugation(boolean omitDetailedConjugation) {
        setOmitDetailedConjugation(omitDetailedConjugation);
        return this;
    }

    public ChartConfiguration omitHeader(boolean omitHeader) {
        setOmitHeader(omitHeader);
        return this;
    }

    public ChartConfiguration omitTitle(boolean omitTitle) {
        setOmitTitle(omitTitle);
        return this;
    }

    public ChartConfiguration omitToc(boolean omitToc) {
        setOmitToc(omitToc);
        return this;
    }

    public ChartConfiguration sortDirection(SortDirection sortDirection) {
        setSortDirection(sortDirection);
        return this;
    }

    public ChartConfiguration sortDirective(SortDirective sortDirective) {
        setSortDirective(sortDirective);
        return this;
    }

    public ChartConfiguration arabicFontFamily(String arabicFontFamily) {
        setArabicFontFamily(arabicFontFamily);
        return this;
    }

    public ChartConfiguration translationFontFamily(String translationFontFamily) {
        setTranslationFontFamily(translationFontFamily);
        return this;
    }

    public ChartConfiguration arabicFontSize(long arabicFontSize) {
        setArabicFontSize(arabicFontSize);
        return this;
    }

    public ChartConfiguration translationFontSize(long translationFontSize) {
        setTranslationFontSize(translationFontSize);
        return this;
    }

    public ChartConfiguration headingFontSize(long headingFontSize) {
        setHeadingFontSize(headingFontSize);
        return this;
    }
}
