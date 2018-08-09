<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="../header.jsp"/>


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


<jsp:include page="../footer.jsp"/>