<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../header.jsp"/>


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


<jsp:include page="../footer.jsp"/>