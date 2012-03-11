package se.bettercode.reversephonelookup;

public enum Constant {
	REPLACEMENT_STRING("%s1");

	private final String value;
		
	Constant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
