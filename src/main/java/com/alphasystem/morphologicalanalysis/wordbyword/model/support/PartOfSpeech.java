/**
 * 
 */
package com.alphasystem.morphologicalanalysis.wordbyword.model.support;

import com.alphasystem.arabic.model.ArabicSupportEnum;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.morphologicalanalysis.wordbyword.model.*;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.alphasystem.arabic.model.ArabicLetterType.*;
import static com.alphasystem.arabic.model.ArabicWord.getWord;

/**
 * @author sali
 * 
 */
public enum PartOfSpeech implements ArabicSupportEnum {

	NOUN("Noun", "#000080", getWord(ALIF_HAMZA_BELOW, SEEN, MEEM),
			NounProperties.class),

	RELATIVE_PRONOUN("Relative pronoun", null, getWord(ALIF_HAMZA_BELOW, SEEN,
			MEEM, SPACE, MEEM, WAW, SAD, WAW, LAM), NounProperties.class),

	// ADJECTIVE("ADJ", getWord(SAD, FA, TA_MARBUTA)),

	PROPER_NOUN("Proper Noun", "#000080", getWord(ALIF_HAMZA_BELOW, SEEN, MEEM,
			SPACE, AIN, LAM, MEEM), NounProperties.class),

	TIME_ADVERB("Time adverb", null, getWord(DTHA, RA, FA, SPACE, ZAIN, MEEM,
			ALIF, NOON), NounProperties.class),

	LOCATION_ADVERB("Location adverb", null, getWord(DTHA, RA, FA, SPACE, ZAIN,
			MEEM, KAF, ALIF, NOON), NounProperties.class),

	PRONOUN("Pronoun", "#8C001A", getWord(DDAD, MEEM, YA, RA),
			ProNounProperties.class),

	DEMONSTRATIVE_PRONOUN("Demonstrative pronoun", null, getWord(
			ALIF_HAMZA_BELOW, SEEN, MEEM, SPACE, ALIF_HAMZA_BELOW, SHEEN, ALIF,
			RA, TA_MARBUTA), NounProperties.class),

	VERB("Verb", "#4AA02C", getWord(FA, AIN, LAM), VerbProperties.class),

	// IMPERATIVE_VERBAL_NOUN("IMPN", getWord(ALIF_HAMZA_BELOW, SEEN, MEEM,
	// SPACE,
	// FA, AIN, LAM, SPACE, _ALIF_HAMZA_ABOVE, MEEM, RA)),

	DEFINITE_ARTICLE("Definite article", getWord(LAM, ALIF, MEEM, SPACE, ALIF,
			LAM, TA, AIN, RA, YA, FA)),

	NEGATIVE_PARTICLE("Negative particle", getWord(HHA, RA, FA, SPACE, NOON,
			FA, YA)),

	GENITIVE_PARTICLE("Genitive particle", "#800000", getWord(HHA, RA, FA,
			SPACE, JEEM, RA)),

	ACCUSSATIVE_PARTICLE("Accussative particle", "#8B0807", getWord(HHA, RA, FA,
			SPACE, NOON, SAD, BA)),

	CONJUNCTION_PARTICLE_WAW("Conjunction particle", getWord(ALIF, LAM, WAW,
			ALIF, WAW, SPACE, AIN, ALIF, TTA, FA, TA_MARBUTA)),

	CONJUNCTION_PARTICLE_FA("Conjunction particle", getWord(ALIF, LAM, FA,
			ALIF, HAMZA, SPACE, AIN, ALIF, TTA, FA, TA_MARBUTA)),

	SUBJUNCTIVE_PARTICLE("Subjunctive particle", getWord(HHA, RA, FA, SPACE,
			ALIF, LAM, NOON, ALIF, SAD, BA, TA_MARBUTA)),

	JUSSIVE_PARTICLE("Jussive particle", getWord(HHA, RA, FA, SPACE, ALIF, LAM,
			JEEM, ALIF, ZAIN, MEEM, TA_MARBUTA)),

	RESUMPTION_PARTICLE_WAW("Resumption particle", getWord(ALIF, LAM, WAW,
			ALIF, WAW, SPACE, ALIF_HAMZA_BELOW, SEEN, TA, YA_HAMZA_ABOVE, NOON, ALIF, FA, YA,
			TA_MARBUTA)),

	RESUMPTION_PARTICLE_FA("Resumption particle", getWord(ALIF, LAM, FA, ALIF, HAMZA, SPACE,
			ALIF_HAMZA_BELOW, SEEN, TA, YA_HAMZA_ABOVE, NOON, ALIF, FA, YA,
			TA_MARBUTA)),

	EQUALIZATION_PARTICLE("Equalization particle", getWord(HHA, RA, FA, SPACE,
			TA, SEEN, WAW, TA_MARBUTA)),

	CIRCUMSTANTIAL_PARTICLE("Circumstantial particle", getWord(HHA, RA, FA,
			SPACE, HHA, ALIF, LAM)),

	RESTRICTION_PARTICLE("Restriction particle", getWord(ALIF_HAMZA_ABOVE, DAL,
			ALIF, TA_MARBUTA, SPACE, HHA, SAD, RA)),

	PREVENTIVE_PARTICLE("Preventive particle", getWord(HHA, RA, FA, SPACE, KAF,
			ALIF, FA)),

	INCEPTIVE_PARTICLE("Inceptive particle", getWord(HHA, RA, FA, SPACE, ALIF,
			BA, TA, DAL, ALIF, HAMZA)),

	SUPPLEMENTAL_PARTICLE("Supplemental particle", getWord(HHA, RA, FA, SPACE,
			ZAIN, ALIF, YA_HAMZA_ABOVE, DAL)),

	AMENDMENT_PARTICLE("Amendment particle", getWord(HHA, RA, FA, SPACE, ALIF,
			SEEN, TA, DAL, RA, ALIF, KAF)),

	INTERROGATIVE_PARTICLE("Interrogative particle", getWord(HHA, RA, FA,
			SPACE, ALIF, SEEN, TA, FA, HA, ALIF, MEEM)),

	CONDITIONAL_PARTICLE("Conditional particle", getWord(HHA, RA, FA, SPACE,
			SHEEN, RA, TTA)),

	VOCATIVE_PARTICLE("Vocative particle", getWord(HHA, RA, FA, SPACE, NOON,
			DAL, ALIF, HAMZA)),

	RESULT_PARTICLE("Result particle", getWord(HHA, RA, FA, SPACE, WAW, ALIF,
			QAF, AIN, SPACE, FA, YA, SPACE, JEEM, WAW, ALIF, BA, SPACE, ALIF,
			LAM, SHEEN, RA, TTA)),

	EXPLANATION_PARTICLE("Explanation particle", getWord(HHA, RA, FA, SPACE,
			TA, FA, SAD, YA, LAM)),

	EXCEPTIVE_PARTICLE("Exceptive particle", getWord(ALIF, DAL, ALIF,
			TA_MARBUTA, SPACE, ALIF, SEEN, TA, THA, NOON, ALIF, HAMZA)),

	FUTURE_PARTICLE("Future particle", getWord(HHA, RA, FA, SPACE, ALIF, SEEN,
			TA, QAF, BA, ALIF, LAM)),

	ANSWER_PARTICLE("Answer particle", getWord(HHA, RA, FA, SPACE, JEEM, WAW,
			ALIF, BA)),

	RETRACTION_PARTICLE("Retraction particle", getWord(HHA, RA, FA, SPACE,
			ALIF, DDAD, RA, ALIF, BA)),

	EXHORTATION_PARTICLE("Exhortation particle", getWord(HHA, RA, FA, SPACE,
			TA, HHA, DDAD, YA, DDAD)),

	IMPERATIVE_PARTICLE("Imperative particle", getWord(LAM, ALIF, MEEM, SPACE,
			ALIF, LAM, ALIF, MEEM, RA)),

	COMITATIVE_PARTICLE("Comitative particle", getWord(WAW, ALIF, WAW, SPACE,
			ALIF, LAM, MEEM, AIN, YA, TA_MARBUTA)),

	SURPRISE_PARTICLE("Surprise particle", getWord(HHA, RA, FA, SPACE, FA,
			JEEM, ALIF, HAMZA, TA_MARBUTA)),

	AVERSION_PARTICLE("Aversion particle", getWord(HHA, RA, FA, SPACE, RA, DAL,
			AIN)),

	PROHIBITION_PARTICLE("Prohibition particle", getWord(HHA, RA, FA, SPACE,
			NOON, HA, YA)),

	EMPHATIC_PARTICLE("Emphatic particle", getWord(ALIF, LAM, LAM, ALIF, MEEM,
			SPACE, LAM, ALIF, MEEM, SPACE, ALIF, LAM, TA, AIN, LAM, YA, LAM)),

	PARTICLE_OF_PURPOSE("Particle of purpose", getWord(ALIF, LAM, LAM, ALIF,
			MEEM, SPACE, LAM, ALIF, MEEM, SPACE, ALIF, LAM, TA, WAW, KAF, YA,
			DAL)),

	PARTICLE_OF_CAUSE("Particle of cause", getWord(HHA, RA, FA, SPACE, SEEN,
			BA, YA, TA_MARBUTA)),

	PARTICLE_OF_CERTAINTY("Particle of certainty", getWord(HHA, RA, FA, SPACE,
			TA, HHA, QAF, YA, QAF)),

	PARTICLE_OF_INTERPRETATION("Particle of interpretation", getWord(HHA, RA,
			FA, SPACE, TA, FA, SEEN, YA, RA)),

	QURANIC_INITIAL("Quranic initial", getWord(HHA, RA, FA, SPACE, MEEM, QAF,
			TTA, AIN, TTA, TA_MARBUTA)),

	SUBORDINATING_CONJUNCTION("Subordinating conjunction", getWord(HHA, RA, FA,
			SPACE, MEEM, SAD, DAL, RA, YA)),

	QURANIC_PUNCTUATION("Quranic Punctuation", getWord(QAF))

	;

	private static final String DEFAULT_COLOR = "#000000";

	private static Map<String, PartOfSpeech> codeMap = new LinkedHashMap<String, PartOfSpeech>();

	static {
		for (PartOfSpeech pos : values()) {
			codeMap.put(pos.getCode(), pos);
		}
	}

	private final String code;
	private final String colorCode;
	private final ArabicWord label;
	private final Class<? extends AbstractProperties> propertiesClass;

	/**
	 * @param code
	 */
	PartOfSpeech(String code) {
		this(code, DEFAULT_COLOR);
	}

	/**
	 * @param code
	 * @param label
	 */
	PartOfSpeech(String code, ArabicWord label) {
		this(code, DEFAULT_COLOR, label);
	}

	/**
	 * @param code
	 * @param colorCode
	 */
	PartOfSpeech(String code, String colorCode) {
		this(code, colorCode, null);
	}

	/**
	 * @param code
	 * @param colorCode
	 * @param label
	 */
	PartOfSpeech(String code, String colorCode, ArabicWord label) {
		this(code, colorCode, label, null);
	}

	PartOfSpeech(String code, String colorCode, ArabicWord label,
				 Class<? extends AbstractProperties> propertiesClass) {
		this.code = code;
		this.colorCode = colorCode == null ? DEFAULT_COLOR : colorCode;
		this.label = label;
		this.propertiesClass = propertiesClass == null ? ParticleProperties.class
				: propertiesClass;
	}

	public static PartOfSpeech getByCode(String code) {
		return codeMap.get(code);
	}

	@Override
	public String getCode() {
		return code;
	}

	public String getColorCode() {
		return colorCode;
	}

	@Override
	public ArabicWord getLabel() {
		return label;
	}

	@Override
	public String getName() {
		return name();
	}

	public Class<? extends AbstractProperties> getPropertiesClass() {
		return propertiesClass;
	}
}
