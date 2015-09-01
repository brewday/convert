package se.brewday.convert.jsonadapters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BigDecimalTest {

	private ObjectMapper jsonMapper = Jackson2ObjectMapperBuilder.json().build();

	@Test
	public void serializeTest() {
		BigDecimal d = new BigDecimal(50.5000234);
		String s = d.setScale(2, BigDecimal.ROUND_UP).toString();
		assertEquals("String should be 50.50", "50.50", s);
	}

	@Test
	public void jsonSerializeTest() throws JsonProcessingException {

		jsonMapper.registerModule(new JsonModule());

		BigDecimal d = new BigDecimal(50.5000234);
		String s = jsonMapper.writeValueAsString(d);

		assertEquals("String should be 50.50", "50.50", s);
	}
}
