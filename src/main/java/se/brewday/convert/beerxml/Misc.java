package se.brewday.convert.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import se.brewday.convert.jsondeserializers.StringBooleanJsonDeserializer;
import java.math.BigDecimal;

@JacksonXmlRootElement(localName = "MISC")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Misc {

    @JacksonXmlProperty(localName = "NAME")
    private String name;

    @JacksonXmlProperty(localName = "VERSION")
    private int version;

    @JacksonXmlProperty(localName = "NOTES")
    private String notes;

    @JacksonXmlProperty(localName = "TYPE")
    private String type;

    @JacksonXmlProperty(localName = "USE")
    private String use;

    @JacksonXmlProperty(localName = "USE_FOR")
    private String useFor;

    @JacksonXmlProperty(localName = "AMOUNT")
    private BigDecimal amount;

    @JacksonXmlProperty(localName = "TIME")
    private BigDecimal time;

    @JacksonXmlProperty(localName = "AMOUNT_IS_WEIGHT")
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
