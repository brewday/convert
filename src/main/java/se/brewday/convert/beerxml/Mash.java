package se.brewday.convert.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import se.brewday.convert.jsonadapters.StringBooleanJsonDeserializer;

import java.math.BigDecimal;
import java.util.List;

@JacksonXmlRootElement(localName = "MASH")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mash {

	@JacksonXmlProperty(localName = "NAME")
	private String name; // Single Infusion, Medium Body

	@JacksonXmlProperty(localName = "VERSION")
	private int version; // 1

	@JacksonXmlProperty(localName = "NOTES")
	private String notes; // Simple single infusion mash for use with most modern well modified grains (about 95% of the time).

	@JacksonXmlProperty(localName = "GRAIN_TEMP")
	private BigDecimal grainTemp; // 22.2222222

	@JacksonXmlProperty(localName = "TUN_TEMP")
	private BigDecimal tunTemp; // 22.2222222

	@JacksonXmlProperty(localName = "SPARGE_TEMP")
	private BigDecimal spargeTemp; // 75.5555556

	@JacksonXmlProperty(localName = "PH")
	private BigDecimal ph; // 5.4000000

	@JacksonXmlProperty(localName = "TUN_WEIGHT")
	private BigDecimal tunWeight; // 176.3698400

	@JacksonXmlProperty(localName = "TUN_SPECIFIC_HEAT")
	private BigDecimal tunSpecific_heat; // 0.1200000

	@JacksonXmlProperty(localName = "EQUIP_ADJUST")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
	private boolean equipAdjust; // FALSE

	@JacksonXmlProperty(localName = "MASH_STEPS")
	private List<MashStep> steps;

	// DISPLAY_GRAIN_TEMP
	// DISPLAY_TUN_TEMP
	// DISPLAY_SPARGE_TEMP
	// DISPLAY_TUN_WEIGHT


	//<editor-fold desc="Getters and Setters">
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getGrainTemp() {
		return grainTemp;
	}

	public void setGrainTemp(BigDecimal grainTemp) {
		this.grainTemp = grainTemp;
	}

	public BigDecimal getTunTemp() {
		return tunTemp;
	}

	public void setTunTemp(BigDecimal tunTemp) {
		this.tunTemp = tunTemp;
	}

	public BigDecimal getSpargeTemp() {
		return spargeTemp;
	}

	public void setSpargeTemp(BigDecimal spargeTemp) {
		this.spargeTemp = spargeTemp;
	}

	public BigDecimal getPh() {
		return ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getTunWeight() {
		return tunWeight;
	}

	public void setTunWeight(BigDecimal tunWeight) {
		this.tunWeight = tunWeight;
	}

	public BigDecimal getTunSpecific_heat() {
		return tunSpecific_heat;
	}

	public void setTunSpecific_heat(BigDecimal tunSpecific_heat) {
		this.tunSpecific_heat = tunSpecific_heat;
	}

	public boolean isEquipAdjust() {
		return equipAdjust;
	}

	public void setEquipAdjust(boolean equipAdjust) {
		this.equipAdjust = equipAdjust;
	}

	public List<MashStep> getSteps() {
		return steps;
	}

	public void setSteps(List<MashStep> steps) {
		this.steps = steps;
	}
	//</editor-fold>
}
