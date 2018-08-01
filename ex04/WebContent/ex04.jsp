<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>Insert title here</title>
</head>
<body>
<!-- 입력, 조회, 수정 -->
	<div class="container">
	<form>
		<table class="table">
			<tr>
				<th scope="col">작성자</th>
				<td scope="col"><input type="text" class="form-control"></td>
				<th scope="col">작성일자</th>
				<td scope="col"><input type="text" class="form-control" value="19881217"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="3">
					<input type="text" class="form-control">
				</td>
			</tr>
			<tr>
				<th colspan="4">
					<textarea rows="4" cols="50" style="width: 100%;">
					</textarea>
				</th>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>