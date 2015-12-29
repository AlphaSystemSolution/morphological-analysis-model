package com.alphasystem.morphologicalanalysis.common.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Location;
import com.alphasystem.persistence.model.AbstractDocument;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A marker class to represents that sub classes can be linked to or dependent on other classes of this type.
 *
 * @author sali
 * @see Location
 */
@Entity
@Document
public abstract class Linkable extends AbstractDocument {
}
