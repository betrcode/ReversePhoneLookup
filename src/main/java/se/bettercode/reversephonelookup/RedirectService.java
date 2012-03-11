package se.bettercode.reversephonelookup;

public class RedirectService {

    public static String getRedirectURL(String countryId, String search) {
    	return Country.getById(countryId).getUrl().replace(Constant.REPLACEMENT_STRING.getValue(), search);
    }
}
