package se.brewday.convert.jsonadapters;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

public class BigDecimalJsonSerializer extends JsonSerializer<BigDecimal> {

	private int precision;

	public BigDecimalJsonSerializer(int precision) {
		this.precision = precision;
	}

	@Override
	public void serialize(BigDecimal value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
		BigDecimal v = value.setScale(precision, BigDecimal.ROUND_FLOOR);
		jsonGenerator.writeNumber(v);
	}

	public static class GramSerializer extends BigDecimalJsonSerializer {
		public GramSerializer() {
			super(4);
		}
	}

	public static class KilogramSerializer extends BigDecimalJsonSerializer {
		public KilogramSerializer() {
			super(2);
		}
	}

	public static class LiterSerializer extends BigDecimalJsonSerializer {
		public LiterSerializer() {
			super(2);
		}
	}

	public static class PercentSerializer extends BigDecimalJsonSerializer {
		public PercentSerializer() {
			super(2);
		}
	}

	public static class MinuteSerializer extends BigDecimalJsonSerializer {
		public MinuteSerializer() {
			super(0);
		}
	}
}
