<%--
  Created
  Date: 4/24/16
  Time: 10:00 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String[] fruits = request.getParameterValues("fruit");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Hello User Application</title>
</head>
<body>
<h2>Your Selections</h2>
<%
    if (fruits == null) {
%>You did not select any fruits.<%
} else {
%>
<ul><%
    for (String fruit : fruits) {
        out.println("<li>" + fruit + "</li>");
    }
%></ul>
<%
    }
%>
</body>
</html>