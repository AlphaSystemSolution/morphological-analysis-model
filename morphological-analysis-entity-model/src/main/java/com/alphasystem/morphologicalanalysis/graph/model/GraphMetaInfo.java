package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.persistence.model.AbstractSimpleDocument;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author sali
 */
@Entity
@Document
public class GraphMetaInfo extends AbstractSimpleDocument {

    private static final double DEFAULT_TOTAL_WIDTH = 900.0;
    private static final double DEFAULT_TOTAL_HEIGHT = 600.0;
    private static final double DEFAULT_TOKEN_WIDTH = 80.0;
    private static final double DEFAULT_TOKEN_HEIGHT = 100.0;
    private static final double GAP_BETWEEN_TOKENS = 80.0;

    private Double width;
    private Double height;
    private Double tokenWidth;
    private Double tokenHeight;
    private Double gapBetweenTokens;
    private Boolean showGridLines;
    private Boolean showOutLines;
    private Boolean debugMode;
    private String backgroundColor;
    @Field("term_font")
    private FontMetaInfo terminalFont;
    @Field("pos_font")
    private FontMetaInfo partOfSpeechFont;
    @Field("trans_font")
    private FontMetaInfo translationFont;

    public GraphMetaInfo() {
        super();
        setWidth(null);
        setHeight(null);
        setGapBetweenTokens(null);
        setTokenWidth(null);
        setTokenHeight(null);
        setDebugMode(false);
        setShowGridLines(false);
        setShowOutLines(false);
    }

    private Double getDefaultValue(Double src, Double defaultValue) {
        return src == null || src <= 0 ? defaultValue : src;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = getDefaultValue(width, DEFAULT_TOTAL_WIDTH);
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = getDefaultValue(height, DEFAULT_TOTAL_HEIGHT);
    }

    public Double getTokenWidth() {
        return tokenWidth;
    }

    public void setTokenWidth(Double tokenWidth) {
        this.tokenWidth = getDefaultValue(tokenWidth, DEFAULT_TOKEN_WIDTH);
    }

    public Double getTokenHeight() {
        return tokenHeight;
    }

    public void setTokenHeight(Double tokenHeight) {
        this.tokenHeight = getDefaultValue(tokenHeight, DEFAULT_TOKEN_HEIGHT);
    }

    public Double getGapBetweenTokens() {
        return gapBetweenTokens;
    }

    public void setGapBetweenTokens(Double gapBetweenTokens) {
        this.gapBetweenTokens = getDefaultValue(gapBetweenTokens, GAP_BETWEEN_TOKENS);
    }

    public Boolean isShowGridLines() {
        return showGridLines;
    }

    public void setShowGridLines(Boolean showGridLines) {
        this.showGridLines = showGridLines == null ? true : showGridLines;
    }

    public Boolean isShowOutLines() {
        return showOutLines;
    }

    public void setShowOutLines(Boolean showOutLines) {
        this.showOutLines = showOutLines == null ? true : showOutLines;
    }

    public Boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode == null ? false : debugMode;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public FontMetaInfo getTerminalFont() {
        return terminalFont;
    }

    public void setTerminalFont(FontMetaInfo terminalFont) {
        this.terminalFont = terminalFont;
    }

    public FontMetaInfo getPartOfSpeechFont() {
        return partOfSpeechFont;
    }

    public void setPartOfSpeechFont(FontMetaInfo partOfSpeechFont) {
        this.partOfSpeechFont = partOfSpeechFont;
    }

    public FontMetaInfo getTranslationFont() {
        return translationFont;
    }

    public void setTranslationFont(FontMetaInfo translationFont) {
        this.translationFont = translationFont;
    }
}
