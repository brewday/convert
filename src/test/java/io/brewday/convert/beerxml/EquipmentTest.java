package io.brewday.convert.beerxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.brewday.convert.beerxml.domain.Equipment;
import org.junit.Test;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.math.BigDecimal;

public class EquipmentTest {

	private XmlMapper xmlMapper = Jackson2ObjectMapperBuilder.xml().build();
	private ObjectMapper jsonMapper = Jackson2ObjectMapperBuilder.json().build();

	@Test
	public void serializeEquipmentTest() throws JsonProcessingException {
		Equipment e = new Equipment();
		e.setName("Camurri");
		e.setBoilSize(new BigDecimal(90));

		String xml = xmlMapper.writeValueAsString(e);
		String json = jsonMapper.writeValueAsString(e);
	}
}
