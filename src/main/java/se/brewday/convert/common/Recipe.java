package se.brewday.convert.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.util.List;

@JsonRootName("RECIPE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {

    @JsonProperty("NAME")
    private String name;

    @JsonProperty("VERSION")
    private int version;

    @JsonProperty("TYPE")
    private String type;

    @JsonProperty("BREWER")
    private String brewer;

    @JsonProperty("ASST_BREWER")
    private String assistantBrewer;

    @JsonProperty("BATCH_SIZE")
    private BigDecimal batchSize;

    @JsonProperty("BOIL_SIZE")
    private BigDecimal boilSize;

    @JsonProperty("BOIL_TIME")
    private BigDecimal boilTime;

    @JsonProperty("EFFICIENCY")
    private BigDecimal efficiency;

	//<editor-fold desc="Relations">
	@JsonProperty("STYLE")
	private Style style;

	@JsonProperty("EQUIPMENT")
	private Equipment equipment;

	@JsonProperty("WATERS")
	private List<Water> waters;

    @JsonProperty("FERMENTABLES")
    private List<Fermentable> fermentables;

	@JsonProperty("MASH")
	private Mash mash;

	@JsonProperty("HOPS")
	private List<Hop> hops;

	@JsonProperty("YEASTS")
	private List<Yeast> yeasts;

	@JsonProperty("MISCS")
	private List<Misc> miscs;
	//</editor-fold>

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrewer() {
		return brewer;
	}

	public void setBrewer(String brewer) {
		this.brewer = brewer;
	}

	public String getAssistantBrewer() {
		return assistantBrewer;
	}

	public void setAssistantBrewer(String assistantBrewer) {
		this.assistantBrewer = assistantBrewer;
	}

	public BigDecimal getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(BigDecimal batchSize) {
		this.batchSize = batchSize;
	}

	public BigDecimal getBoilSize() {
		return boilSize;
	}

	public void setBoilSize(BigDecimal boilSize) {
		this.boilSize = boilSize;
	}

	public BigDecimal getBoilTime() {
		return boilTime;
	}

	public void setBoilTime(BigDecimal boilTime) {
		this.boilTime = boilTime;
	}

	public BigDecimal getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(BigDecimal efficiency) {
		this.efficiency = efficiency;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public List<Water> getWaters() {
		return waters;
	}

	public void setWaters(List<Water> waters) {
		this.waters = waters;
	}

	public List<Fermentable> getFermentables() {
		return fermentables;
	}

	public void setFermentables(List<Fermentable> fermentables) {
		this.fermentables = fermentables;
	}

	public Mash getMash() {
		return mash;
	}

	public void setMash(Mash mash) {
		this.mash = mash;
	}

	public List<Hop> getHops() {
		return hops;
	}

	public void setHops(List<Hop> hops) {
		this.hops = hops;
	}

	public List<Yeast> getYeasts() {
		return yeasts;
	}

	public void setYeasts(List<Yeast> yeasts) {
		this.yeasts = yeasts;
	}

	public List<Misc> getMiscs() {
		return miscs;
	}

	public void setMiscs(List<Misc> miscs) {
		this.miscs = miscs;
	}

	//</editor-fold>
}
