<%--
  Created
  Date: 4/24/16
  Time: 9:41 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello User Application</title>
</head>
<body>
<form action="checkBoxesSubmit.jsp" method="POST">
    Select the fruits you like to eat:<br/>
    <input type="checkbox" name="fruit" value="Banana"/> Banana<br/>
    <input type="checkbox" name="fruit" value="Apple"/> Apple<br/>
    <input type="checkbox" name="fruit" value="Orange"/> Orange<br/>
    <input type="checkbox" name="fruit" value="Guava"/> Guava<br/>
    <input type="checkbox" name="fruit" value="Kiwi"/> Kiwi<br/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>

