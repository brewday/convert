package se.brewday.convert.jsonadapters;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class JsonModule extends SimpleModule {
	public JsonModule() {
		this.addSerializer(BigDecimal.class, new DefaultBigDecimalJsonSerializer());
	}
}
