/**
 *
 */
package com.alphasystem.sarfengine.xml.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * @author sali
 */
@XmlType(name = "SortDirectiveType")
@XmlEnum
public enum SortDirective {

    NONE, TYPE, ALPHABATICAL
}
