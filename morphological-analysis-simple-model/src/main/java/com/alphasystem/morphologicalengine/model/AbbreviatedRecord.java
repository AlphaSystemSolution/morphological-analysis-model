package com.alphasystem.morphologicalengine.model;

import java.util.Objects;

import com.alphasystem.morphologicalanalysis.morphology.model.support.SarfTermType;
import com.alphasystem.util.AppUtil;
import com.alphasystem.util.IdGenerator;

/**
 * @author sali
 */
public class AbbreviatedRecord implements Comparable<AbbreviatedRecord> {

	private String id;
	private SarfTermType type;
	private String label;
	private String source;

	public AbbreviatedRecord(){
		setId(IdGenerator.nextId());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = (id == null) ? IdGenerator.nextId() : id;
	}

	public SarfTermType getType() {
		return type;
	}

	public void setType(SarfTermType type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = super.equals(obj);
		if (AppUtil.isInstanceOf(AbbreviatedRecord.class, obj)) {
			AbbreviatedRecord other = (AbbreviatedRecord) obj;
			result = type.equals(other.getType()) && label.equals(other.getLabel());
		}
		return result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, label);
	}

	@Override
	public int compareTo(AbbreviatedRecord o) {
		int result = (o == null) ? 1 : 0;
		if (result == 0) {
			result = type.compareTo(o.getType());
			if (result == 0) {
				result = label.compareTo(o.getLabel());
			}
		}
		return result;
	}
}
