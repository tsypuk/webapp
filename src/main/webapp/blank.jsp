<%--
  Created
  Date: 4/23/16
  Time: 9:21 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp" %>
directives
declaration
scriptlet
expression
<BR>
<%
    final String hello = "Hello message";
    int i = 100_000;
    String goodbuy = "Good buy " + hello;
%>
<%= goodbuy%>
<%!
    public long addFive(long number) {
        return number + 5L;
    }

    public class MyInnerClass {

    }

    MyInnerClass myInnerClass = new MyInnerClass();
%>
<%=
addFive(100)
%>

<%@include file="footer.jsp" %>
</body>
</html>
