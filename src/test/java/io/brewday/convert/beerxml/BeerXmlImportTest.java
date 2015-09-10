package io.brewday.convert.beerxml;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.brewday.convert.beerxml.domain.BeerXmlRecipe;
import io.brewday.convert.common.domain.Recipe;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import io.brewday.convert.ConvertApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConvertApplication.class)
@WebAppConfiguration
public class BeerXmlImportTest {

    private XmlMapper mapper = Jackson2ObjectMapperBuilder.xml().build();

    @Test
    public void importTest() throws IOException {

        File file = new File(getClass().getResource("/beerxml/beer1.xml").getFile());

        List<BeerXmlRecipe> recipes = mapper.readValue(file, new TypeReference<List<Recipe>>() {});

        assertNotNull("Recipes cannot be null", recipes);

        assertTrue("Recipes exist", recipes.size() > 0);
    }
}
