package com.alphasystem.morphologicalanalysis.common.model;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;
import static org.apache.commons.lang3.ArrayUtils.isNotEmpty;

/**
 * @author sali
 */
public class VerseTokenPairGroup {

    protected Integer chapterNumber;
    protected List<VerseTokensPair> pairs;
    protected boolean includeHidden;

    public VerseTokenPairGroup() {
        setPairs((VerseTokensPair[]) null);
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

    public void setPairs(VerseTokensPair... pairs) {
        this.pairs = new ArrayList<>();
        if (isNotEmpty(pairs)) {
            addAll(this.pairs, pairs);
        }
    }

    public void setPairs(List<VerseTokensPair> pairs) {
        this.pairs = new ArrayList<>();
        if (pairs != null && !pairs.isEmpty()) {
            this.pairs.addAll(pairs);
        }
    }

    @Override
    public String toString() {
        if (pairs.isEmpty()) {
            return super.toString();
        }
        StringBuilder builder = new StringBuilder();
        builder.append(pairs.get(0));
        for (int i = 1; i < pairs.size(); i++) {
            builder.append("|").append(pairs.get(i));
        }
        return builder.toString();
    }
}
