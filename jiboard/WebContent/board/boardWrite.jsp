<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<!-- 모달 영역 -->	

	<div class="modal-header">
		<h5 class="modal-title" id="Modal1Label">글쓰기</h5>
		<button type="button" class="close" data-dismiss="modal" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
	</div>
	<form name="frm" method="post" action="BoardServlet">
	<div class="modal-body">
       	<div class="form-group row">
            <label for="name" class="col-sm-2 col-form-label">작성자</label>
            <div class="col-sm-10">
            	<input type="text" class="form-control" id="name">
            </div>
		</div>
		<div class="form-group row">
            <label for="pass" class="col-sm-2 col-form-label">비밀번호</label>
            <div class="col-sm-10">
            	<input type="text" class="form-control" id="pass">
            </div>
		</div>
		<div class="form-group row">
            <label for="email" class="col-sm-2 col-form-label">이메일</label>
            <div class="col-sm-10">
            	<input type="text" class="form-control" id="email">
            </div>
		</div>
		<div class="form-group row">
           	<label for="title" class="col-sm-2 col-form-label">제목</label>
           	<div class="col-sm-10">
           		<input type="text" class="form-control" id="title">
           	</div>
		</div>
		<div class="form-group row">
			<label for="content" class="col-sm-2 col-form-label">내용</label>
           	<div class="col-sm-10">
           		<textarea class="form-control" id="content" rows="12"></textarea>
       		</div>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
        <button type="submit" class="btn btn-success" onclick="return boardCheck()">등록하기</button>
	</div>
	</form>

		<!-- /모달 영역 -->
</body>
</html>