package com.alphasystem.morphologicalanalysis.graph.model;

import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.TypeAlias;

/**
 * @author sali
 */
@QueryEntity
@TypeAlias("GraphMetaInfo")
public class GraphMetaInfo {

    private static final double DEFAULT_TOTAL_WIDTH = 900.0;
    private static final double DEFAULT_TOTAL_HEIGHT = 600.0;
    private static final double DEFAULT_TOKEN_WIDTH = 60.0;
    private static final double DEFAULT_TOKEN_HEIGHT = 100.0;

    private Double width;
    private Double height;
    private Double tokenWidth;
    private Double tokenHeight;
    private Double gapBetweenTokens;
    private Boolean showGridLines;
    private Boolean showOutLines;
    private Boolean debugMode;

    public GraphMetaInfo() {
        setWidth(null);
        setHeight(null);
        setGapBetweenTokens(null);
        setTokenWidth(null);
        setTokenHeight(null);
        setDebugMode(false);
        setShowGridLines(true);
        setShowOutLines(true);
    }

    private Double getDefaultValue(Double src, Double defaultValue) {
        return src == null || src.doubleValue() <= 0 ? defaultValue : src;
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
        this.gapBetweenTokens = getDefaultValue(gapBetweenTokens, 60.0);
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

}
