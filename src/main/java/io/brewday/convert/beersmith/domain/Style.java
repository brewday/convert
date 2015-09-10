package io.brewday.convert.beersmith.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlType(name = "F_R_STYLE")
public class Style {

	@XmlElement(name = "F_S_NAME")
	private String name; //American IPA

	@XmlElement(name = "F_S_CATEGORY")
	private String category; //India Pale Ale (IPA)

	@XmlElement(name = "F_S_GUIDE")
	private String guide; //BJCP 2008

	@XmlElement(name = "F_S_LETTER")
	private String letter; //2

	@XmlElement(name = "F_S_NUMBER")
	private int number; //14

	@XmlElement(name = "F_S_TYPE")
	private int type; //0

	@XmlElement(name = "F_S_MIN_OG")
	private BigDecimal minOg; //1.0560000

	@XmlElement(name = "F_S_MAX_OG")
	private BigDecimal maxOg; //1.0750000

	@XmlElement(name = "F_S_MIN_FG")
	private BigDecimal minFg; //1.0100000

	@XmlElement(name = "F_S_MAX_FG")
	private BigDecimal maxFg; //1.0180000

	@XmlElement(name = "F_S_MIN_IBU")
	private BigDecimal minIbu; //40.0000000

	@XmlElement(name = "F_S_MAX_IBU")
	private BigDecimal maxIbu; //70.0000000

	@XmlElement(name = "F_S_MIN_CARB")
	private BigDecimal minCarb; //2.2000000

	@XmlElement(name = "F_S_MAX_CARB")
	private BigDecimal maxCarb; //2.7000000

	@XmlElement(name = "F_S_MIN_COLOR")
	private BigDecimal minColor; //6.0000000

	@XmlElement(name = "F_S_MAX_COLOR")
	private BigDecimal maxColor; //15.0000000

	@XmlElement(name = "F_S_MIN_ABV")
	private BigDecimal minAbv; //5.5000000

	@XmlElement(name = "F_S_MAX_ABV")
	private BigDecimal maxAbv; //7.5000000

	@XmlElement(name = "F_S_DESCRIPTION")
	private String description; //A decidedly hoppy and bitter, moderately strong American pale ale. An American version of the historical English style, brewed using American ingredients and attitude.

	@XmlElement(name = "F_S_PROFILE")
	private String profile; //Aroma: A prominent to intense hop aroma with a citrusy, floral, perfume-like, resinous, piney, and/or fruity character derived from American hops. Many versions are dry hopped and can have an additional grassy aroma, although this is not required. Some clean malty sweetness may be found in the background, but should be at a lower level than in English examples. Fruitiness, either from esters or hops, may also be detected in some versions, although a neutral fermentation character is also acceptable. Some alcohol may be noted.		Appearance: Color ranges from medium gold to medium reddish copper; some versions can have an orange-ish tint. Should be clear, although unfiltered dry-hopped versions may be a bit hazy. Good head stand with white to off-white color should persist.	Flavor: Hop flavor is medium to high, and should reflect an American hop character with citrusy, floral, resinous, piney or fruity aspects. Medium-high to very high hop bitterness, although the malt backbone will support the strong hop character and provide the best balance. Malt flavor should be low to medium, and is generally clean and malty sweet although some caramel or toasty flavors are acceptable at low levels. No diacetyl. Low fruitiness is acceptable but not required. The bitterness may linger into the aftertaste but should not be harsh. Medium-dry to dry finish. Some clean alcohol flavor can be noted in stronger versions. Oak is inappropriate in this style. May be slightly sulfury, but most examples do not exhibit this character.		Mouthfeel: Smooth, medium-light to medium-bodied mouthfeel without hop-derived astringency, although moderate to medium-high carbonation can combine to render an overall dry sensation in the presence of malt sweetness. Some smooth alcohol warming can and should be sensed in stronger (but not all) versions. Body is generally less than in English counterparts.

	@XmlElement(name = "F_S_INGREDIENTS")
	private String ingredients; //Pale ale malt (well-modified and suitable for single-temperature infusion mashing); American hops; American yeast that can give a clean or slightly fruity profile. Generally all-malt, but mashed at lower temperatures for high attenuation. Water character varies from soft to moderately sulfate. Versions with a noticeable Rye character (&ldquo;RyePA&rdquo;) should be entered in the Specialty category.

	@XmlElement(name = "F_S_EXAMPLES")
	private String examples; //Bell&rsquo;s Two-Hearted Ale, AleSmith IPA, Russian River Blind Pig IPA, Stone IPA, Three Floyds Alpha King, Great Divide Titan IPA, Bear Republic Racer 5 IPA, Victory Hop Devil, Sierra Nevada Celebration Ale, Anderson Valley Hop Ottin&rsquo;, Dogfish Head 60 Minute IPA, Founder&rsquo;s Centennial IPA, Anchor Liberty Ale, Harpoon IPA, Avery IPA

	@XmlElement(name = "F_S_WEB_LINK")
	private String webLink; //http://www.bjcp.org

	//<editor-fold desc="Getters and Setters">
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGuide() {
		return guide;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public BigDecimal getMinOg() {
		return minOg;
	}

	public void setMinOg(BigDecimal minOg) {
		this.minOg = minOg;
	}

	public BigDecimal getMaxOg() {
		return maxOg;
	}

	public void setMaxOg(BigDecimal maxOg) {
		this.maxOg = maxOg;
	}

	public BigDecimal getMinFg() {
		return minFg;
	}

	public void setMinFg(BigDecimal minFg) {
		this.minFg = minFg;
	}

	public BigDecimal getMaxFg() {
		return maxFg;
	}

	public void setMaxFg(BigDecimal maxFg) {
		this.maxFg = maxFg;
	}

	public BigDecimal getMinIbu() {
		return minIbu;
	}

	public void setMinIbu(BigDecimal minIbu) {
		this.minIbu = minIbu;
	}

	public BigDecimal getMaxIbu() {
		return maxIbu;
	}

	public void setMaxIbu(BigDecimal maxIbu) {
		this.maxIbu = maxIbu;
	}

	public BigDecimal getMinCarb() {
		return minCarb;
	}

	public void setMinCarb(BigDecimal minCarb) {
		this.minCarb = minCarb;
	}

	public BigDecimal getMaxCarb() {
		return maxCarb;
	}

	public void setMaxCarb(BigDecimal maxCarb) {
		this.maxCarb = maxCarb;
	}

	public BigDecimal getMinColor() {
		return minColor;
	}

	public void setMinColor(BigDecimal minColor) {
		this.minColor = minColor;
	}

	public BigDecimal getMaxColor() {
		return maxColor;
	}

	public void setMaxColor(BigDecimal maxColor) {
		this.maxColor = maxColor;
	}

	public BigDecimal getMinAbv() {
		return minAbv;
	}

	public void setMinAbv(BigDecimal minAbv) {
		this.minAbv = minAbv;
	}

	public BigDecimal getMaxAbv() {
		return maxAbv;
	}

	public void setMaxAbv(BigDecimal maxAbv) {
		this.maxAbv = maxAbv;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getExamples() {
		return examples;
	}

	public void setExamples(String examples) {
		this.examples = examples;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}
	//</editor-fold>
}
