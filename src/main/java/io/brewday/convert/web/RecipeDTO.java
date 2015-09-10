package io.brewday.convert.web;

import io.brewday.convert.beersmith.domain.BeerSmithRecipe;
import io.brewday.convert.beerxml.domain.BeerXmlRecipe;

public class RecipeDTO {
	private final BeerXmlRecipe beerXmlRecipe;
	private final BeerSmithRecipe beerSmithRecipe;
	private final String yamlRecipe;
	private final String htmlRecipe;

	public RecipeDTO(BeerXmlRecipe beerXmlRecipe, BeerSmithRecipe beerSmithRecipe, String yamlRecipe, String htmlRecipe) {
		this.beerXmlRecipe = beerXmlRecipe;
		this.beerSmithRecipe = beerSmithRecipe;
		this.yamlRecipe = yamlRecipe;
		this.htmlRecipe = htmlRecipe;
	}

	public BeerXmlRecipe getBeerXmlRecipe() {
		return beerXmlRecipe;
	}

	public BeerSmithRecipe getBeerSmithRecipe() {
		return beerSmithRecipe;
	}

	public String getYamlRecipe() {
		return yamlRecipe;
	}

	public String getHtmlRecipe() {
		return htmlRecipe;
	}
}
