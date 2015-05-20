/**
 * 
 */
package com.alphasystem.morphologicalanalysis.exception;

/**
 * @author sali
 *
 */
public class InvalidChapterException extends IllegalArgumentException {

	private static final long serialVersionUID = -5990252030067631305L;

	/**
	 * 
	 */
	public InvalidChapterException() {
	}

	/**
	 * @param s
	 */
	public InvalidChapterException(String s) {
		super(s);
	}

	/**
	 * @param cause
	 */
	public InvalidChapterException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidChapterException(String message, Throwable cause) {
		super(message, cause);
	}

}
