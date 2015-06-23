/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NounStatus;

import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.NounStatus.NOMINATIVE;

/**
 * @author sali
 * 
 */
public abstract class AbstractNounProperties extends AbstractProperties {

	private static final long serialVersionUID = -5435719155848625378L;

	protected NounStatus status;

	public AbstractNounProperties() {
        super();
        setStatus(null);
	}

	/**
	 * @param src
	 * @throws NullPointerException
	 */
	public AbstractNounProperties(AbstractNounProperties src) throws NullPointerException {
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
