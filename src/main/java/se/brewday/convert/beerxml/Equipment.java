package se.brewday.convert.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import se.brewday.convert.jsondeserializers.StringBooleanJsonDeserializer;

import java.math.BigDecimal;

@JsonRootName("EQUIPMENT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Equipment {

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("VERSION")
    private int version;

    @JsonProperty("NOTES")
    private String notes;

    @JsonProperty("BOIL_SIZE")
    private BigDecimal boilSize;

    @JsonProperty("BATCH_SIZE")
    private BigDecimal batchSize;

    @JsonProperty("TUN_VOLUME")
    private BigDecimal tunVolume;

    @JsonProperty("TUN_WEIGHT")
    private BigDecimal tunWeight;

    @JsonProperty("TUN_SPECIFIC_HEAT")
    private BigDecimal tunSpecificHeat;

    @JsonProperty("TOP_UP_WATER")
    private BigDecimal topUpWater;

    @JsonProperty("TRUB_CHILLER_LOSS")
    private BigDecimal trubChillerLoss;

    @JsonProperty("EVAP_RATE")
    private BigDecimal evaporationRate;

    @JsonProperty("BOIL_TIME")
    private BigDecimal boilTime;

    @JsonProperty("CALC_BOIL_VOLUME")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
    private boolean calculateBoilVolume;

    @JsonProperty("LAUTER_DEADSPACE")
    private BigDecimal lauterDeadspace;

    @JsonProperty("TOP_UP_KETTLE")
    private BigDecimal topUpKettle;

    @JsonProperty("HOP_UTILIZATION")
    private BigDecimal hopUtilization;

    @JsonProperty("COOLING_LOSS_PCT")
    private BigDecimal coolingLossPercentage;

    // DISPLAY_BOIL_SIZE = 64.00 l
    // DISPLAY_BATCH_SIZE = 50.00 l
    // DISPLAY_TUN_VOLUME = 70.00 l
    // DISPLAY_TUN_WEIGHT = 24.00 kg
    // DISPLAY_TOP_UP_WATER = 0.00 l
    // DISPLAY_TRUB_CHILLER_LOSS = 6.00 l
    // DISPLAY_LAUTER_DEADSPACE = 0.00 l
    // DISPLAY_TOP_UP_KETTLE = 0.00 l

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

	public BigDecimal getBoilSize() {
		return boilSize;
	}

	public void setBoilSize(BigDecimal boilSize) {
		this.boilSize = boilSize;
	}

	public BigDecimal getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(BigDecimal batchSize) {
		this.batchSize = batchSize;
	}

	public BigDecimal getTunVolume() {
		return tunVolume;
	}

	public void setTunVolume(BigDecimal tunVolume) {
		this.tunVolume = tunVolume;
	}

	public BigDecimal getTunWeight() {
		return tunWeight;
	}

	public void setTunWeight(BigDecimal tunWeight) {
		this.tunWeight = tunWeight;
	}

	public BigDecimal getTunSpecificHeat() {
		return tunSpecificHeat;
	}

	public void setTunSpecificHeat(BigDecimal tunSpecificHeat) {
		this.tunSpecificHeat = tunSpecificHeat;
	}

	public BigDecimal getTopUpWater() {
		return topUpWater;
	}

	public void setTopUpWater(BigDecimal topUpWater) {
		this.topUpWater = topUpWater;
	}

	public BigDecimal getTrubChillerLoss() {
		return trubChillerLoss;
	}

	public void setTrubChillerLoss(BigDecimal trubChillerLoss) {
		this.trubChillerLoss = trubChillerLoss;
	}

	public BigDecimal getEvaporationRate() {
		return evaporationRate;
	}

	public void setEvaporationRate(BigDecimal evaporationRate) {
		this.evaporationRate = evaporationRate;
	}

	public BigDecimal getBoilTime() {
		return boilTime;
	}

	public void setBoilTime(BigDecimal boilTime) {
		this.boilTime = boilTime;
	}

	public boolean isCalculateBoilVolume() {
		return calculateBoilVolume;
	}

	public void setCalculateBoilVolume(boolean calculateBoilVolume) {
		this.calculateBoilVolume = calculateBoilVolume;
	}

	public BigDecimal getLauterDeadspace() {
		return lauterDeadspace;
	}

	public void setLauterDeadspace(BigDecimal lauterDeadspace) {
		this.lauterDeadspace = lauterDeadspace;
	}

	public BigDecimal getTopUpKettle() {
		return topUpKettle;
	}

	public void setTopUpKettle(BigDecimal topUpKettle) {
		this.topUpKettle = topUpKettle;
	}

	public BigDecimal getHopUtilization() {
		return hopUtilization;
	}

	public void setHopUtilization(BigDecimal hopUtilization) {
		this.hopUtilization = hopUtilization;
	}

	public BigDecimal getCoolingLossPercentage() {
		return coolingLossPercentage;
	}

	public void setCoolingLossPercentage(BigDecimal coolingLossPercentage) {
		this.coolingLossPercentage = coolingLossPercentage;
	}
	//</editor-fold>
}
