/**
 *
 */
package com.alphasystem.morphologicalengine.model.abbrvconj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.ArrayUtils;

import static java.util.Objects.hash;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdverbLine {

    private String[] adverbs;
    private String adverb;

    public String[] getAdverbs() {
        return adverbs;
    }

    public void setAdverbs(String[] adverbs) {
        this.adverbs = adverbs;
    }

    public AdverbLine adverbs(String... adverbs) {
        this.adverbs = ArrayUtils.addAll(this.adverbs,adverbs);
        return this;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public AdverbLine adverb(String adverb) {
        setAdverb(adverb);
        return this;
    }

    @Override
    public int hashCode() {
        return hash((Object[]) adverbs);
    }

}
