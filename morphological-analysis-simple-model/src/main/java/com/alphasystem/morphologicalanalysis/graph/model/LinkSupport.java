package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.common.model.Linkable;
import com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.TERMINAL;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class LinkSupport extends LineSupport {

    private static final long serialVersionUID = 4736069403525106807L;

    /**
     * x location for circle.
     */
    private Double cx;
    /**
     * y location for circle
     */
    private Double cy;

   protected Linkable linkable;

    protected LinkSupport() {
        this(null, TERMINAL);
    }

    public LinkSupport(String id, GraphNodeType type) {
        super(id, type);
        setCx(null);
        setCy(null);
    }

    public Linkable getLinkable() {
        return linkable;
    }

    void setLinkable(Linkable linkable) {
        this.linkable = linkable;
    }

    public Double getCx() {
        return cx;
    }

    public void setCx(Double cx) {
        this.cx = getPositiveValue(cx);
    }

    public Double getCy() {
        return cy;
    }

    public void setCy(Double cy) {
        this.cy = getPositiveValue(cy);
    }

}
