<%--
  Created
  Date: 4/24/16
  Time: 10:04 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello User Application</title>
</head>
<body>
settingOne: <%= application.getInitParameter("mySetting1") %>,
settingTwo: <%= application.getInitParameter("mySetting2") %>
</body>
</html>