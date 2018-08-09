<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"/>

<form action="modify.do" method="post">
	<table border="1" width="700px">

		<input type="hidden" name="bId" value="${content_view.bId}">
		<tr>
			<td> 번호 </td>
			<td> ${content_view.bId} </td>
		</tr>
		<tr>
			<td> 위치 </td>
			<td> <input type="text" name="location" value="${content_view.location}"></td>
		</tr>
		<tr>
			<td> 저자 </td>
			<td> <input type="text" name="writer" value="${content_view.writer}"></td>
		</tr>
		<tr>
			<td> 도서명 </td>
			<td> <input type="text" name="bName" value="${content_view.bName}"></td>
		</tr>
		<tr>
			<td> 출판사 </td>
			<td> <input type="text" name="publisher" value="${content_view.publisher}"></td>
		</tr>
		<tr>
			<td> 설명 </td>
			<td> <textarea rows="10" name="comments">${content_view.comments}</textarea></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" value="수정"> &nbsp;&nbsp;
				<a href="list.do">목록보기</a> &nbsp;&nbsp;
			</td>
		</tr>
		
	</table>
</form>

<jsp:include page="footer.jsp"/>