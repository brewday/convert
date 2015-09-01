package se.brewday.convert.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import se.brewday.convert.jsonadapters.StringBooleanJsonDeserializer;

import java.math.BigDecimal;

@JacksonXmlRootElement(localName = "FERMENTABLE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fermentable {

    @JacksonXmlProperty(localName = "NAME")
    private String name;

    @JacksonXmlProperty(localName = "VERSION")
    private int version;

    @JacksonXmlProperty(localName = "NOTES")
    private String notes;

    @JacksonXmlProperty(localName = "TYPE")
    private String type;

    @JacksonXmlProperty(localName = "AMOUNT")
    private BigDecimal amount;

    @JacksonXmlProperty(localName = "YIELD")
    private BigDecimal yield;

    @JacksonXmlProperty(localName = "COLOR")
    private BigDecimal color;

    @JacksonXmlProperty(localName = "ADD_AFTER_BOIL")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
    private boolean addAfterBoil;

    @JacksonXmlProperty(localName = "ORIGIN")
    private String origin;

    @JacksonXmlProperty(localName = "SUPPLIER")
    private String supplier;

    @JacksonXmlProperty(localName = "COARSE_FINE_DIFF")
    private BigDecimal courseFineDiff;

    @JacksonXmlProperty(localName = "MOISTURE")
    private BigDecimal moisture;

    @JacksonXmlProperty(localName = "DIASTATIC_POWER")
    private BigDecimal diastaticPower;

    @JacksonXmlProperty(localName = "PROTEIN")
    private BigDecimal protein;

    @JacksonXmlProperty(localName = "MAX_IN_BATCH")
    private BigDecimal maxInBatch;

    @JacksonXmlProperty(localName = "RECOMMEND_MASH")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
    private boolean recommendMash;

    @JacksonXmlProperty(localName = "IBU_GAL_PER_LB")
    private BigDecimal ibuGalPerLB;

    @JacksonXmlProperty(localName = "POTENTIAL")
    private BigDecimal potential;

    // DISPLAY_AMOUNT
    // INVENTORY
    // DISPLAY_COLOR
    // EXTRACT_SUBSTITUTE


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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getYield() {
		return yield;
	}

	public void setYield(BigDecimal yield) {
		this.yield = yield;
	}

	public BigDecimal getColor() {
		return color;
	}

	public void setColor(BigDecimal color) {
		this.color = color;
	}

	public boolean isAddAfterBoil() {
		return addAfterBoil;
	}

	public void setAddAfterBoil(boolean addAfterBoil) {
		this.addAfterBoil = addAfterBoil;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public BigDecimal getCourseFineDiff() {
		return courseFineDiff;
	}

	public void setCourseFineDiff(BigDecimal courseFineDiff) {
		this.courseFineDiff = courseFineDiff;
	}

	public BigDecimal getMoisture() {
		return moisture;
	}

	public void setMoisture(BigDecimal moisture) {
		this.moisture = moisture;
	}

	public BigDecimal getDiastaticPower() {
		return diastaticPower;
	}

	public void setDiastaticPower(BigDecimal diastaticPower) {
		this.diastaticPower = diastaticPower;
	}

	public BigDecimal getProtein() {
		return protein;
	}

	public void setProtein(BigDecimal protein) {
		this.protein = protein;
	}

	public BigDecimal getMaxInBatch() {
		return maxInBatch;
	}

	public void setMaxInBatch(BigDecimal maxInBatch) {
		this.maxInBatch = maxInBatch;
	}

	public boolean isRecommendMash() {
		return recommendMash;
	}

	public void setRecommendMash(boolean recommendMash) {
		this.recommendMash = recommendMash;
	}

	public BigDecimal getIbuGalPerLB() {
		return ibuGalPerLB;
	}

	public void setIbuGalPerLB(BigDecimal ibuGalPerLB) {
		this.ibuGalPerLB = ibuGalPerLB;
	}

	public BigDecimal getPotential() {
		return potential;
	}

	public void setPotential(BigDecimal potential) {
		this.potential = potential;
	}
	//</editor-fold>
}
