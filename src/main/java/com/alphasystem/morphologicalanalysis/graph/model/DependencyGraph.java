package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.persistence.mongo.model.AbstractDocument;
import com.alphasystem.persistence.mongo.model.CascadeSave;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sali
 */
@Document
public class DependencyGraph extends AbstractDocument {

    protected Integer chapterNumber;
    protected List<DependencyGraphTokenInfo> tokens;
    protected GraphMetaInfo metaInfo;
    @DBRef
    @CascadeSave
    protected List<GraphNode> nodes;

    public DependencyGraph() {
        super();
        setTokens(null);
        setNodes(null);
        setMetaInfo(null);
    }

    @PersistenceConstructor
    public DependencyGraph(Integer chapterNumber) {
        super();
        setChapterNumber(chapterNumber);
        setTokens(null);
        setNodes(null);
        setMetaInfo(null);

    }

    public List<DependencyGraphTokenInfo> getTokens() {
        return tokens;
    }

    public void setTokens(List<DependencyGraphTokenInfo> tokens) {
        this.tokens = new ArrayList<>();
        if (tokens != null) {
            this.tokens.addAll(tokens);
        }
    }

    public boolean addNode(GraphNode graphNode) {
        return getNodes().add(graphNode);
    }

    public GraphMetaInfo getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(GraphMetaInfo metaInfo) {
        this.metaInfo = metaInfo == null ? new GraphMetaInfo() : metaInfo;
    }

    public List<GraphNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<GraphNode> nodes) {
        this.nodes = new ArrayList<>();
        if (nodes != null && !nodes.isEmpty()) {
            this.nodes.addAll(nodes);
        }
    }

    @Override
    public void initDisplayName() {
        StringBuilder dn = new StringBuilder();
        dn.append(chapterNumber);
        int size = tokens.size();
        if (size > 0) {
            DependencyGraphTokenInfo token = tokens.get(0);
            dn.append("::").append(token.getDisplayName());
            for (int i = 1; i < size; i++) {
                token = tokens.get(i);
                dn.append("::").append(token.getDisplayName());
            }
        }
        setDisplayName(dn.toString());
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

}
