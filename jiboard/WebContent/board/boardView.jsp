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


	<div class="row">
		<div class="col-12 shadow-sm rounded">
			<div class="row">
				작성자
			</div>
			<div class="row">
				<h4>${board.name}</h4>
			</div>
			<div class="row">
				이메일
			</div>
			<div class="row">
				<h4>${board.email}</h4>
			</div>
			<div class="row">
				작성일
			</div>
			<div class="row">
				<h4>${board.write_date}</h4>
			</div>
			<div class="row">
				조회수
			</div>
			<div class="row">
				<h4>${board.read_count}</h4>
			</div>
			<div class="row">
				제목
			</div>
			<div class="row">
				<h4>${board.title}</h4>
			</div>	
			<div class="row">
				내용
			</div>
			<div class="row">
				<h4>${board.content}</h4>
			</div>
		
		</div>
	</div>
	
	<div class="row">
		<button type="button" class="btn btn-success float-right" name="write" onclick="location.href='BoardServlet?command=board_list'">목록</button>&nbsp;&nbsp;
		<button type="submit" class="btn btn-success" onclick="location.href='BoardServlet?command=board_write_form'">글쓰기</button>
		&nbsp;&nbsp;
		<button type="submit" class="btn btn-success" onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'update')">수정</button>
		&nbsp;&nbsp;
		<button type="submit" class="btn btn-success" onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'delete')">삭제</button>
	</div>
				
	
</div>


	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>