package se.brewday.convert.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import se.brewday.convert.jsondeserializers.StringBooleanJsonDeserializer;

import java.math.BigDecimal;

@JsonRootName("YEAST")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Yeast {

	@JsonProperty("NAME")
	private String name;

	@JsonProperty("VERSION")
	private int version;

	@JsonProperty("NOTES")
	private String notes;

	@JsonProperty("AMOUNT")
	private BigDecimal amount;

	@JsonProperty("TYPE")
	private String type;

	@JsonProperty("FORM")
	private String form;

	@JsonProperty("AMOUNT_IS_WEIGHT")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
	private boolean amountIsWeight;

	@JsonProperty("LABORATORY")
	private String laboratory;

	@JsonProperty("PRODUCT_ID")
	private String productId;

	@JsonProperty("MIN_TEMPERATURE")
	private BigDecimal minTemperature;

	@JsonProperty("MAX_TEMPERATURE")
	private BigDecimal maxTemperature;

	@JsonProperty("FLOCCULATION")
	private String flocculation;

	@JsonProperty("ATTENUATION")
	private BigDecimal attenuation;

	@JsonProperty("BEST_FOR")
	private String bestFor;

	@JsonProperty("MAX_REUSE")
	private int maxReuse;

	@JsonProperty("TIMES_CULTURED")
	private int timesCultured;

	@JsonProperty("ADD_TO_SECONDARY")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
	private boolean addToSecondary;

	@JsonProperty("INVENTORY")
	private String inventory;

	@JsonProperty("CULTURE_DATE")
	private String cultureDate;

	// DISPLAY_AMOUNT
	// DISP_MIN_TEMP
	// DISP_MAX_TEMP

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

	public boolean isAmountIsWeight() {
		return amountIsWeight;
	}

	public void setAmountIsWeight(boolean amountIsWeight) {
		this.amountIsWeight = amountIsWeight;
	}

	public String getLaboratory() {
		return laboratory;
	}

	public void setLaboratory(String laboratory) {
		this.laboratory = laboratory;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public BigDecimal getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(BigDecimal minTemperature) {
		this.minTemperature = minTemperature;
	}

	public BigDecimal getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(BigDecimal maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	public String getFlocculation() {
		return flocculation;
	}

	public void setFlocculation(String flocculation) {
		this.flocculation = flocculation;
	}

	public BigDecimal getAttenuation() {
		return attenuation;
	}

	public void setAttenuation(BigDecimal attenuation) {
		this.attenuation = attenuation;
	}

	public String getBestFor() {
		return bestFor;
	}

	public void setBestFor(String bestFor) {
		this.bestFor = bestFor;
	}

	public int getMaxReuse() {
		return maxReuse;
	}

	public void setMaxReuse(int maxReuse) {
		this.maxReuse = maxReuse;
	}

	public int getTimesCultured() {
		return timesCultured;
	}

	public void setTimesCultured(int timesCultured) {
		this.timesCultured = timesCultured;
	}

	public boolean isAddToSecondary() {
		return addToSecondary;
	}

	public void setAddToSecondary(boolean addToSecondary) {
		this.addToSecondary = addToSecondary;
	}

	public String getInventory() {
		return inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getCultureDate() {
		return cultureDate;
	}

	public void setCultureDate(String cultureDate) {
		this.cultureDate = cultureDate;
	}

	//</editor-fold>
}
