package se.brewday.convert.xmladapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BooleanStringAdapter extends XmlAdapter<String, Boolean> {

	@Override
	public Boolean unmarshal(String v) throws Exception {
		if (v == null) {
			return false;
		}
		v = v.toLowerCase();
		return "true".equals(v) || "yes".equals(v) || "1".equals(v);
	}

	@Override
	public String marshal(Boolean v) throws Exception {
		if (v == null) {
			return "false";
		}
		return v ? "true" : "false";
	}
}
