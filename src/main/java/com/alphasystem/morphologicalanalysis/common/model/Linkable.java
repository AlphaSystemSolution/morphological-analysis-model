package com.alphasystem.morphologicalanalysis.common.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.Location;
import com.alphasystem.persistence.mongo.model.AbstractDocument;

/**
 * A marker class to represents that sub classes can be linked to or dependent on other classes of this type.
 *
 * @author sali
 * @see Location
 */
public abstract class Linkable extends AbstractDocument {
}
