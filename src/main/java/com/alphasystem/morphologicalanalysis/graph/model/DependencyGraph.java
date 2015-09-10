package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.persistence.mongo.model.AbstractDocument;
import com.alphasystem.persistence.mongo.model.CascadeSave;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * @author sali
 */
@Document
public class DependencyGraph extends AbstractDocument {

    protected Integer chapterNumber;

    protected Integer verseNumber;

    protected Integer firstTokenIndex;

    protected Integer lastTokenIndex;

    protected GraphMetaInfo metaInfo;

    @DBRef
    @CascadeSave
    protected List<GraphNode> nodes;

    public DependencyGraph() {
        super();
        setNodes(null);
        setMetaInfo(null);
    }

    @PersistenceConstructor
    public DependencyGraph(Integer chapterNumber, Integer verseNumber, Integer firstTokenIndex,
                           Integer lastTokenIndex) {
        super();
        this.chapterNumber = chapterNumber;
        this.verseNumber = verseNumber;
        this.firstTokenIndex = firstTokenIndex;
        this.lastTokenIndex = lastTokenIndex;
        setNodes(null);
        setMetaInfo(null);

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

    public Integer getLastTokenIndex() {
        return lastTokenIndex;
    }

    public void setLastTokenIndex(Integer lastTokenIndex) {
        this.lastTokenIndex = lastTokenIndex;
    }

    @Override
    public void initDisplayName() {
        setDisplayName(format("%s:%s:%s:%s", chapterNumber, verseNumber, firstTokenIndex, lastTokenIndex));
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public Integer getFirstTokenIndex() {
        return firstTokenIndex;
    }

    public void setFirstTokenIndex(Integer firstTokenIndex) {
        this.firstTokenIndex = firstTokenIndex;
    }

    public Integer getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(Integer verseNumber) {
        this.verseNumber = verseNumber;
    }

}
