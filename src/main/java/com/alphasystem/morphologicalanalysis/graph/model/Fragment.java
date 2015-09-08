package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.common.model.Linkable;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Location;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Token;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.AlternateStatus;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NounStatus;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.RelationshipType;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents series of {@link Location}(s) and create fragment / phrase relationship. The fragment could be
 * a phrase like <emp>Idafah</emp> or it could be nominal or verbal sentences.
 *
 * @author sali
 * @see Token
 */
@Document
public class Fragment extends Linkable {

    @DBRef(lazy = true)
    protected List<Location> locations;
    protected AlternateStatus alternateStatus;
    protected RelationshipType relationshipType;

    public Fragment() {
        super();
        setLocations(null);
        initDisplayName();
    }

    public AlternateStatus getAlternateStatus() {
        return alternateStatus;
    }

    public void setAlternateStatus(AlternateStatus alternateStatus) {
        this.alternateStatus = alternateStatus;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = new ArrayList<>();
        if (locations != null) {
            this.locations.addAll(locations);
        }
    }

    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }
}
