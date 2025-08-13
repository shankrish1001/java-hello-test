<!-- webapp/index.jsp -->
<html>
	<head>
	<title>Shan test Jetty JSP</title>
	</head>
	<body>
	<h1>Hello, World from JSP on Jetty!</h1>
	<p>Time: <%= new java.util.Date() %></p>
	<p>By: <% out.print("Shan"); %> and Jetty</p>
	</body>
</html>