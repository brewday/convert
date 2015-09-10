package io.brewday.convert.beersmith.domain;

import io.brewday.convert.xmladapters.BooleanIntAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlType(name = "Water")
public class Water extends Ingredient {

	@XmlElement(name = "F_W_NAME")
	private String name; // Randy Moshers Ideal Pale Ale

	@XmlElement(name = "F_W_NOTES")
	private String notes; // Skr&aring;msta med en bra Pale Ale profil

	@XmlElement(name = "F_W_AMOUNT")
	private double amount; // 1690.6913913

	@XmlElement(name = "F_W_IN_RECIPE")
	@XmlJavaTypeAdapter(BooleanIntAdapter.class)
	private boolean inRecipe; // 1

	@XmlElement(name = "F_W_PH")
	private double ph; // 8.2000000

	@XmlElement(name = "F_W_CALCIUM")
	private double calcium; // 110.0000000

	@XmlElement(name = "F_W_MAGNESIUM")
	private double magnesium; // 18.0000000

	@XmlElement(name = "F_W_SODIUM")
	private double sodium; // 17.0000000

	@XmlElement(name = "F_W_SULFATE")
	private double sulfate; // 350.0000000

	@XmlElement(name = "F_W_CHLORIDE")
	private double chloride; // 50.0000000

	@XmlElement(name = "F_W_BICARB")
	private double bicarb; // 0.0000000

	@XmlElement(name = "F_W_GYPSUM")
	private double gypsum; // 0.2881914

	@XmlElement(name = "F_W_SALT")
	private double salt; // 0.0294586

	@XmlElement(name = "F_W_EPSOM")
	private double epsom; // 0.1955995

	@XmlElement(name = "F_W_CACL")
	private double cacl; // 0.0000000

	@XmlElement(name = "F_W_SODA")
	private double soda; // 0.0000000

	@XmlElement(name = "F_W_CHALK")
	private double chalk; // 0.0000000

	@XmlElement(name = "F_W_ADDITIONS_VOL")
	private double additionsVolume; // 676.2765565

	//<editor-fold desc="Getters And Setters">
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isInRecipe() {
		return inRecipe;
	}

	public void setInRecipe(boolean inRecipe) {
		this.inRecipe = inRecipe;
	}

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}

	public double getCalcium() {
		return calcium;
	}

	public void setCalcium(double calcium) {
		this.calcium = calcium;
	}

	public double getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(double magnesium) {
		this.magnesium = magnesium;
	}

	public double getSodium() {
		return sodium;
	}

	public void setSodium(double sodium) {
		this.sodium = sodium;
	}

	public double getSulfate() {
		return sulfate;
	}

	public void setSulfate(double sulfate) {
		this.sulfate = sulfate;
	}

	public double getChloride() {
		return chloride;
	}

	public void setChloride(double chloride) {
		this.chloride = chloride;
	}

	public double getBicarb() {
		return bicarb;
	}

	public void setBicarb(double bicarb) {
		this.bicarb = bicarb;
	}

	public double getGypsum() {
		return gypsum;
	}

	public void setGypsum(double gypsum) {
		this.gypsum = gypsum;
	}

	public double getSalt() {
		return salt;
	}

	public void setSalt(double salt) {
		this.salt = salt;
	}

	public double getEpsom() {
		return epsom;
	}

	public void setEpsom(double epsom) {
		this.epsom = epsom;
	}

	public double getCacl() {
		return cacl;
	}

	public void setCacl(double cacl) {
		this.cacl = cacl;
	}

	public double getSoda() {
		return soda;
	}

	public void setSoda(double soda) {
		this.soda = soda;
	}

	public double getChalk() {
		return chalk;
	}

	public void setChalk(double chalk) {
		this.chalk = chalk;
	}

	public double getAdditionsVolume() {
		return additionsVolume;
	}

	public void setAdditionsVolume(double additionsVolume) {
		this.additionsVolume = additionsVolume;
	}
	//</editor-fold>
}
