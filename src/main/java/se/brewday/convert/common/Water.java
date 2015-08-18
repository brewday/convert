package se.brewday.convert.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;

@JsonRootName("WATER")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Water {

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("VERSION")
    private int version;

    @JsonProperty("NOTES")
    private String notes;

    @JsonProperty("AMOUNT")
    private BigDecimal amount;

    @JsonProperty("PH")
    private BigDecimal ph;

    @JsonProperty("CALCIUM")
    private BigDecimal calcium;

    @JsonProperty("BICARBONATE")
    private BigDecimal bicarbonate;

    @JsonProperty("SULFATE")
    private BigDecimal sulfate;

    @JsonProperty("CHLORIDE")
    private BigDecimal chloride;

    @JsonProperty("SODIUM")
    private BigDecimal sodium;

    @JsonProperty("MAGNESIUM")
    private BigDecimal magnesium;

    // DISPLAY_AMOUNT

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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getPh() {
		return ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getCalcium() {
		return calcium;
	}

	public void setCalcium(BigDecimal calcium) {
		this.calcium = calcium;
	}

	public BigDecimal getBicarbonate() {
		return bicarbonate;
	}

	public void setBicarbonate(BigDecimal bicarbonate) {
		this.bicarbonate = bicarbonate;
	}

	public BigDecimal getSulfate() {
		return sulfate;
	}

	public void setSulfate(BigDecimal sulfate) {
		this.sulfate = sulfate;
	}

	public BigDecimal getChloride() {
		return chloride;
	}

	public void setChloride(BigDecimal chloride) {
		this.chloride = chloride;
	}

	public BigDecimal getSodium() {
		return sodium;
	}

	public void setSodium(BigDecimal sodium) {
		this.sodium = sodium;
	}

	public BigDecimal getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(BigDecimal magnesium) {
		this.magnesium = magnesium;
	}
	//</editor-fold>
}
