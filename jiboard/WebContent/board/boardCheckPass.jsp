<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../header.jsp"/>


	<h1>비밀번호 확인</h1>
	<form action="BoardServlet" name="frm" method="get">
		<input type="hidden" name="command" value="board_check_pass">
		<input type="hidden" name="num" value="${param.num}">
		<div>
			<h3>비밀번호</h3>
			<input type="password" name="pass" size="20">
		</div>
		<div><button type="submit" onclick="return passCheck()">확인</button></div>
		<div>${message}</div>
		
	</form>

	
<jsp:include page="../footer.jsp"/>