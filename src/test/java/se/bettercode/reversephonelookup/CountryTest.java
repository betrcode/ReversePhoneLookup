package se.bettercode.reversephonelookup;

import org.junit.Assert;
import org.junit.Test;


public class CountryTest {
	
	@Test
	public void testGetName() {
		Assert.assertEquals("Sweden", Country.SWEDEN.getName());
		Assert.assertEquals("Norway", Country.NORWAY.getName());
		Assert.assertEquals("Denmark", Country.DENMARK.getName());
		Assert.assertEquals("Germany", Country.GERMANY.getName());
	}
	
	@Test
	public void testGetById() {
		Assert.assertEquals(Country.SWEDEN, Country.getById("46"));
		Assert.assertEquals(Country.NORWAY, Country.getById("47"));
		Assert.assertEquals(Country.DENMARK, Country.getById("45"));
		Assert.assertEquals(Country.GERMANY, Country.getById("49"));
		Assert.assertEquals(Country.SWEDEN, Country.getById("")); //default
		Assert.assertEquals(Country.SWEDEN, Country.getById("-1")); //default
		
	}

}
