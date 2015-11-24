/**
 *
 */
package com.alphasystem.sarfengine.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author sali
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootWordContainerType", propOrder = {"rootWords"})
public abstract class RootWordContainer {

    protected List<RootWord> rootWords;

    public List<RootWord> getRootWords() {
        if (rootWords == null) {
            rootWords = new ArrayList<>();
        }
        return rootWords;
    }

    public void setRootWords(List<RootWord> rootWords) {
        this.rootWords = rootWords == null ? new ArrayList<>()
                : rootWords;
    }

    public RootWord[] toArray() {
        RootWord[] result = null;
        if (rootWords != null && !rootWords.isEmpty()) {
            result = rootWords.toArray(new RootWord[rootWords.size()]);
        }
        return result;
    }

    public RootWordContainer withRootWords(Collection<RootWord> rootWords) {
        if (rootWords != null && rootWords.isEmpty()) {
            getRootWords().addAll(rootWords);
        }
        return this;
    }

    public RootWordContainer withRootWords(List<RootWord> rootWords) {
        setRootWords(rootWords);
        return this;
    }

    public RootWordContainer withRootWords(RootWord... rootWords) {
        if (rootWords != null && rootWords.length > 0) {
            for (RootWord rootWord : rootWords) {
                if (rootWord == null) {
                    System.out.println("NULL FOUND");
                    continue;
                }
                getRootWords().add(rootWord);
            }
        }
        return this;
    }
}
