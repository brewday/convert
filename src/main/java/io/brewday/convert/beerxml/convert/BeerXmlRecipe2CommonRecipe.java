package io.brewday.convert.beerxml.convert;

import io.brewday.convert.beerxml.domain.BeerXmlRecipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BeerXmlRecipe2CommonRecipe implements Converter<BeerXmlRecipe, io.brewday.convert.common.domain.Recipe> {

    @Autowired
    private ConversionService conversionService;

    @Override
    public io.brewday.convert.common.domain.Recipe convert(BeerXmlRecipe source) {
        io.brewday.convert.common.domain.Recipe r = new io.brewday.convert.common.domain.Recipe();
        r.setName(source.getName());
        r.setVersion(source.getVersion());
        r.setType(source.getType());
        r.setBrewer(source.getBrewer());
        r.setAssistantBrewer(source.getAssistantBrewer());
        r.setBatchSize(source.getBatchSize());
        r.setBoilSize(source.getBoilSize());
        r.setBoilTime(source.getBoilTime());
        r.setEfficiency(source.getEfficiency());
        //r.setStyle(conversionService.convert(source.getStyle(), se.brewday.convert.common.Style.class);
        //r.setEquipment(source.getEquipment());
        //r.setWaters(source.getWaters());
        //r.setFermentables(source.getFermentables());
        //r.setMash(source.getMash());
        //r.setHops(source.getHops());
        //r.setYeasts(source.getYeasts());
        //r.setMiscs(source.getMiscs());
		return null;
    }
}
