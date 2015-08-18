package se.brewday.convert.beersmith;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import se.brewday.convert.xmladapters.BooleanIntAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mash {
	@XmlElement(name = "F_MH_NAME")
	private String name; //Single Infusion, Full Body

	@XmlElement(name = "F_MH_NOTES")
	private String notes; //Simple single infusion mash for use with most modern well modified grains (about 95% of the time).

	@XmlElement(name = "F_MH_GRAIN_WEIGHT")
	private BigDecimal grainWeight; //433.8698064

	@XmlElement(name = "F_MH_GRAIN_TEMP")
	private BigDecimal grainTemp; //72.0000000

	@XmlElement(name = "F_MH_BOIL_TEMP")
	private BigDecimal boilTemp; //212.0000000

	@XmlElement(name = "F_MH_TUN_TEMP")
	private BigDecimal tunTemp; //72.0000000

	@XmlElement(name = "F_MH_PH")
	private BigDecimal ph; //5.4000000

	@XmlElement(name = "F_MH_SPARGE_TEMP")
	private BigDecimal spargeTemp; //168.0000000

	@XmlElement(name = "F_MH_BATCH")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean batch; //0

	@XmlElement(name = "F_MH_BATCH_PCT")
	private BigDecimal batchPercent; //100.0000000

	@XmlElement(name = "F_MH_BATCH_EVEN")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean batchEven; //0

	@XmlElement(name = "F_MH_BATCH_DRAIN")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean batchDrain; //0

	@XmlElement(name = "F_MASH_39")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean mash39; //1

	@XmlElement(name = "F_MH_TUN_DEADSPACE")
	private BigDecimal tunDeadspace; //0.0000000

	@XmlElement(name = "F_MH_BIAB_VOL")
	private BigDecimal biabVolume; //640.0000000

	@XmlElement(name = "F_MH_BIAB")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean biab; //0

	@XmlElement(name = "F_MH_EQUIP_ADJUST")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean equipAdjust; //0

	@XmlElement(name = "F_MH_TUN_VOL")
	private BigDecimal tunVolume; //2366.9679479

	@XmlElement(name = "F_MH_TUN_MASS")
	private BigDecimal tunMass; //846.5752320

	@XmlElement(name = "F_MH_TUN_HC")
	private BigDecimal tunHc; //0.1200000

	@XmlElementWrapper(name = "steps")
	private MashStepList steps;

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

	public BigDecimal getGrainWeight() {
		return grainWeight;
	}

	public void setGrainWeight(BigDecimal grainWeight) {
		this.grainWeight = grainWeight;
	}

	public BigDecimal getGrainTemp() {
		return grainTemp;
	}

	public void setGrainTemp(BigDecimal grainTemp) {
		this.grainTemp = grainTemp;
	}

	public BigDecimal getBoilTemp() {
		return boilTemp;
	}

	public void setBoilTemp(BigDecimal boilTemp) {
		this.boilTemp = boilTemp;
	}

	public BigDecimal getTunTemp() {
		return tunTemp;
	}

	public void setTunTemp(BigDecimal tunTemp) {
		this.tunTemp = tunTemp;
	}

	public BigDecimal getPh() {
		return ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public BigDecimal getSpargeTemp() {
		return spargeTemp;
	}

	public void setSpargeTemp(BigDecimal spargeTemp) {
		this.spargeTemp = spargeTemp;
	}

	public boolean isBatch() {
		return batch;
	}

	public void setBatch(boolean batch) {
		this.batch = batch;
	}

	public BigDecimal getBatchPercent() {
		return batchPercent;
	}

	public void setBatchPercent(BigDecimal batchPercent) {
		this.batchPercent = batchPercent;
	}

	public boolean isBatchEven() {
		return batchEven;
	}

	public void setBatchEven(boolean batchEven) {
		this.batchEven = batchEven;
	}

	public boolean isBatchDrain() {
		return batchDrain;
	}

	public void setBatchDrain(boolean batchDrain) {
		this.batchDrain = batchDrain;
	}

	public boolean isMash39() {
		return mash39;
	}

	public void setMash39(boolean mash39) {
		this.mash39 = mash39;
	}

	public BigDecimal getTunDeadspace() {
		return tunDeadspace;
	}

	public void setTunDeadspace(BigDecimal tunDeadspace) {
		this.tunDeadspace = tunDeadspace;
	}

	public BigDecimal getBiabVolume() {
		return biabVolume;
	}

	public void setBiabVolume(BigDecimal biabVolume) {
		this.biabVolume = biabVolume;
	}

	public boolean isBiab() {
		return biab;
	}

	public void setBiab(boolean biab) {
		this.biab = biab;
	}

	public boolean isEquipAdjust() {
		return equipAdjust;
	}

	public void setEquipAdjust(boolean equipAdjust) {
		this.equipAdjust = equipAdjust;
	}

	public BigDecimal getTunVolume() {
		return tunVolume;
	}

	public void setTunVolume(BigDecimal tunVolume) {
		this.tunVolume = tunVolume;
	}

	public BigDecimal getTunMass() {
		return tunMass;
	}

	public void setTunMass(BigDecimal tunMass) {
		this.tunMass = tunMass;
	}

	public BigDecimal getTunHc() {
		return tunHc;
	}

	public void setTunHc(BigDecimal tunHc) {
		this.tunHc = tunHc;
	}

	public MashStepList getSteps() {
		return steps;
	}

	public void setSteps(MashStepList steps) {
		this.steps = steps;
	}
	//</editor-fold>
}
