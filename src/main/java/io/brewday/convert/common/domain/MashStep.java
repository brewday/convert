package io.brewday.convert.common.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;

@JsonRootName("MASH_STEP")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MashStep {

	@JsonProperty("NAME")
	private String name; // Mash In

	@JsonProperty("VERSION")
	private int version; // 1

	@JsonProperty("TYPE")
	private String type; // Infusion

	@JsonProperty("INFUSE_AMOUNT")
	private BigDecimal infuseAmount; // 15.6477262

	@JsonProperty("STEP_TIME")
	private BigDecimal stepTime; // 60.0000000

	@JsonProperty("STEP_TEMP")
	private BigDecimal stepTemp; // 66.6666667

	@JsonProperty("RAMP_TIME")
	private BigDecimal rampTime; // 2.0000000

	@JsonProperty("END_TEMP")
	private BigDecimal endTemp; // 66.6666667

	@JsonProperty("DESCRIPTION")
	private String description; // Add 15,65 l of water at 73,1 C

	@JsonProperty("WATER_GRAIN_RATIO")
	private String waterGrainRatio; // 2,608 l/kg

	@JsonProperty("DECOCTION_AMT")
	private String decoctionAmount; // 0.00 l

	@JsonProperty("INFUSE_TEMP")
	private String infuseTemp; // 73.1 C

	// DISPLAY_STEP_TEMP
	// DISPLAY_INFUSE_AMT


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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getInfuseAmount() {
		return infuseAmount;
	}

	public void setInfuseAmount(BigDecimal infuseAmount) {
		this.infuseAmount = infuseAmount;
	}

	public BigDecimal getStepTime() {
		return stepTime;
	}

	public void setStepTime(BigDecimal stepTime) {
		this.stepTime = stepTime;
	}

	public BigDecimal getStepTemp() {
		return stepTemp;
	}

	public void setStepTemp(BigDecimal stepTemp) {
		this.stepTemp = stepTemp;
	}

	public BigDecimal getRampTime() {
		return rampTime;
	}

	public void setRampTime(BigDecimal rampTime) {
		this.rampTime = rampTime;
	}

	public BigDecimal getEndTemp() {
		return endTemp;
	}

	public void setEndTemp(BigDecimal endTemp) {
		this.endTemp = endTemp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWaterGrainRatio() {
		return waterGrainRatio;
	}

	public void setWaterGrainRatio(String waterGrainRatio) {
		this.waterGrainRatio = waterGrainRatio;
	}

	public String getDecoctionAmount() {
		return decoctionAmount;
	}

	public void setDecoctionAmount(String decoctionAmount) {
		this.decoctionAmount = decoctionAmount;
	}

	public String getInfuseTemp() {
		return infuseTemp;
	}

	public void setInfuseTemp(String infuseTemp) {
		this.infuseTemp = infuseTemp;
	}
	//</editor-fold>
}
