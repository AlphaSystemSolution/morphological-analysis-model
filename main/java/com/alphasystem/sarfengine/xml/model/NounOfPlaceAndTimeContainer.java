/**
 *
 */
package com.alphasystem.sarfengine.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * @author sali
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NounOfPlaceAndTimeContainerType")
public class NounOfPlaceAndTimeContainer extends RootWordContainer {

    public NounOfPlaceAndTimeContainer() {
    }

    public NounOfPlaceAndTimeContainer(RootWord... rootWords) {
        withRootWords(rootWords);
    }
}
