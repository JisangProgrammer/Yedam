<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="../header.jsp"/>


<div class="container">

	<div class="row">
		<div class="col-sm-2">작성자</div>
		<div class="col-sm-10"><h5>${board.name}</h5></div>
	</div>
	
	<div class="row">
		<div class="col-sm-2">이메일</div>
		<div class="col-sm-10"><h5>${board.email}</h5></div>
	</div>
	
	<div class="row">
		<div class="col-sm-2">작성일</div>
		<div class="col-sm-10"><h5>${board.write_date}</h5></div>
	</div>
	<div class="row">
		<div class="col-sm-2">조회수</div>
		<div class="col-sm-10"><h5>${board.read_count}</h5></div>
	</div>
	
	<div class="row">
		<div class="col-sm-2">제목</div>
		<div class="col-sm-10"><h5>${board.title}</h5></div>
	</div>
	
	<div class="row">
		<div class="col-sm-2">내용</div>
		<div class="col-sm-10"><h5>${board.content}</h5></div>
	</div>
	
	<div class="float-left">
		<button type="button" class="btn btn-success" name="write" onclick="location.href='BoardServlet?command=board_list'">목록</button>&nbsp;&nbsp;
	</div>
	
	<div class="float-right">
		<button type="submit" class="btn btn-danger" onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'delete')">삭제</button>
		<button type="submit" class="btn btn-success" onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'update')">수정</button>
		<button type="button" class="btn btn-success" name="write" data-toggle="modal" data-target="#modal1">글쓰기</button>
	</div>
</div>
	
	<!-- 모달 영역 -->	
	<div class="modal fade" id="modal1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg" role="document">
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
		        	<div class="form-group row">
			            <label for="name" class="col-sm-2 col-form-label">작성자</label>
			            <div class="col-sm-10">
			            	<input type="text" class="form-control" name="name">
			            </div>
					</div>
					<div class="form-group row">
			            <label for="pass" class="col-sm-2 col-form-label">비밀번호</label>
			            <div class="col-sm-10">
			            	<input type="text" class="form-control" name="pass">
			            </div>
					</div>
					<div class="form-group row">
			            <label for="email" class="col-sm-2 col-form-label">이메일</label>
			            <div class="col-sm-10">
			            	<input type="text" class="form-control" name="email">
			            </div>
					</div>
					<div class="form-group row">
		            	<label for="title" class="col-sm-2 col-form-label">제목</label>
		            	<div class="col-sm-10">
		            		<input type="text" class="form-control" name="title">
		            	</div>
					</div>
					<div class="form-group row">
						<label for="content" class="col-sm-2 col-form-label">내용</label>
						<div class="col-sm-10">					
		            		<textarea class="form-control" name="content" rows="12"></textarea>
	            		</div>
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
	

<jsp:include page="../footer.jsp"/>