package se.brewday.convert.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.math.BigDecimal;

@JacksonXmlRootElement(localName = "HOP")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hop {

    @JacksonXmlProperty(localName = "NAME")
    private String name;

    @JacksonXmlProperty(localName = "VERSION")
    private int version;

    @JacksonXmlProperty(localName = "NOTES")
    private String notes;

    @JacksonXmlProperty(localName = "ORIGIN")
    private String origin;

    @JacksonXmlProperty(localName = "TYPE")
    private String type;

    @JacksonXmlProperty(localName = "FORM")
    private String form;

    @JacksonXmlProperty(localName = "ALPHA")
    private BigDecimal alpha;

    @JacksonXmlProperty(localName = "BETA")
    private BigDecimal beta;

    @JacksonXmlProperty(localName = "HSI")
    private BigDecimal hsi;

    @JacksonXmlProperty(localName = "USE")
    private String use;

    @JacksonXmlProperty(localName = "AMOUNT")
    private BigDecimal amount;

    @JacksonXmlProperty(localName = "TIME")
    private BigDecimal time;

    // DISPLAY_AMOUNT
    // INVENTORY
    // DISPLAY_TIME

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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public BigDecimal getAlpha() {
		return alpha;
	}

	public void setAlpha(BigDecimal alpha) {
		this.alpha = alpha;
	}

	public BigDecimal getBeta() {
		return beta;
	}

	public void setBeta(BigDecimal beta) {
		this.beta = beta;
	}

	public BigDecimal getHsi() {
		return hsi;
	}

	public void setHsi(BigDecimal hsi) {
		this.hsi = hsi;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTime() {
		return time;
	}

	public void setTime(BigDecimal time) {
		this.time = time;
	}
	//</editor-fold>
}
