package io.brewday.convert.beerxml.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "RECIPES")
public class Recipes {

	@JacksonXmlElementWrapper(useWrapping = false)
    private List<BeerXmlRecipe> recipes = new ArrayList<>();

    public List<BeerXmlRecipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<BeerXmlRecipe> recipes) {
        this.recipes = recipes;
    }
}
