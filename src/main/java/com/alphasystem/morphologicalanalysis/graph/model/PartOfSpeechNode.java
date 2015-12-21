package com.alphasystem.morphologicalanalysis.graph.model;

import com.alphasystem.morphologicalanalysis.common.model.Linkable;
import com.alphasystem.morphologicalanalysis.wordbyword.model.Location;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.alphasystem.morphologicalanalysis.graph.model.support.GraphNodeType.PART_OF_SPEECH;
import static java.lang.String.format;

/**
 * @author sali
 */
@QueryEntity
@Document
@TypeAlias("PartOfSpeechNode")
public class PartOfSpeechNode extends LinkSupport {

    private static final long serialVersionUID = -6416045963720763331L;

    @DBRef
    protected Location location;

    protected Integer locationNumber;

    protected boolean hidden;

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

    public Integer getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(Integer locationNumber) {
        this.locationNumber = locationNumber;
    }

    @Override
    public void initDisplayName() {
        String ver = getVersion() <= 0 ? "" : format(":%s", getVersion());
        String dn = location == null ? "" :
                format("%s%s:%s", location.getDisplayName(), ver, location.getPartOfSpeech());
        if (location != null) {
            setChapterNumber(location.getChapterNumber());
            setVerseNumber(location.getVerseNumber());
            setTokenNumber(location.getTokenNumber());
            setLocationNumber(location.getLocationNumber());
        }
        setDisplayName(dn);
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
