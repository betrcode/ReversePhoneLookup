<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="se.bettercode.reversephonelookup.Country" %>

<html>
<head>
<title>Global Directory Search</title>
<link href="style.css" media="all" rel="stylesheet" type="text/css" />
<link href="stylish.css" media="all" rel="stylesheet" type="text/css" />
<!--[if !IE 7]><style type="text/css">#wrap {display:table;height:100%}</style><![endif]-->
</head>
<body>

<div id="wrap">

	<div id="main">
	<div id="header">
	<h1>Global Directory Search</h1>
	</div>
	<p/>
	<div>Using national directory services worldwide! For your convenience.</div>
	<p/>
	<br/>
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
	  <input type="text" name="phonenumber" value="Svensson" />
	  <input type="submit" value="Lookup" />
	  </div>
    </form>


	</div>

</div>

<div id="footer">
	<div style="float:left;">
	<footer>
		<p>By: Max Wenzin at <a href="http://www.bettercode.se">Better Code AB</a></p>
		<p><time pubdate datetime="2012-03-11"></time></p>
	</footer>
    </div>		
	<div style="float:right;">
    <h3>Currently supported countries</h3>
    <ul>
		<% 
		for (Country c : Country.values()) {
			%>
			<li><%= c.getName() %>, <a href="<%= c.getBaseUrl() %>"><%= c.getBaseUrl() %></a></li>
			<%			
		}
		%>
    </ul>
    </div>		
</div>  
  



</body>
</html>