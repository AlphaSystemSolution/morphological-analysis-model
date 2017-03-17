/**
 *
 */
package com.alphasystem.morphologicalengine.model;

import com.alphasystem.morphologicalengine.model.abbrvconj.ActiveLine;
import com.alphasystem.morphologicalengine.model.abbrvconj.AdverbLine;
import com.alphasystem.morphologicalengine.model.abbrvconj.ImperativeAndForbiddingLine;
import com.alphasystem.morphologicalengine.model.abbrvconj.PassiveLine;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static java.util.Objects.hash;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbbreviatedConjugation {

    private ConjugationHeader conjugationHeader;

    private ActiveLine activeLine;

    private PassiveLine passiveLine;

    private ImperativeAndForbiddingLine imperativeAndForbiddingLine;

    private AdverbLine adverbLine;

    public ConjugationHeader getConjugationHeader() {
        return conjugationHeader;
    }

    public void setConjugationHeader(ConjugationHeader conjugationHeader) {
        this.conjugationHeader = conjugationHeader;
    }

    public ActiveLine getActiveLine() {
        return activeLine;
    }

    public void setActiveLine(ActiveLine activeLine) {
        this.activeLine = activeLine;
    }

    public AbbreviatedConjugation activeLine(ActiveLine activeLine) {
        setActiveLine(activeLine);
        return this;
    }

    public PassiveLine getPassiveLine() {
        return passiveLine;
    }

    public void setPassiveLine(PassiveLine passiveLine) {
        this.passiveLine = passiveLine;
    }

    public AbbreviatedConjugation passiveLine(PassiveLine passiveLine) {
        setPassiveLine(passiveLine);
        return this;
    }

    public ImperativeAndForbiddingLine getImperativeAndForbiddingLine() {
        return imperativeAndForbiddingLine;
    }

    public void setImperativeAndForbiddingLine(ImperativeAndForbiddingLine imperativeAndForbiddingLine) {
        this.imperativeAndForbiddingLine = imperativeAndForbiddingLine;
    }

    public AbbreviatedConjugation imperativeAndForbiddingLine(ImperativeAndForbiddingLine imperativeAndForbiddingLine) {
        setImperativeAndForbiddingLine(imperativeAndForbiddingLine);
        return this;
    }

    public AdverbLine getAdverbLine() {
        return adverbLine;
    }

    public void setAdverbLine(AdverbLine adverbLine) {
        this.adverbLine = adverbLine;
    }

    public AbbreviatedConjugation adverbLine(AdverbLine adverbLine) {
        setAdverbLine(adverbLine);
        return this;
    }

    @Override
    public int hashCode() {
        return hash(activeLine, passiveLine, imperativeAndForbiddingLine, adverbLine);
    }
}
