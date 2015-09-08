package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.TERMINAL;

/**
 * @author sali
 */
public abstract class LineSupport extends GraphNode {

    private static final long serialVersionUID = 5068739165143371930L;

    /**
     * x1 location for line
     */
    protected Double x1;

    /**
     * y1 location for line
     */
    protected Double y1;

    /**
     * x2 location for line
     */
    protected Double x2;

    /**
     * y2 location for line
     */
    protected Double y2;

    public LineSupport() {
        this(null, TERMINAL);
    }

    public LineSupport(String id, GraphNodeType type) {
        super(id, type);
        setX1(null);
        setX2(null);
        setY1(null);
        setY2(null);
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = getPositiveValue(x1);
    }

    public Double getY1() {
        return y1;
    }

    public void setY1(Double y1) {
        this.y1 = getPositiveValue(y1);
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = getPositiveValue(x2);
    }

    public Double getY2() {
        return y2;
    }

    public void setY2(Double y2) {
        this.y2 = getPositiveValue(y2);
    }

}
