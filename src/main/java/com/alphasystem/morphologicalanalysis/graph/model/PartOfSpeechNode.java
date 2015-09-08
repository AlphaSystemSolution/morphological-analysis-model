package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.common.model.Linkable;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Location;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.PART_OF_SPEECH;
import static java.lang.String.format;

/**
 * @author sali
 */
@Document
public class PartOfSpeechNode extends LinkSupport {

    private static final long serialVersionUID = -6416045963720763331L;

    @DBRef
    protected Location location;

    public PartOfSpeechNode() {
        this(null);
    }

    public PartOfSpeechNode(Location location) {
        this(null, location);
    }

    public PartOfSpeechNode(String id, Location location) {
        super(id, PART_OF_SPEECH);
        setLocation(location);
    }

    @Override
    public void initDisplayName() {
        String dn = location == null ? "" : format("%s:%s", location.getDisplayName(), location.getPartOfSpeech());
        setDisplayName(dn);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
        initDisplayName();
        setLinkable(location);
    }

    @Override
    public Linkable getLinkable() {
        if (linkable == null) {
            setLinkable(location);
        }
        return super.getLinkable();
    }
}
