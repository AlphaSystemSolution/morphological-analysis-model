/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.exception;

/**
 * @author sali
 *
 */
public class InvalidChapterException extends IllegalArgumentException {

	private static final long serialVersionUID = -5990252030067631305L;

	public InvalidChapterException(int chapterNumber) {
		super(String.format("Invalid chapter number: %s", chapterNumber));
	}

}
