<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--@elvariable id="contacts" type="java.util.Set<smartjava.Contact>"--%>
<!DOCTYPE html>
<html>
    <head>
        <title><fmt:message key="title.browser" /></title>
    </head>
    <body>
    <h2><fmt:message key="title.page" /></h2>
    <c:choose>
        <c:when test="${fn:length(contacts) == 0}">
            <i><fmt:message key="message.noContacts" /></i>
        </c:when>
        <c:otherwise>
            <c:forEach items="${contacts}" var="contact">
                <b>
                    <c:out value="${contact.lastName}, ${contact.firstName}" />
                </b><br />
                <c:out value="${contact.address}" /><br />
                <c:out value="${contact.phoneNumber}" /><br />
                <c:if test="${contact.birthday != null}">
                    <fmt:message key="label.birthday" />:
                    ${contact.birthday.month.getDisplayName(
                            'FULL', pageContext.response.locale
                        )}&nbsp;${contact.birthday.dayOfMonth}<br />
                </c:if>
                <fmt:message key="label.creationDate" />:
               <--TODO Here is some problem with date type conversion -->
                <%--<fmt:formatDate value="${contact.oldDateCreated}" type="both"--%>
                                <%--dateStyle="long" timeStyle="long" />--%>
                <br /><br />
            </c:forEach>
        </c:otherwise>
    </c:choose>

    DO not use jdbc connection direct in presentation layer but try it:
    <%--<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"--%>
                       <%--url="jdbc:mysql://localhost/mysql"--%>
                       <%--user="root"  password=""/>--%>

    <%--Trying to connect from JSP to mysql DB--%>
    <%--<sql:query var="result" sql="SELECT * from User" dataSource="jdbc:mysql://localhost/mysql"/>--%>

    <%--<table border="1" width="100%">--%>
        <%--<tr>--%>
            <%--<th>Host</th>--%>
            <%--<th>User</th>--%>
        <%--</tr>--%>
        <%--<c:forEach var="row" items="${result.rows}">--%>
            <%--<tr>--%>
                <%--<td><c:out value="${row.Hos}"/></td>--%>
                <%--<td><c:out value="${row.User}"/></td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</table>--%>
    </body>
</html>