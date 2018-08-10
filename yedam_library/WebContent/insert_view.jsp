<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"/>

	<form action="insert.do" method="post">
		<div>
			도서명 <input type="text" name="bName"><br>
			저자 <input type="text" name="writer"><br>
			출판사 <input type="text" name="publisher"><br>
			설명 <input type="text" name="comments"><br>
			위치 <input type="text" name="location"><br>
			<input type="submit" value="등록하기">
			<input type="reset" value="다시 작성">
		</div>
	</form>
	
<jsp:include page="footer.jsp"/>