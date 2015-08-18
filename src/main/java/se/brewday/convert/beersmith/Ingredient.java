package se.brewday.convert.beersmith;

import javax.xml.bind.annotation.XmlElement;
import java.time.LocalDate;

public abstract class Ingredient {

	@XmlElement(name = "_MOD_")
	private LocalDate modified;

	@XmlElement(name = "F_ORDER")
	private int order = 0;
}
