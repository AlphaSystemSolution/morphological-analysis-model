package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.common.model.VerseTokensPair;
import com.alphasystem.persistence.model.AbstractDocument;
import com.alphasystem.persistence.model.CascadeSave;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sali
 */
@QueryEntity
@Document
@TypeAlias("DependencyGraph")
public class DependencyGraph extends AbstractDocument {

    private static final String SEPARATOR = "|";
    protected Integer chapterNumber;
    protected List<VerseTokensPair> tokens;
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

    public List<VerseTokensPair> getTokens() {
        return tokens;
    }

    public void setTokens(List<VerseTokensPair> tokens) {
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
            VerseTokensPair token = tokens.get(0);
            dn.append(SEPARATOR).append(token.getDisplayName());
            for (int i = 1; i < size; i++) {
                token = tokens.get(i);
                dn.append(SEPARATOR).append(token.getDisplayName());
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
