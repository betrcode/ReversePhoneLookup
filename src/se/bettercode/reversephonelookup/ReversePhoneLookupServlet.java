package se.bettercode.reversephonelookup;

import java.io.IOException;
import javax.servlet.http.*;
import java.util.logging.Logger;

@SuppressWarnings("serial")
public class ReversePhoneLookupServlet extends HttpServlet {
    private static final Logger log = Logger.getLogger(ReversePhoneLookupServlet.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world!");
	}
	
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {
        String countryid = req.getParameter("countryid");
        String phonenumber = req.getParameter("phonenumber");
        
        log.info("CountryId: " + countryid + "Search: " + phonenumber);
        
    	resp.sendRedirect(getRedirectURL(countryid, phonenumber));        	
        
    }	
    
    public String getRedirectURL(String countryId, String search) {
    	return Country.getById(countryId).getUrl().replace(Constant.REPLACEMENT_STRING.getValue(), search);
    	
    }
}
