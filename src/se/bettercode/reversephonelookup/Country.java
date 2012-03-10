package se.bettercode.reversephonelookup;

public enum Country {
	SWEDEN("46", "Sweden", "http://www.hitta.se/" + Constant.REPLACEMENT_STRING.getValue() + "/f%C3%B6retag_och_personer"), 
	DENMARK("45", "Denmark", "http://www.eniro.dk/query?search_word=" + Constant.REPLACEMENT_STRING.getValue() + "&geo_area=&what=all"), 
	NORWAY("47", "Norway", "http://www.gulesider.no/query?what=what&search_word=" + Constant.REPLACEMENT_STRING.getValue() + "&btn_all=Søk");
	
	private final String id;
	private final String name;
	private final String url;
	
	Country(String id, String name, String url) {
		this.id = id;
		this.name = name;
		this.url = url;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}
	
	public static Country getById(String id) {
		for (Country c : Country.values()) {
			if (id.equals(c.getId())) {
				return c;
			}
		}
		return SWEDEN; //default
	}

}
