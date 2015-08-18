package se.brewday.convert.config;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.brewday.convert.jsondeserializers.BigDecimalJsonSerializer;
import java.math.BigDecimal;

@Configuration
public class JacksonConfig {

    /*@Bean
    public Module jacksonModule() {
        return new JacksonModule();
    }

    private class JacksonModule extends SimpleModule {
        public JacksonModule() {
            this.addSerializer(BigDecimal.class, new BigDecimalJsonSerializer());
        }
    }*/

}
