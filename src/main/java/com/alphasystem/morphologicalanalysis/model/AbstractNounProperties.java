/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model;

import static com.alphasystem.morphologicalanalysis.model.support.NounStatus.NOMINATIVE;

import com.alphasystem.morphologicalanalysis.model.support.NounStatus;

/**
 * @author sali
 * 
 */
public abstract class AbstractNounProperties extends AbstractProperties {

	private static final long serialVersionUID = -5435719155848625378L;

	protected NounStatus status;

	public AbstractNounProperties() {
		setStatus(null);
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
