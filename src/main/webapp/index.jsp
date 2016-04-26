<%@page contentType="text/html; charset=UTF-8" language="java" %>
<%!
    private static final String DEFAULT_USER_NAME = "Guest";
%>
<%
    String user = request.getParameter("user");
    if (user == null) {
        user = DEFAULT_USER_NAME;
    }
%>
test message
<html>
<head>
    <title>Hello User Application</title>
</head>
<body>
Hello, <%= user%> !<br>
<form action="index.jsp" method="POST">
    Enter your name:<br>
    <input type="text" name="user"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>