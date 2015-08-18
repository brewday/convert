package se.brewday.convert.beerxml.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import se.brewday.convert.beerxml.Recipe;

@Component
public class BeerXmlRecipe2CommonRecipe implements Converter<Recipe, se.brewday.convert.common.Recipe> {

    @Autowired
    private ConversionService conversionService;

    @Override
    public se.brewday.convert.common.Recipe convert(Recipe source) {
        se.brewday.convert.common.Recipe r = new se.brewday.convert.common.Recipe();
        r.setName(source.getName());
        r.setVersion(source.getVersion());
        r.setType(source.getType());
        r.setBrewer(source.getBrewer());
        r.setAssistantBrewer(source.getAssistantBrewer());
        r.setBatchSize(source.getBatchSize());
        r.setBoilSize(source.getBoilSize());
        r.setBoilTime(source.getBoilTime());
        r.setEfficiency(source.getEfficiency());
        r.setStyle(conversionService.convert(source.getStyle(), se.brewday.convert.common.Style.class);
        r.setEquipment(source.getEquipment());
        r.setWaters(source.getWaters());
        r.setFermentables(source.getFermentables());
        r.setMash(source.getMash());
        r.setHops(source.getHops());
        r.setYeasts(source.getYeasts());
        r.setMiscs(source.getMiscs());
    }
}
