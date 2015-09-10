package io.brewday.convert.beersmith.domain;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement(name = "Recipe")
@JsonRootName(value = "recipe")
public class BeerSmithRecipe {

	@XmlElement(name = "F_R_NAME")
    private String name;

    @XmlElement(name = "F_R_BREWER")
    private String brewer;

    @XmlElement(name = "F_R_ASST_BREWER")
    private String assistantBrewer;

	@XmlElement(name = "F_R_DATE")
	private LocalDate created;

	@XmlElement(name = "F_R_EQUIPMENT")
	private Equipment equipment;

	@XmlElement(name = "F_R_MASH")
	private Mash mash;

	@XmlElement(name = "F_R_AGE")
	private Age age;

	@XmlElement(name = "Ingredients")
	private IngredientList ingredients = new IngredientList();

	//<editor-fold desc="Getters and Setters">
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Mash getMash() {
		return mash;
	}

	public void setMash(Mash mash) {
		this.mash = mash;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public IngredientList getIngredients() {
		return ingredients;
	}

	public void setIngredients(IngredientList ingredients) {
		this.ingredients = ingredients;
	}

	//</editor-fold>
}
