<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="bootstrap-4.1.3-dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="style.css">
    <script type="text/javascript" src="script/board.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
	
	<!-- Google Web Font -->
	<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic" rel="stylesheet">
    
    <title>Jiboard</title>
    
</head>
<body>
<div class="container">


	<div class="row">
		<table class="table table-hover shadow-sm">
			<thead>
			<tr>
				<th scope="col">번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">작성일자</th>
				<th scope="col">조회수</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="board" items="${boardList}">
				<tr class="record">
					<td scope="row">${board.num}</td>
					<td><a href="BoardServlet?command=board_view&num=${board.num}">${board.title}</a></td>
					<td>${board.name}</td>
					<td>${board.write_date}</td>
					<td>${board.read_count}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
		
		
	<div>
	
	<!-- 글쓰기 버튼 -->
		<button type="button" class="btn btn-success float-right" name="write" data-toggle="modal" data-target="#modal1">글쓰기</button>
	
	<!-- 모달 영역 -->	
		<div class="modal fade" id="modal1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="Modal1Label">글쓰기</h5>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
			<form name="frm" method="post" action="BoardServlet">
				<input type="hidden" name="command" value="board_write">
					<div class="modal-body">
			        	<div class="form-group">
				            <label for="name" class="col-form-label">작성자 :</label>
				            <input type="text" class="form-control" name="name">
						</div>
						<div class="form-group">
				            <label for="pass" class="col-form-label">비밀번호 :</label>
				            <input type="text" class="form-control" name="pass">
						</div>
						<div class="form-group">
				            <label for="email" class="col-form-label">이메일 :</label>
				            <input type="text" class="form-control" name="email">
						</div>
						<div class="form-group">
			            	<label for="title" class="col-form-label">제목 :</label>
			            	<input type="text" class="form-control" name="title">
						</div>
						<div class="form-group">
							<label for="content" class="col-form-label">내용 :</label>
			            	<textarea class="form-control" name="content" rows="12"></textarea>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
				        <button type="submit" class="btn btn-success" onclick="return boardCheck()">등록하기</button>
					</div>
			</form>
				</div>
			</div>
		</div>
	</div>
		<!-- /모달 영역 -->
</div>


	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>