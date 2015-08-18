package se.brewday.convert.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;

@JsonRootName("HOP")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hop {

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("VERSION")
    private int version;

    @JsonProperty("NOTES")
    private String notes;

    @JsonProperty("ORIGIN")
    private String origin;

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("FORM")
    private String form;

    @JsonProperty("ALPHA")
    private BigDecimal alpha;

    @JsonProperty("BETA")
    private BigDecimal beta;

    @JsonProperty("HSI")
    private BigDecimal hsi;

    @JsonProperty("USE")
    private String use;

    @JsonProperty("AMOUNT")
    private BigDecimal amount;

    @JsonProperty("TIME")
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
