package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.ROOT;

/**
 * @author sali
 */
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
