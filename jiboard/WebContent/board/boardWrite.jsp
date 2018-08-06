<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
			<div class="modal-body">
	        	<div class="form-group">
		            <label for="name" class="col-form-label">작성자 :</label>
		            <input type="text" class="form-control" id="name">
				</div>
				<div class="form-group">
		            <label for="pass" class="col-form-label">비밀번호 :</label>
		            <input type="text" class="form-control" id="pass">
				</div>
				<div class="form-group">
		            <label for="email" class="col-form-label">이메일 :</label>
		            <input type="text" class="form-control" id="email">
				</div>
				<div class="form-group">
	            	<label for="title" class="col-form-label">제목 :</label>
	            	<input type="text" class="form-control" id="title">
				</div>
				<div class="form-group">
					<label for="content" class="col-form-label">내용 :</label>
	            	<textarea class="form-control" id="content" rows="12"></textarea>
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

		<!-- /모달 영역 -->
</body>
</html>