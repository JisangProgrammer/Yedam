<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="header.jsp"/>

<%
	response.sendRedirect("BoardServlet?command=board_list");
%>

<jsp:include page="footer.jsp"/>