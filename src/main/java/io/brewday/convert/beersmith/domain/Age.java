package io.brewday.convert.beersmith.domain;

import io.brewday.convert.xmladapters.BooleanIntAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@XmlType(name = "F_R_AGE")
public class Age {

	@XmlElement(name = "F_A_NAME")
	private String name; //Ale, Two Stage, keg aging

	@XmlElement(name = "F_A_TYPE")
	private String type; //1

	@XmlElement(name = "F_A_NOTES")
	private String notes; //Two stage ale fermentation suitable for just about any ale.  Two stage fermentations are used by many homebrewers to improve flavor by separating the active yeast and trub from the beer early.

	@XmlElement(name = "F_A_PRIM_DAYS")
	private BigDecimal primaryDays; //7.0000000

	@XmlElement(name = "F_A_PRIM_TEMP")
	private BigDecimal primaryTemp; //64.4000000

	@XmlElement(name = "F_A_SEC_DAYS")
	private BigDecimal secondaryDays; //10.0000000

	@XmlElement(name = "F_A_PRIM_END_TEMP")
	private BigDecimal primaryEndTemp; //64.4000000

	@XmlElement(name = "F_A_SEC_TEMP")
	private BigDecimal secondaryTemp; //69.8000000

	@XmlElement(name = "F_A_SEC_END_TEMP")
	private BigDecimal secondaryEndTemp; //69.8000000

	@XmlElement(name = "F_A_TERT_DAYS")
	private BigDecimal tertiaryDays; //7.0000000

	@XmlElement(name = "F_A_TERT_TEMP")
	private BigDecimal tertiaryTemp; //65.0000000

	@XmlElement(name = "F_A_TERT_END_TEMP")
	private BigDecimal tertiaryEndTemp; //65.0000000

	@XmlElement(name = "F_A_AGE")
	private BigDecimal ageDays; //14.0000000

	@XmlElement(name = "F_A_AGE_TEMP")
	private BigDecimal ageTemp; //39.2000000

	@XmlElement(name = "F_A_END_AGE_TEMP")
	private BigDecimal ageEndTemp; //39.2000000

	@XmlElement(name = "F_A_END_TEMPS_SET")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean endTempsSet; //1

	//<editor-fold desc="Getters and Setters">
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getPrimaryDays() {
		return primaryDays;
	}

	public void setPrimaryDays(BigDecimal primaryDays) {
		this.primaryDays = primaryDays;
	}

	public BigDecimal getPrimaryTemp() {
		return primaryTemp;
	}

	public void setPrimaryTemp(BigDecimal primaryTemp) {
		this.primaryTemp = primaryTemp;
	}

	public BigDecimal getSecondaryDays() {
		return secondaryDays;
	}

	public void setSecondaryDays(BigDecimal secondaryDays) {
		this.secondaryDays = secondaryDays;
	}

	public BigDecimal getPrimaryEndTemp() {
		return primaryEndTemp;
	}

	public void setPrimaryEndTemp(BigDecimal primaryEndTemp) {
		this.primaryEndTemp = primaryEndTemp;
	}

	public BigDecimal getSecondaryTemp() {
		return secondaryTemp;
	}

	public void setSecondaryTemp(BigDecimal secondaryTemp) {
		this.secondaryTemp = secondaryTemp;
	}

	public BigDecimal getSecondaryEndTemp() {
		return secondaryEndTemp;
	}

	public void setSecondaryEndTemp(BigDecimal secondaryEndTemp) {
		this.secondaryEndTemp = secondaryEndTemp;
	}

	public BigDecimal getTertiaryDays() {
		return tertiaryDays;
	}

	public void setTertiaryDays(BigDecimal tertiaryDays) {
		this.tertiaryDays = tertiaryDays;
	}

	public BigDecimal getTertiaryTemp() {
		return tertiaryTemp;
	}

	public void setTertiaryTemp(BigDecimal tertiaryTemp) {
		this.tertiaryTemp = tertiaryTemp;
	}

	public BigDecimal getTertiaryEndTemp() {
		return tertiaryEndTemp;
	}

	public void setTertiaryEndTemp(BigDecimal tertiaryEndTemp) {
		this.tertiaryEndTemp = tertiaryEndTemp;
	}

	public BigDecimal getAgeDays() {
		return ageDays;
	}

	public void setAgeDays(BigDecimal ageDays) {
		this.ageDays = ageDays;
	}

	public BigDecimal getAgeTemp() {
		return ageTemp;
	}

	public void setAgeTemp(BigDecimal ageTemp) {
		this.ageTemp = ageTemp;
	}

	public BigDecimal getAgeEndTemp() {
		return ageEndTemp;
	}

	public void setAgeEndTemp(BigDecimal ageEndTemp) {
		this.ageEndTemp = ageEndTemp;
	}

	public boolean isEndTempsSet() {
		return endTempsSet;
	}

	public void setEndTempsSet(boolean endTempsSet) {
		this.endTempsSet = endTempsSet;
	}
	//</editor-fold>
}
