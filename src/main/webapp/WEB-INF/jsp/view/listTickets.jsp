<%@ page import="java.util.Map" %>
<%@ page import="smartjava.Ticket" %>
<%@include file="included.jsp"%>
<a href="<c:url value="/login?logout"/>">Logout</a>
<%
    @SuppressWarnings("unchecked")
    Map<Integer, Ticket> ticketDatabase =
            (Map<Integer, Ticket>) request.getAttribute("ticketDatabase");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Support</title>
</head>
<>
<h2>Tickets</h2>
<a href="<c:url value="/tickets">
            <c:param name="action" value="create" />
        </c:url>">Create Ticket</a><br/><br/>
<%
    if (ticketDatabase.size() == 0) {
%><i>There are no tickets in the system.</i><%
} else {
    for (int id : ticketDatabase.keySet()) {
        String idString = Integer.toString(id);
        Ticket ticket = ticketDatabase.get(id);
%>Ticket #<%= idString %>: <a href="<c:url value="/tickets">
                        <c:param name="action" value="view" />
                        <c:param name="ticketId" value="<%= idString %>" />
                    </c:url>"><%= ticket.getSubject() %>
</a> (customer:
<%= ticket.getCustomerName() %>)<br/><%
        }
    }
%>
<jsp:include page="included.jsp"/>
<c:forEach var="index" begin="0" end="10">
    Item:<c:out value="${index}"/><BR>
</c:forEach>

Load list of tickets from JSP:
<c:forTokens items="${ticketDatabase}" delims="," var="ticket">
    <c:out value="${ticket}"/><BR>
</c:forTokens>
</body>
</html>