package com.alphasystem.morphologicalengine.model;

import com.alphasystem.app.morphologicalengine.conjugation.model.ChartMode;
import com.alphasystem.arabic.model.NamedTemplate;
import com.alphasystem.morphologicalanalysis.morphology.model.RootLetters;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MorphologicalChart {

    private AbbreviatedConjugation abbreviatedConjugation;
    private DetailedConjugation detailedConjugation;
    private ConjugationHeader conjugationHeader;

    public MorphologicalChart() {
    }

    /**
     * @param abbreviatedConjugation
     * @param detailedConjugation
     */
    public MorphologicalChart(AbbreviatedConjugation abbreviatedConjugation, DetailedConjugation detailedConjugation) {
        setAbbreviatedConjugation(abbreviatedConjugation);
        setDetailedConjugation(detailedConjugation);
    }

    public AbbreviatedConjugation getAbbreviatedConjugation() {
        return abbreviatedConjugation;
    }

    public void setAbbreviatedConjugation(AbbreviatedConjugation abbreviatedConjugation) {
        this.abbreviatedConjugation = abbreviatedConjugation;
        conjugationHeader = (abbreviatedConjugation == null) ? null : abbreviatedConjugation.getConjugationHeader();
    }

    public DetailedConjugation getDetailedConjugation() {
        return detailedConjugation;
    }

    public void setDetailedConjugation(DetailedConjugation detailedConjugation) {
        this.detailedConjugation = detailedConjugation;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && MorphologicalChart.class.isAssignableFrom(obj.getClass())) {
            MorphologicalChart other = (MorphologicalChart) obj;
            SarfChartComparator c = new SarfChartComparator();
            result = c.compare(this, other) == 0;
        }
        return result;
    }

    public ConjugationHeader header() {
        return conjugationHeader;
    }

    public NamedTemplate namedTemplate() {
        NamedTemplate namedTemplate = null;
        if (conjugationHeader != null) {
            ChartMode chartMode = conjugationHeader.getChartMode();
            if (chartMode != null) {
                namedTemplate = chartMode.getTemplate();
            }
        }
        return namedTemplate;
    }

    public RootLetters rootLetters() {
        return conjugationHeader == null ? new RootLetters() : conjugationHeader.getRootLetters();
    }

}
