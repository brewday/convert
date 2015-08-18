package se.brewday.convert.xmladapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BooleanIntAdapter extends XmlAdapter<Integer, Boolean> {
	@Override
	public Boolean unmarshal(Integer v) throws Exception {
		return v != null && v == 1;
	}

	@Override
	public Integer marshal(Boolean v) throws Exception {
		if (v == null) {
			return 0;
		}
		return v ? 1 : 0;
	}
}
