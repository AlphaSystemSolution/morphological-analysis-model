package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType;
import com.alphasystem.persistence.model.AbstractDocument;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.TERMINAL;

/**
 * @author sali
 */
public abstract class GraphNode extends AbstractDocument {

    private static final long serialVersionUID = -3423247102141013999L;
    private static final FontMetaInfo DEFAULT_FONT = new FontMetaInfo("Arabic Typesetting", "NORMAL", "REGULAR", 14.0);

    protected GraphNodeType graphNodeType;
    protected Integer chapterNumber;
    protected Integer verseNumber;
    protected Integer tokenNumber;
    protected Integer version;
    protected Double x;
    protected Double y;
    protected Double translateX;
    protected Double translateY;
    protected FontMetaInfo font;

    public GraphNode() {
        this(null, TERMINAL);
    }

    public GraphNode(String id, GraphNodeType type) {
        super(id);
        setGraphNodeType(type);
        setX(null);
        setY(null);
        setTranslateX(null);
        setTranslateY(null);
        setFont(null);
        setVersion(0);
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public Integer getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(Integer tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public Integer getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(Integer verseNumber) {
        this.verseNumber = verseNumber;
    }

    FontMetaInfo getDefaultFont() {
        return DEFAULT_FONT;
    }

    protected Double getPositiveValue(Double src) {
        return src == null ? 0.0 : src;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = getPositiveValue(x);
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = getPositiveValue(y);
    }

    public Double getTranslateX() {
        return translateX;
    }

    public void setTranslateX(Double translateX) {
        this.translateX = getPositiveValue(translateX);
    }

    public Double getTranslateY() {
        return translateY;
    }

    public void setTranslateY(Double translateY) {
        this.translateY = getPositiveValue(translateY);
    }

    public GraphNodeType getGraphNodeType() {
        return graphNodeType;
    }

    public void setGraphNodeType(GraphNodeType graphNodeType) {
        this.graphNodeType = graphNodeType == null ? TERMINAL : graphNodeType;
    }

    public FontMetaInfo getFont() {
        return font;
    }

    public void setFont(FontMetaInfo font) {
        this.font = font == null ? getDefaultFont() : font;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version == null ? 0 : version;
    }
}
