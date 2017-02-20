/**
 *
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NounStatus;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.PartOfSpeechType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.NounStatus.NOMINATIVE;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractNounProperties<P extends Enum<P> & PartOfSpeechType> extends AbstractProperties<P> {

    private static final long serialVersionUID = -5435719155848625378L;

    protected NounStatus status;

    AbstractNounProperties() {
        super();
        setStatus(null);
    }

    /**
     * @param src
     * @throws NullPointerException
     */
    AbstractNounProperties(AbstractNounProperties src) throws NullPointerException {
        super(src);
        setStatus(src.getStatus());
    }

    public NounStatus getStatus() {
        return status;
    }

    public void setStatus(NounStatus status) {
        this.status = status == null ? NOMINATIVE : status;
    }

    public AbstractNounProperties withNounStatus(NounStatus status) {
        setStatus(status);
        return this;
    }

}
