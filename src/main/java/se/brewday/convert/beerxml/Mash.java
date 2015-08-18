package se.brewday.convert.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import se.brewday.convert.jsondeserializers.StringBooleanJsonDeserializer;

import java.math.BigDecimal;
import java.util.List;

@JsonRootName("MASH")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mash {

	@JsonProperty("NAME")
	private String name; // Single Infusion, Medium Body

	@JsonProperty("VERSION")
	private int version; // 1

	@JsonProperty("NOTES")
	private String notes; // Simple single infusion mash for use with most modern well modified grains (about 95% of the time).

	@JsonProperty("GRAIN_TEMP")
	private BigDecimal grainTemp; // 22.2222222

	@JsonProperty("TUN_TEMP")
	private BigDecimal tunTemp; // 22.2222222

	@JsonProperty("SPARGE_TEMP")
	private BigDecimal spargeTemp; // 75.5555556

	@JsonProperty("PH")
	private BigDecimal ph; // 5.4000000

	@JsonProperty("TUN_WEIGHT")
	private BigDecimal tunWeight; // 176.3698400

	@JsonProperty("TUN_SPECIFIC_HEAT")
	private BigDecimal tunSpecific_heat; // 0.1200000

	@JsonProperty("EQUIP_ADJUST")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
	private boolean equipAdjust; // FALSE

	@JsonProperty("MASH_STEPS")
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
