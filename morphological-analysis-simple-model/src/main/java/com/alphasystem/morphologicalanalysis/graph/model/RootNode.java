package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.ROOT;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RootNode extends GraphNode {

    private final GraphNodeType childNodeType;

    public RootNode(GraphNodeType childNodeType) {
        super(null, ROOT);
        this.childNodeType = childNodeType;
    }

    public GraphNodeType getChildNodeType() {
        return childNodeType;
    }

}
