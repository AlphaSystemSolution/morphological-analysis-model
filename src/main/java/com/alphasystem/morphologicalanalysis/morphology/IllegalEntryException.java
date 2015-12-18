package com.alphasystem.morphologicalanalysis.morphology;

import com.alphasystem.morphologicalanalysis.morphology.model.MorphologicalEntry;
import com.alphasystem.morphologicalanalysis.morphology.model.MorphologicalGroup;
import com.alphasystem.morphologicalanalysis.morphology.model.RootLetters;

/**
 * Exception to be thrown when  attempt to add illegal {@link MorphologicalEntry} in {@link MorphologicalGroup}.
 * <p>
 * An illegal entry will be:
 * <ul>
 * <li>When {@link RootLetters} of the entry doesn't match of the group.</li>
 * </ul>
 *
 * @author sali
 */
public class IllegalEntryException extends RuntimeException {

    public IllegalEntryException() {
        super();
    }

    public IllegalEntryException(String message) {
        super(message);
    }

    public IllegalEntryException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalEntryException(Throwable cause) {
        super(cause);
    }

    protected IllegalEntryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
