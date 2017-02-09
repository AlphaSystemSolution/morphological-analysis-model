/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.morphologicalanalysis.wordbyword.model.support.ConversationType;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.ProNounType;

import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.ConversationType.THIRD_PERSON;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.ProNounType.DETACHED;

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

	/**
	 * @param src
	 * @throws NullPointerException
	 */
	public ProNounProperties(ProNounProperties src) throws NullPointerException {
		super(src);
		setConversationType(src.getConversationType());
		setProNounType(src.getProNounType());
	}

	public ConversationType getConversationType() {
		return conversationType;
	}

	public void setConversationType(ConversationType conversationType) {
		this.conversationType = conversationType == null ? THIRD_PERSON
				: conversationType;
	}

	public ProNounType getProNounType() {
		return proNounType;
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
