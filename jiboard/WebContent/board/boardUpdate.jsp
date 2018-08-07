<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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

	<form name="frm" method="post" action="BoardServlet">
		<input type="hidden" name="command" value="board_update">
		<input type="hidden" name="num" value="${board.num}">

		<div class="form-group row">
            <label for="name" class="col-sm-2 col-form-label">작성자</label>
            <div class="col-sm-10">
            	<input type="text" class="form-control" id="name" value="${board.name}">
            </div>
		</div>
		<div class="form-group row">
            <label for="pass" class="col-sm-2 col-form-label">비밀번호</label>
            <div class="col-sm-10">
            	<input type="password" class="form-control" id="pass" value="${board.pass}">
            </div>
		</div>
		<div class="form-group row">
            <label for="email" class="col-sm-2 col-form-label">이메일</label>
            <div class="col-sm-10">
            	<input type="text" class="form-control" id="email" value="${board.email}">
           	</div>
		</div>
		<div class="form-group row">
           	<label for="title" class="col-sm-2 col-form-label">제목</label>
			<div class="col-sm-10">
           		<input type="text" class="form-control" id="title" value="${board.title}">
           	</div>
		</div>
		<div class="form-group row">
			<label for="content" class="col-sm-2 col-form-label">내용</label>
			<div class="col-sm-10">
           		<textarea class="form-control" id="content" rows="12">${board.content}</textarea>
           	</div>
		</div>
	</form>
	
	<div class="row float-right">		
		<button type="button" class="btn btn-success" onclick="location.href='BoardServlet?command=board_list'">목록</button>&nbsp;&nbsp;
		<button type="reset" class="btn btn-success">다시 작성</button>&nbsp;&nbsp;
		<button type="button" class="btn btn-success" onclick="return boardCheck()">수정 완료</button>
	</div>
	
</div>


	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>