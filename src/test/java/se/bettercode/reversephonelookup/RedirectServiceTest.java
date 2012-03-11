package se.bettercode.reversephonelookup;


import org.junit.Assert;
import org.junit.Test;

public class RedirectServiceTest {

	@Test
	public void testAll() {
		Assert.assertNotNull(RedirectService.getRedirectURL("45", "Svensson"));
		Assert.assertNotNull(RedirectService.getRedirectURL("46", "Svensson"));
		Assert.assertNotNull(RedirectService.getRedirectURL("47", "Svensson"));		
		Assert.assertNotNull(RedirectService.getRedirectURL("49", "Svensson"));		
		Assert.assertNotNull(RedirectService.getRedirectURL("-1", "Svensson"));		
	}
}
