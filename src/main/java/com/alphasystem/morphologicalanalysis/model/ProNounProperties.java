/**
 * 
 */
package com.alphasystem.morphologicalanalysis.model;

import static com.alphasystem.morphologicalanalysis.model.support.ConversationType.THIRD_PERSON;
import static com.alphasystem.morphologicalanalysis.model.support.ProNounType.DETACHED;

import com.alphasystem.morphologicalanalysis.model.support.ConversationType;
import com.alphasystem.morphologicalanalysis.model.support.ProNounType;

/**
 * @author sali
 * 
 */
public class ProNounProperties extends AbstractNounProperties {

	private static final long serialVersionUID = 6798660811802129204L;

	protected ConversationType conversationType;

	protected ProNounType proNounType;

	public ProNounProperties() {
		super();
		setConversationType(null);
		setProNounType(null);
	}

	public ConversationType getConversationType() {
		return conversationType;
	}

	public ProNounType getProNounType() {
		return proNounType;
	}

	public void setConversationType(ConversationType conversationType) {
		this.conversationType = conversationType == null ? THIRD_PERSON
				: conversationType;
	}

	public void setProNounType(ProNounType proNounType) {
		this.proNounType = proNounType == null ? DETACHED : proNounType;
	}

	public ProNounProperties withConversationType(
			ConversationType conversationType) {
		setConversationType(conversationType);
		return this;
	}

	public ProNounProperties withProNounType(ProNounType proNounType) {
		setProNounType(proNounType);
		return this;
	}

}
