package io.brewday.convert.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import io.brewday.convert.beersmith.domain.BeerSmithRecipe;
import io.brewday.convert.beerxml.domain.BeerXmlRecipe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

//@RequestMapping("/")
@Controller
public class ConvertController {

	private final static Logger log = LoggerFactory.getLogger(ConvertController.class);

	@Autowired
	private ObjectMapper jsonMapper;

	@Autowired
	@Qualifier("xmlMapper")
	private XmlMapper xmlMapper;

	@Autowired
	@Qualifier("yamlMapper")
	private YAMLMapper yamlMapper;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(path = "/", method = RequestMethod.POST)
	public String upload(Model model, @RequestParam("file") MultipartFile file) {

		log.info("Uploaded file with Content-Type: " + file.getContentType());

		BeerXmlRecipe beerXmlRecipe = null;
		BeerSmithRecipe beerSmithRecipe;
		String yamlRecipe;
		String htmlRecipe;

		// Is Beer XML
		if ("text/xml".equals(file.getContentType())) {
			try {
				List<BeerXmlRecipe> recipes = xmlMapper.readValue(file.getInputStream(), new TypeReference<List<BeerXmlRecipe>>() {});
				beerXmlRecipe = recipes.get(0);
			} catch (IndexOutOfBoundsException | IOException e) {
				e.printStackTrace();
			}
		}

		model.addAttribute("recipe", beerXmlRecipe);

		try {
			model.addAttribute("jsonRecipe", jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(beerXmlRecipe));
			model.addAttribute("yamlRecipe", yamlMapper.writeValueAsString(beerXmlRecipe));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return "index";
	}
}
