<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="se.bettercode.reversephonelookup.Country" %>

<html>
  <body>

	<h1>Global Person Finder</h1>
	<div>Using national directory services worldwide! For your convenience.</div>
	
    <form action="/lookup" method="post">
      <div>
		<select name="countryid">
			<% 
			for (Country c : Country.values()) {
				%>
                <option value="<%= c.getId() %>"><%= c.getName() %></option>
				<%			
			}
			%>
		</select>
      </div>
      <div><input type="text" name="phonenumber" value="Svensson" /></div>
      <div><input type="submit" value="Lookup" /></div>
    </form>
    
    <h2>Currently supported countries</h2>
    <ul>
		<% 
		for (Country c : Country.values()) {
			%>
			<li><%= c.getName() %></li>
			<%			
		}
		%>
    </ul>

  </body>
</html>