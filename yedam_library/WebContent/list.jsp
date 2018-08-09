<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>

	<table border="1" width="700px">
		<tr>
			<td>번호</td>
			<td>도서명</td>
			<td>저자</td>
			<td>출판사</td>
			<td>위치</td>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.bId}</td>
			<td><a href="content_view.do?bId=${dto.bId}">${dto.bName}</a></td>
			<td>${dto.writer}</td>
			<td>${dto.publisher}</td>
			<td>${dto.location}</td>
		</tr>
		</c:forEach>

	</table>
	
	<form action="regist_view.do" method="post">
		<input type="submit" value="도서 등록">
	</form>

<jsp:include page="footer.jsp"/>