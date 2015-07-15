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
@XmlType(name = "VerbalNounContainerType")
public class VerbalNounContainer extends RootWordContainer {

    public VerbalNounContainer() {
    }

    public VerbalNounContainer(RootWord... rootWords) {
        withRootWords(rootWords);
    }

}
