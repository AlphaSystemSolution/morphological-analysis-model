/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicLetterType;
import com.alphasystem.persistence.mongo.model.AbstractDocument;
import org.springframework.data.annotation.PersistenceConstructor;

import static com.alphasystem.util.IdGenerator.nextId;
import static org.apache.commons.lang3.StringUtils.isBlank;

/**
 * @author sali
 * 
 */
public class RootWord extends AbstractDocument {

	private static final long serialVersionUID = 1870389910904806332L;

	protected ArabicLetterType firstRadical;

	protected ArabicLetterType secondRadical;

	protected ArabicLetterType thirdRadical;

	protected ArabicLetterType fourthRadical;

	public RootWord() {
		this(null, null, null, null);
	}

	@PersistenceConstructor
	public RootWord(ArabicLetterType firstRadical,
			ArabicLetterType secondRadical, ArabicLetterType thirdRadical,
			ArabicLetterType fourthRadical) {
		super(nextId());
		this.firstRadical = firstRadical;
		this.secondRadical = secondRadical;
		this.thirdRadical = thirdRadical;
		this.fourthRadical = fourthRadical;
		updateDisplayName();
	}

	public ArabicLetterType getFirstRadical() {
		return firstRadical;
	}

	public void setFirstRadical(ArabicLetterType firstRadical) {
		this.firstRadical = firstRadical;
	}

	public ArabicLetterType getFourthRadical() {
		return fourthRadical;
	}

	public void setFourthRadical(ArabicLetterType fourthRadical) {
		this.fourthRadical = fourthRadical;
	}

	public ArabicLetterType getSecondRadical() {
		return secondRadical;
	}

	public void setSecondRadical(ArabicLetterType secondRadical) {
		this.secondRadical = secondRadical;
	}

	public ArabicLetterType getThirdRadical() {
		return thirdRadical;
	}

	public void setThirdRadical(ArabicLetterType thirdRadical) {
		this.thirdRadical = thirdRadical;
	}

	private String updateBuilder(ArabicLetterType src) {
		StringBuilder builder = new StringBuilder();
		String value = src == null ? "" : src.name();
		if (!isBlank(value)) {
			builder.append(":").append(value);
		}
		return builder.toString();
	}

	public void updateDisplayName() {
		StringBuilder builder = new StringBuilder();
		builder.append(id).append(updateBuilder(firstRadical))
				.append(updateBuilder(secondRadical))
				.append(updateBuilder(thirdRadical))
				.append(updateBuilder(fourthRadical));
		setDisplayName(builder.toString());
	}

}
