<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../header.jsp"/>


<script>
$(function() {
	$('#btn_write_enter').click(function() {
		var dbText = $('#ta_content').html();
		dbText = dbText.replace(/<br>/g, '\n');
	});
});
</script>

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
					<td><a href="BoardServlet?command=board_view&num=${board.num}" class="text-secondary">${board.title}</a></td>
					<td>${board.name}</td>
					<td>${board.write_date}</td>
					<td>${board.read_count}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
		
	
	<!-- 글쓰기 버튼 -->
	<button type="button" class="btn btn-success float-right" name="write" data-toggle="modal" data-target="#modal1">글쓰기</button>
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
		            		<textarea class="form-control" name="content" id="ta_content" rows="12"></textarea>
		            	</div>
					</div>
				
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
			        <button type="submit" class="btn btn-success" id="btn_write_enter" onclick="return boardCheck()">등록하기</button>
				</div>
		</form>
			</div>
		</div>
	</div>
	
	<!-- /모달 영역 -->


<jsp:include page="../footer.jsp"/>