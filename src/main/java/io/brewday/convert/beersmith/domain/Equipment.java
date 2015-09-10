package io.brewday.convert.beersmith.domain;

import io.brewday.convert.xmladapters.BooleanIntAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@XmlType(name = "F_R_EQUIPMENT")
public class Equipment {

	@XmlElement(name = "F_E_NAME")
	private String name; // Camurri CB-50

	@XmlElement(name = "F_E_NOTES")
	private String notes; // &quot;Sparge&quot; with 1L 78C water per kg of grain

	@XmlElement(name = "F_E_MASH_VOL")
	private BigDecimal mashVolume; // 2366.9679479

	@XmlElement(name = "F_E_TUN_MASS")
	private BigDecimal tunMass; // 846.5752320

	@XmlElement(name = "F_E_BOIL_RATE_FLAG")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean boilRateFlag; // 1

	@XmlElement(name = "F_E_TUN_SPECIFIC_HEAT")
	private BigDecimal tunSpecificHeat; // 0.1200000

	@XmlElement(name = "F_E_TUN_DEADSPACE")
	private BigDecimal tunDeadspace; // 0.0000000

	@XmlElement(name = "F_E_TUN_ADJ_DEADSPACE")
	private BigDecimal tunAdjustDeadspace; // 0

	@XmlElement(name = "F_E_CALC_BOIL")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean calculateBoil; // 0

	@XmlElement(name = "F_E_BOIL_VOL")
	private BigDecimal boilVolume; // 2164.0849809

	@XmlElement(name = "F_E_BOIL_TIME")
	private BigDecimal boilTime; // 75.0000000

	@XmlElement(name = "F_E_OLD_EVAP_RATE")
	private BigDecimal oldEvaporationRate; // 10.0000000

	@XmlElement(name = "F_EQUIP_39")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean uip39; // 1

	@XmlElement(name = "F_E_BOIL_OFF")
	private BigDecimal boilOff; // 169.0691391

	@XmlElement(name = "F_E_TRUB_LOSS")
	private BigDecimal trubLoss; // 202.8829670

	@XmlElement(name = "F_E_COOL_PCT")
	private BigDecimal coolPercentage; // 4.0000000

	@XmlElement(name = "F_E_TOP_UP_KETTLE")
	private BigDecimal topUpKettle; // 0.0000000

	@XmlElement(name = "F_E_BATCH_VOL")
	private BigDecimal batchVolume; // 1690.6913913

	@XmlElement(name = "F_E_FERMENTER_LOSS")
	private BigDecimal fermenterLoss; // 33.8138278

	@XmlElement(name = "F_E_TOP_UP")
	private BigDecimal topUp; // 0.0000000

	@XmlElement(name = "F_E_EFFICIENCY")
	private BigDecimal efficiency; // 80.0000000

	@XmlElement(name = "F_E_HOP_UTIL")
	private BigDecimal hopUtilation; // 100.0000000

	//<editor-fold desc="Getters and Setters">
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getMashVolume() {
		return mashVolume;
	}

	public void setMashVolume(BigDecimal mashVolume) {
		this.mashVolume = mashVolume;
	}

	public BigDecimal getTunMass() {
		return tunMass;
	}

	public void setTunMass(BigDecimal tunMass) {
		this.tunMass = tunMass;
	}

	public boolean isBoilRateFlag() {
		return boilRateFlag;
	}

	public void setBoilRateFlag(boolean boilRateFlag) {
		this.boilRateFlag = boilRateFlag;
	}

	public BigDecimal getTunSpecificHeat() {
		return tunSpecificHeat;
	}

	public void setTunSpecificHeat(BigDecimal tunSpecificHeat) {
		this.tunSpecificHeat = tunSpecificHeat;
	}

	public BigDecimal getTunDeadspace() {
		return tunDeadspace;
	}

	public void setTunDeadspace(BigDecimal tunDeadspace) {
		this.tunDeadspace = tunDeadspace;
	}

	public BigDecimal getTunAdjustDeadspace() {
		return tunAdjustDeadspace;
	}

	public void setTunAdjustDeadspace(BigDecimal tunAdjustDeadspace) {
		this.tunAdjustDeadspace = tunAdjustDeadspace;
	}

	public boolean isCalculateBoil() {
		return calculateBoil;
	}

	public void setCalculateBoil(boolean calculateBoil) {
		this.calculateBoil = calculateBoil;
	}

	public BigDecimal getBoilVolume() {
		return boilVolume;
	}

	public void setBoilVolume(BigDecimal boilVolume) {
		this.boilVolume = boilVolume;
	}

	public BigDecimal getBoilTime() {
		return boilTime;
	}

	public void setBoilTime(BigDecimal boilTime) {
		this.boilTime = boilTime;
	}

	public BigDecimal getOldEvaporationRate() {
		return oldEvaporationRate;
	}

	public void setOldEvaporationRate(BigDecimal oldEvaporationRate) {
		this.oldEvaporationRate = oldEvaporationRate;
	}

	public boolean isUip39() {
		return uip39;
	}

	public void setUip39(boolean uip39) {
		this.uip39 = uip39;
	}

	public BigDecimal getBoilOff() {
		return boilOff;
	}

	public void setBoilOff(BigDecimal boilOff) {
		this.boilOff = boilOff;
	}

	public BigDecimal getTrubLoss() {
		return trubLoss;
	}

	public void setTrubLoss(BigDecimal trubLoss) {
		this.trubLoss = trubLoss;
	}

	public BigDecimal getCoolPercentage() {
		return coolPercentage;
	}

	public void setCoolPercentage(BigDecimal coolPercentage) {
		this.coolPercentage = coolPercentage;
	}

	public BigDecimal getTopUpKettle() {
		return topUpKettle;
	}

	public void setTopUpKettle(BigDecimal topUpKettle) {
		this.topUpKettle = topUpKettle;
	}

	public BigDecimal getBatchVolume() {
		return batchVolume;
	}

	public void setBatchVolume(BigDecimal batchVolume) {
		this.batchVolume = batchVolume;
	}

	public BigDecimal getFermenterLoss() {
		return fermenterLoss;
	}

	public void setFermenterLoss(BigDecimal fermenterLoss) {
		this.fermenterLoss = fermenterLoss;
	}

	public BigDecimal getTopUp() {
		return topUp;
	}

	public void setTopUp(BigDecimal topUp) {
		this.topUp = topUp;
	}

	public BigDecimal getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(BigDecimal efficiency) {
		this.efficiency = efficiency;
	}

	public BigDecimal getHopUtilation() {
		return hopUtilation;
	}

	public void setHopUtilation(BigDecimal hopUtilation) {
		this.hopUtilation = hopUtilation;
	}
	//</editor-fold>
}
