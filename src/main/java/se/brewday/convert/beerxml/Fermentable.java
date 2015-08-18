package se.brewday.convert.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import se.brewday.convert.jsondeserializers.StringBooleanJsonDeserializer;

import java.math.BigDecimal;

@JsonRootName("FERMENTABLE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fermentable {

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("VERSION")
    private int version;

    @JsonProperty("NOTES")
    private String notes;

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("AMOUNT")
    private BigDecimal amount;

    @JsonProperty("YIELD")
    private BigDecimal yield;

    @JsonProperty("COLOR")
    private BigDecimal color;

    @JsonProperty("ADD_AFTER_BOIL")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
    private boolean addAfterBoil;

    @JsonProperty("ORIGIN")
    private String origin;

    @JsonProperty("SUPPLIER")
    private String supplier;

    @JsonProperty("COARSE_FINE_DIFF")
    private BigDecimal courseFineDiff;

    @JsonProperty("MOISTURE")
    private BigDecimal moisture;

    @JsonProperty("DIASTATIC_POWER")
    private BigDecimal diastaticPower;

    @JsonProperty("PROTEIN")
    private BigDecimal protein;

    @JsonProperty("MAX_IN_BATCH")
    private BigDecimal maxInBatch;

    @JsonProperty("RECOMMEND_MASH")
	@JsonDeserialize(using = StringBooleanJsonDeserializer.class)
    private boolean recommendMash;

    @JsonProperty("IBU_GAL_PER_LB")
    private BigDecimal ibuGalPerLB;

    @JsonProperty("POTENTIAL")
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
