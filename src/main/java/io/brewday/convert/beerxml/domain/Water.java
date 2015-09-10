package io.brewday.convert.beerxml.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.math.BigDecimal;

@JacksonXmlRootElement(localName = "WATER")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Water {

    @JacksonXmlProperty(localName = "NAME")
    private String name;

    @JacksonXmlProperty(localName = "VERSION")
    private int version;

    @JacksonXmlProperty(localName = "NOTES")
    private String notes;

    @JacksonXmlProperty(localName = "AMOUNT")
    private BigDecimal amount;

    @JacksonXmlProperty(localName = "PH")
    private BigDecimal ph;

    @JacksonXmlProperty(localName = "CALCIUM")
    private BigDecimal calcium;

    @JacksonXmlProperty(localName = "BICARBONATE")
    private BigDecimal bicarbonate;

    @JacksonXmlProperty(localName = "SULFATE")
    private BigDecimal sulfate;

    @JacksonXmlProperty(localName = "CHLORIDE")
    private BigDecimal chloride;

    @JacksonXmlProperty(localName = "SODIUM")
    private BigDecimal sodium;

    @JacksonXmlProperty(localName = "MAGNESIUM")
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
