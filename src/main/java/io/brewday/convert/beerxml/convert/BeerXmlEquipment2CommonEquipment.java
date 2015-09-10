package io.brewday.convert.beerxml.convert;

import io.brewday.convert.beerxml.domain.Equipment;
import org.springframework.core.convert.converter.Converter;

public class BeerXmlEquipment2CommonEquipment implements Converter<Equipment, io.brewday.convert.common.domain.Equipment> {
    @Override
    public io.brewday.convert.common.domain.Equipment convert(Equipment source) {
        io.brewday.convert.common.domain.Equipment e = new io.brewday.convert.common.domain.Equipment();
        e.setName(source.getName());
        e.setVersion(source.getVersion());
        e.setNotes(source.getNotes());
        e.setBoilSize(source.getBoilSize());
        e.setBatchSize(source.getBatchSize());
        e.setTunVolume(source.getTunVolume());
        e.setTunWeight(source.getTunWeight());
        e.setTunSpecificHeat(source.getTunSpecificHeat());
        e.setTopUpWater(source.getTopUpWater());
        e.setTrubChillerLoss(source.getTrubChillerLoss());
        e.setEvaporationRate(source.getEvaporationRate());
        e.setBoilTime(source.getBoilTime());
        e.setCalculateBoilVolume(source.isCalculateBoilVolume());
        e.setLauterDeadspace(source.getLauterDeadspace());
        e.setTopUpKettle(source.getTopUpKettle());
        e.setHopUtilization(source.getHopUtilization());
        e.setCoolingLossPercentage(source.getCoolingLossPercentage());
        return e;
    }
}
