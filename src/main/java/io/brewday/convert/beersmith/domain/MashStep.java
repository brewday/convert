package io.brewday.convert.beersmith.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlType(name = "MashStep")
public class MashStep {

	@XmlElement(name = "F_MS_NAME")
	private String name; //Mash In

	@XmlElement(name = "F_MS_TYPE")
	private int type; //0

	@XmlElement(name = "F_MS_INFUSION")
	private BigDecimal infusion; //1084.6934946

	@XmlElement(name = "F_MS_STEP_TEMP")
	private BigDecimal stepTemp; //154.4000000

	@XmlElement(name = "F_MS_STEP_TIME")
	private BigDecimal stepTime; //45.0000000

	@XmlElement(name = "F_MS_RISE_TIME")
	private BigDecimal riseTime; //2.0000000

	@XmlElement(name = "F_MS_TUN_ADDITION")
	private BigDecimal tunAddition; //0.0000000

	@XmlElement(name = "F_MS_TUN_HC")
	private BigDecimal tunHc; //0.1200000

	@XmlElement(name = "F_MS_TUN_VOL")
	private BigDecimal tunVolume; //2366.9679479

	@XmlElement(name = "F_MS_TUN_TEMP")
	private BigDecimal tunTemp; //72.0000000

	@XmlElement(name = "F_MS_TUN_MASS")
	private BigDecimal tunMass; //0.0000000

	@XmlElement(name = "F_MS_START_TEMP")
	private BigDecimal startTemp; //0.0000000

	@XmlElement(name = "F_MS_GRAIN_TEMP")
	private BigDecimal grainTemp; //72.0000000

	@XmlElement(name = "F_MS_START_VOL")
	private BigDecimal startVolume; //0.0000000

	@XmlElement(name = "F_MS_GRAIN_WEIGHT")
	private BigDecimal grainWeight; //433.8698064

	@XmlElement(name = "F_MS_INFUSION_TEMP")
	private BigDecimal infusionTemp; //166.4061272

	@XmlElement(name = "F_MS_DECOCTION_AMT")
	private BigDecimal decoctionAmount; //0.0000000

	//<editor-fold desc="Getters and Setters">
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public BigDecimal getInfusion() {
		return infusion;
	}

	public void setInfusion(BigDecimal infusion) {
		this.infusion = infusion;
	}

	public BigDecimal getStepTemp() {
		return stepTemp;
	}

	public void setStepTemp(BigDecimal stepTemp) {
		this.stepTemp = stepTemp;
	}

	public BigDecimal getStepTime() {
		return stepTime;
	}

	public void setStepTime(BigDecimal stepTime) {
		this.stepTime = stepTime;
	}

	public BigDecimal getRiseTime() {
		return riseTime;
	}

	public void setRiseTime(BigDecimal riseTime) {
		this.riseTime = riseTime;
	}

	public BigDecimal getTunAddition() {
		return tunAddition;
	}

	public void setTunAddition(BigDecimal tunAddition) {
		this.tunAddition = tunAddition;
	}

	public BigDecimal getTunHc() {
		return tunHc;
	}

	public void setTunHc(BigDecimal tunHc) {
		this.tunHc = tunHc;
	}

	public BigDecimal getTunVolume() {
		return tunVolume;
	}

	public void setTunVolume(BigDecimal tunVolume) {
		this.tunVolume = tunVolume;
	}

	public BigDecimal getTunTemp() {
		return tunTemp;
	}

	public void setTunTemp(BigDecimal tunTemp) {
		this.tunTemp = tunTemp;
	}

	public BigDecimal getTunMass() {
		return tunMass;
	}

	public void setTunMass(BigDecimal tunMass) {
		this.tunMass = tunMass;
	}

	public BigDecimal getStartTemp() {
		return startTemp;
	}

	public void setStartTemp(BigDecimal startTemp) {
		this.startTemp = startTemp;
	}

	public BigDecimal getGrainTemp() {
		return grainTemp;
	}

	public void setGrainTemp(BigDecimal grainTemp) {
		this.grainTemp = grainTemp;
	}

	public BigDecimal getStartVolume() {
		return startVolume;
	}

	public void setStartVolume(BigDecimal startVolume) {
		this.startVolume = startVolume;
	}

	public BigDecimal getGrainWeight() {
		return grainWeight;
	}

	public void setGrainWeight(BigDecimal grainWeight) {
		this.grainWeight = grainWeight;
	}

	public BigDecimal getInfusionTemp() {
		return infusionTemp;
	}

	public void setInfusionTemp(BigDecimal infusionTemp) {
		this.infusionTemp = infusionTemp;
	}

	public BigDecimal getDecoctionAmount() {
		return decoctionAmount;
	}

	public void setDecoctionAmount(BigDecimal decoctionAmount) {
		this.decoctionAmount = decoctionAmount;
	}
	//</editor-fold>
}
