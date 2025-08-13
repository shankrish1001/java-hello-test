<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World JSP</title>
</head>
<body>
    <h1>Hello, World from JSP!</h1>
    <p>Time on server: <%= new java.util.Date() %></p>
    <p>By <% out.println("Shan"); %></p>
</body>
</html>