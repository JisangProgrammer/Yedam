<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"/>

<div class="container">
	<table class="table table-hover mt-4">
		<thead class="thead-light">
			<tr>
				<th scope="col">번호</th>
				<th scope="col">도서명</th>
				<th scope="col">저자</th>
				<th scope="col">출판사</th>
				<th scope="col">위치</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.bId}</td>
				<td><a href="content_view.do?bId=${dto.bId}">${dto.bName}</a></td>
				<td>${dto.writer}</td>
				<td>${dto.publisher}</td>
				<td>${dto.location}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	<form action="insert_view.do" method="post">
		<div class="form-group row d-flex mt-5">	
      		<button type="submit" class="btn btn-primary ml-auto">도서 등록</button>
		</div>
	</form>
</div>

<jsp:include page="footer.jsp"/>