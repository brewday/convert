package se.brewday.convert.beerxml.convert;

import org.springframework.core.convert.converter.Converter;
import se.brewday.convert.beerxml.Equipment;

public class BeerXmlEquipment2CommonEquipment implements Converter<Equipment, se.brewday.convert.common.Equipment> {
    @Override
    public se.brewday.convert.common.Equipment convert(Equipment source) {
        se.brewday.convert.common.Equipment e = new se.brewday.convert.common.Equipment();
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
