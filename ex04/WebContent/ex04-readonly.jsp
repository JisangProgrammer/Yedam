<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>글 입력하기</title>
</head>
<body>
<!-- 입력, 조회, 수정 -->

	<div class="container">
	<p></p>
<!-- 	<form method="post" action="ex04-readonly.jsp"> -->
		<table class="table">
			<tr>
				<th class="table-primary text-center">작성자</th>
				<td>
					<!-- <input class="form-control" type="text" name="name" placeholder="이름을 입력하세요." readonly> -->
					<input class="form-control" type="text" value="<%= request.getParameter("name") %>" readonly>
				</td>
				<th class="table-primary text-center">작성일자</th>
				<td>
					<input class="form-control" type="date" value="<%= request.getParameter("date") %>" readonly>
				</td>
			</tr>
			<tr>
				<th class="table-primary text-center">제목</th>
				<td colspan="3">
					<input class="form-control" type="text" value="<%= request.getParameter("title") %>" readonly>
				</td>
			</tr>
			<tr>
				<th colspan="4">
					<textarea class="form-control" rows="4" placeholder="<%= request.getParameter("content") %>" style="width: 100%;" readonly></textarea>
				</th>
			</tr>
			<tr>
				<td colspan="4" style="text-align: right;">
					<input class="btn btn-primary" type="submit" value="등록">
					<input class="btn btn-primary" type="reset" value="취소">
				</td>
			</tr>
		</table>
		

<!-- 	</form> -->
	</div>
</body>
</html>