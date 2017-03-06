package com.alphasystem.morphologicalanalysis.common.model;

import com.alphasystem.util.AppUtil;
import com.alphasystem.util.IdGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sali
 */
public class VerseTokenPairGroup implements Comparable<VerseTokenPairGroup> {

    private final String id;
    private Integer chapterNumber;
    private List<VerseTokensPair> pairs;
    private boolean includeHidden;

    public VerseTokenPairGroup() {
        this(0);
    }

    public VerseTokenPairGroup(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
        this.id = IdGenerator.nextId();
        setPairs(null);
    }

    public String getId() {
        return id;
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public boolean isIncludeHidden() {
        return includeHidden;
    }

    public void setIncludeHidden(boolean includeHidden) {
        this.includeHidden = includeHidden;
    }

    public List<VerseTokensPair> getPairs() {
        return pairs;
    }

    public void setPairs(List<VerseTokensPair> pairs) {
        this.pairs = new ArrayList<>();
        if (pairs != null && !pairs.isEmpty()) {
            this.pairs.addAll(pairs);
        }
    }

    public void addPairs(VerseTokensPair... pairs) {
        Collections.addAll(this.pairs, pairs);
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = super.equals(obj);
        if(AppUtil.isInstanceOf(VerseTokenPairGroup.class, obj)){
            VerseTokenPairGroup o = (VerseTokenPairGroup) obj;
            result = getId().equals(o.getId());
        }
        return result;
    }

    @Override
    public int compareTo(VerseTokenPairGroup o) {
        int result = 1;
        if(o != null){
            result = getId().compareTo(o.getId());
        }
        return result;
    }

    @Override
    public String toString() {
        if (pairs.isEmpty()) {
            return super.toString();
        }
        StringBuilder builder = new StringBuilder();
        builder.append(chapterNumber).append("||");
        builder.append(pairs.get(0));
        for (int i = 1; i < pairs.size(); i++) {
            builder.append("|").append(pairs.get(i));
        }
        return builder.toString();
    }
}
