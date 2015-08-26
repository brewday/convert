package se.brewday.convert.beerxml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.math.BigDecimal;

@JacksonXmlRootElement(localName = "STYLE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Style {

    @JacksonXmlProperty(localName = "NAME")
    private String name;

    @JacksonXmlProperty(localName = "VERSION")
    private int version;

    @JacksonXmlProperty(localName = "NOTES")
    private String notes;

    @JacksonXmlProperty(localName = "TYPE")
    private String type;

    @JacksonXmlProperty(localName = "CATEGORY")
    private String category;

    @JacksonXmlProperty(localName = "CATEGORY_NUMBER")
    private int categoryNumber;

    @JacksonXmlProperty(localName = "STYLE_LETTER")
    private String styleLetter;

    @JacksonXmlProperty(localName = "STYLE_GUIDE")
    private String styleGuide;

    @JacksonXmlProperty(localName = "PROFILE")
    private String profile;

    @JacksonXmlProperty(localName = "INGREDIENTS")
    private String ingredients;

    @JacksonXmlProperty(localName = "EXAMPLES")
    private String examples;

    @JacksonXmlProperty(localName = "OG_MIN")
    private BigDecimal ogMin;

    @JacksonXmlProperty(localName = "OG_MAX")
    private BigDecimal ogMax;

    @JacksonXmlProperty(localName = "FG_MIN")
    private BigDecimal fgMin;

    @JacksonXmlProperty(localName = "FG_MAX")
    private BigDecimal fgMax;

    @JacksonXmlProperty(localName = "IBU_MIN")
    private BigDecimal ibuMin;

    @JacksonXmlProperty(localName = "IBU_MAX")
    private BigDecimal ibuMax;

    @JacksonXmlProperty(localName = "COLOR_MIN")
    private BigDecimal colorMin;

    @JacksonXmlProperty(localName = "COLOR_MAX")
    private BigDecimal colorMax;

    @JacksonXmlProperty(localName = "CARB_MIN")
    private BigDecimal carbMin;

    @JacksonXmlProperty(localName = "CARB_MAX")
    private BigDecimal carbMax;

    @JacksonXmlProperty(localName = "ABV_MAX")
    private BigDecimal abvMax;

    @JacksonXmlProperty(localName = "ABV_MIN")
    private BigDecimal abvMin;

    // DISPLAY_OG_MIN
    // DISPLAY_OG_MAX
    // DISPLAY_FG_MIN
    // DISPLAY_FG_MAX
    // DISPLAY_COLOR_MIN
    // DISPLAY_COLOR_MAX

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(int categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public String getStyleLetter() {
		return styleLetter;
	}

	public void setStyleLetter(String styleLetter) {
		this.styleLetter = styleLetter;
	}

	public String getStyleGuide() {
		return styleGuide;
	}

	public void setStyleGuide(String styleGuide) {
		this.styleGuide = styleGuide;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getExamples() {
		return examples;
	}

	public void setExamples(String examples) {
		this.examples = examples;
	}

	public BigDecimal getOgMin() {
		return ogMin;
	}

	public void setOgMin(BigDecimal ogMin) {
		this.ogMin = ogMin;
	}

	public BigDecimal getOgMax() {
		return ogMax;
	}

	public void setOgMax(BigDecimal ogMax) {
		this.ogMax = ogMax;
	}

	public BigDecimal getFgMin() {
		return fgMin;
	}

	public void setFgMin(BigDecimal fgMin) {
		this.fgMin = fgMin;
	}

	public BigDecimal getFgMax() {
		return fgMax;
	}

	public void setFgMax(BigDecimal fgMax) {
		this.fgMax = fgMax;
	}

	public BigDecimal getIbuMin() {
		return ibuMin;
	}

	public void setIbuMin(BigDecimal ibuMin) {
		this.ibuMin = ibuMin;
	}

	public BigDecimal getIbuMax() {
		return ibuMax;
	}

	public void setIbuMax(BigDecimal ibuMax) {
		this.ibuMax = ibuMax;
	}

	public BigDecimal getColorMin() {
		return colorMin;
	}

	public void setColorMin(BigDecimal colorMin) {
		this.colorMin = colorMin;
	}

	public BigDecimal getColorMax() {
		return colorMax;
	}

	public void setColorMax(BigDecimal colorMax) {
		this.colorMax = colorMax;
	}

	public BigDecimal getCarbMin() {
		return carbMin;
	}

	public void setCarbMin(BigDecimal carbMin) {
		this.carbMin = carbMin;
	}

	public BigDecimal getCarbMax() {
		return carbMax;
	}

	public void setCarbMax(BigDecimal carbMax) {
		this.carbMax = carbMax;
	}

	public BigDecimal getAbvMax() {
		return abvMax;
	}

	public void setAbvMax(BigDecimal abvMax) {
		this.abvMax = abvMax;
	}

	public BigDecimal getAbvMin() {
		return abvMin;
	}

	public void setAbvMin(BigDecimal abvMin) {
		this.abvMin = abvMin;
	}
	//</editor-fold>
}
