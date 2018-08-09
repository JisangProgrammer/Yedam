<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예담 도서 관리 시스템</title>
</head>
<body>

	<div>
	
		<form action="regist.do" method="post">
	도서명 <input type="text" name="bName"><br>
	저자 <input type="text" name="writer"><br>
	출판사 <input type="text" name="publisher"><br>
	설명 <input type="text" name="comments"><br>
	<input type="submit" value="등록하기">
	<input type="reset" value="다시 작성">
		</form>
	</div>

</body>
</html>