/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model;

import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NounKind;
import com.alphasystem.morphologicalanalysis.wordbyword.model.support.NounType;
import org.springframework.data.annotation.Transient;

import static com.alphasystem.arabic.model.ArabicLetters.WORD_COMMA;
import static com.alphasystem.arabic.model.ArabicWord.concatenate;
import static com.alphasystem.arabic.model.ArabicWord.concatenateWithSpace;
import static com.alphasystem.morphologicalanalysis.wordbyword.model.support.NounType.INDEFINITE;
import static java.lang.String.format;

/**
 * @author sali
 * 
 */
public class NounProperties extends AbstractNounProperties {

	private static final long serialVersionUID = 1602979768959493665L;

	protected NounKind nounKind;

	protected NounType nounType;

	public NounProperties() {
		super();
		setNounType(null);
		setNounKind(null);
	}

	/**
	 * @param src
	 * @throws NullPointerException
	 */
	public NounProperties(NounProperties src) throws NullPointerException {
		super(src);
		setNounType(src.getNounType());
		setNounKind(src.getNounKind());
	}

	@Override
	@Transient
	public ArabicWord getLabel() {
		return concatenateWithSpace(concatenate(status.getLabel(), WORD_COMMA),
				concatenate(number.getLabel(), WORD_COMMA),
				concatenate(gender.getLabel(), WORD_COMMA),
				concatenate(nounType.getLabel()));
	}

	public NounKind getNounKind() {
		return nounKind;
	}

	public void setNounKind(NounKind kind) {
		this.nounKind = kind;
	}

	public NounType getNounType() {
		return nounType;
	}

	public void setNounType(NounType type) {
		this.nounType = type == null ? INDEFINITE : type;
	}

	public NounProperties withNounKind(NounKind nounKind) {
		if (nounKind != null) {
			setNounKind(nounKind);
		}
		return this;
	}

	public NounProperties withNounType(NounType nounType) {
		if (nounType != null) {
			setNounType(nounType);
		}
		return this;
	}

	@Override
	public String toString() {
		return format(
				"ID: %s, Status: %s, Number: %s, Gender: %s, Type: %s, Kind: %s",
				getId(), getStatus(), getNumber(), getGender(), getNounType(),
				getNounKind());
	}
}
