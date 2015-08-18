package se.brewday.convert.beerxml;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import se.brewday.convert.ConvertApplication;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConvertApplication.class)
@WebAppConfiguration
public class BeerXmlExportTest {

    private XmlMapper xmlMapper = Jackson2ObjectMapperBuilder.xml().build();
	private ObjectMapper jsonMapper = Jackson2ObjectMapperBuilder.json().build();
	private ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
	private File exportDir;

	@Before
	public void before() {
		Jackson2ObjectMapperBuilder yamlMapperBuilder = new Jackson2ObjectMapperBuilder();
		yamlMapperBuilder.configure(yamlMapper);

		exportDir = new File(System.getProperty("user.dir"), "export/beerxml");
		exportDir.mkdirs();
	}

	public File readFile(String filename) {
		return new File(getClass().getResource("/beerxml/" + filename).getFile());
	}

	@Test
	public void exportBeer1AsXml() throws IOException {

		List<Recipe> recipes = xmlMapper.readValue(readFile("beer1.xml"), new TypeReference<List<Recipe>>() {});
		assertNotNull("Recipes cannot be null", recipes);
		Recipe recipe = recipes.get(0);

		File exportFile = new File(exportDir, "beer1.xml");

		xmlMapper.writeValue(exportFile, recipe);

		assertTrue("Export must exist", exportFile.exists());
	}

	@Test
	public void exportBeer1AsJson() throws IOException {

		List<Recipe> recipes = xmlMapper.readValue(readFile("beer1.xml"), new TypeReference<List<Recipe>>() {
		});
		assertNotNull("Recipes cannot be null", recipes);
		Recipe recipe = recipes.get(0);

		File exportFile = new File(exportDir, "beer1.json");

		jsonMapper.writeValue(exportFile, recipe);

		assertTrue("Export must exist", exportFile.exists());
	}

	@Test
	public void exportBeer1AsYaml() throws IOException {

		List<Recipe> recipes = xmlMapper.readValue(readFile("beer1.xml"), new TypeReference<List<Recipe>>() {});
		assertNotNull("Recipes cannot be null", recipes);
		Recipe recipe = recipes.get(0);

		File exportFile = new File(exportDir, "beer1.yml");

		yamlMapper.writeValue(exportFile, recipe);

		assertTrue("Export must exist", exportFile.exists());
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
