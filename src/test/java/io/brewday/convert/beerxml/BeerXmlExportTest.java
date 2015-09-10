package io.brewday.convert.beerxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import io.brewday.convert.ConvertApplication;
import io.brewday.convert.beerxml.domain.BeerXmlRecipe;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConvertApplication.class)
@WebAppConfiguration
public class BeerXmlExportTest {

	@Autowired
	private ObjectMapper jsonMapper;

	@Autowired
	@Qualifier("xmlMapper")
	private XmlMapper xmlMapper;

	@Autowired
	@Qualifier("yamlMapper")
	private YAMLMapper yamlMapper;

	private File exportDir;

	@Before
	public void before() {
		exportDir = new File(System.getProperty("user.dir"), "export/beerxml");
		exportDir.mkdirs();
	}

	public File readFile(String filename) {
		return new File(getClass().getResource("/beerxml/" + filename).getFile());
	}

	@Test
	public void exportBeer1AsXml() throws IOException {

		List<BeerXmlRecipe> recipes = xmlMapper.readValue(readFile("beer1.xml"), new TypeReference<List<BeerXmlRecipe>>() {});
		assertNotNull("Recipes cannot be null", recipes);
		BeerXmlRecipe recipe = recipes.get(0);

		File exportFile = new File(exportDir, "beer1.xml");

		xmlMapper.writeValue(exportFile, recipe);

		assertTrue("Export must exist", exportFile.exists());
	}

	@Test
	public void exportBeer1AsJson() throws IOException {

		List<BeerXmlRecipe> recipes = xmlMapper.readValue(readFile("beer1.xml"), new TypeReference<List<BeerXmlRecipe>>() {
		});
		assertNotNull("Recipes cannot be null", recipes);
		BeerXmlRecipe recipe = recipes.get(0);

		File exportFile = new File(exportDir, "beer1.json");

		jsonMapper.writerWithDefaultPrettyPrinter().writeValue(exportFile, recipe);

		assertTrue("Export must exist", exportFile.exists());
	}

	@Test
	public void exportBeer1AsYaml() throws IOException {

		List<BeerXmlRecipe> recipes = xmlMapper.readValue(readFile("beer1.xml"), new TypeReference<List<BeerXmlRecipe>>() {});
		assertNotNull("Recipes cannot be null", recipes);
		BeerXmlRecipe recipe = recipes.get(0);

		File exportFile = new File(exportDir, "beer1.yml");

		yamlMapper.writeValue(exportFile, recipe);

		assertTrue("Export must exist", exportFile.exists());
	}

	@Test
	public void exportBigDecimal() throws JsonProcessingException {
		BigDecimal d = new BigDecimal(50.5000234);
		String s = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(d);
		assertEquals("String should be 50.50", "50.5000", s);
	}

    /*@Test
    public void exportTest() throws IOException {

		File exportDir = new File(System.getProperty("user.dir"), "export");
		exportDir.mkdirs();

		File file = new File(exportDir, "export.xml");

		Recipe r = new Recipe();
		r.setName("Hopsy Daisy");

		xmlMapper.writeValue(file, r);

		assertTrue("Export must exist", file.exists());
    }

	@Test
	 public void exportTest2() throws IOException {

		File exportDir = new File(System.getProperty("user.dir"), "export");
		exportDir.mkdirs();

		File file = new File(exportDir, "export2.xml");

		Recipes recipes = new Recipes();

		Recipe r = new Recipe();
		recipes.getRecipes().add(r);
		r.setName("Hopsy Daisy");

		xmlMapper.writeValue(file, recipes);

		assertTrue("Export must exist", file.exists());
	}

	@Test
	public void exportTest3() throws IOException {

		File exportDir = new File(System.getProperty("user.dir"), "export");
		exportDir.mkdirs();

		File file = new File(exportDir, "export3.xml");

		List<Recipe> recipes = new ArrayList<>();

		Recipe r = new Recipe();
		recipes.add(r);
		r.setName("Hopsy Daisy");

		xmlMapper.writeValue(file, recipes);

		assertTrue("Export must exist", file.exists());
	}*/
}
