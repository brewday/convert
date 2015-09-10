package io.brewday.convert.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.brewday.convert.jsonadapters.StringBooleanJsonDeserializer;

import java.math.BigDecimal;

@JsonRootName("MISC")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Misc {

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("VERSION")
    private int version;

    @JsonProperty("NOTES")
    private String notes;

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("USE")
    private String use;

    @JsonProperty("USE_FOR")
    private String useFor;

    @JsonProperty("AMOUNT")
    private BigDecimal amount;

    @JsonProperty("TIME")
    private BigDecimal time;

    @JsonProperty("AMOUNT_IS_WEIGHT")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
    private boolean amountIsWeight;

    // DISPLAY_AMOUNT
    // INVENTORY
    // DISPLAY_TIME
    // BATCH_SIZE

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getUseFor() {
		return useFor;
	}

	public void setUseFor(String useFor) {
		this.useFor = useFor;
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

	public boolean getAmountIsWeight() {
		return amountIsWeight;
	}

	public void setAmountIsWeight(boolean amountIsWeight) {
		this.amountIsWeight = amountIsWeight;
	}
	//</editor-fold>
}
