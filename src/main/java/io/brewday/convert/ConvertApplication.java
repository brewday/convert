package io.brewday.convert;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
public class ConvertApplication {

	@Bean
	@Primary
	public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
		return builder.createXmlMapper(false).build();
	}

	@Bean
	@Qualifier("xmlMapper")
	public XmlMapper xmlMapper(Jackson2ObjectMapperBuilder builder) {
		return builder.createXmlMapper(true).build();
	}

	@Bean
	@Qualifier("yamlMapper")
	public YAMLMapper yamlMapper(Jackson2ObjectMapperBuilder builder) {
		YAMLMapper mapper = new YAMLMapper();
		builder.configure(mapper);
		return mapper;
	}

    public static void main(String[] args) {
        SpringApplication.run(ConvertApplication.class, args);
    }
}
