<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"/>


<div class="container">
	<form action="modify.do" method="post">
		<input type="hidden" name="bId" value="${content_view.bId}">
		
		<div class="form-group row mt-4">
			<label for="bId" class="col-sm-2 col-form-label">번호</label>
			<div class="col-sm-10">
				<input type="text" name="bId" id="bId" class="form-control" value="${content_view.bId}" disabled>
			</div>
		</div>
		<div class="form-group row">
			<label for="location" class="col-sm-2 col-form-label">위치</label>
			<div class="col-sm-10">
				<input type="text" name="location" id="location" class="form-control" value="${content_view.location}">
			</div>
		</div>
		<div class="form-group row">
			<label for="writer" class="col-sm-2 col-form-label">저자</label>
			<div class="col-sm-10">
				<input type="text" name="writer" id="writer" class="form-control" value="${content_view.writer}" required>
			</div>
		</div>
		<div class="form-group row">
			<label for="bName" class="col-sm-2 col-form-label">도서명</label>
			<div class="col-sm-10">
				<input type="text" name="bName" id="bName" class="form-control" value="${content_view.bName}" required>
			</div>
		</div>
		<div class="form-group row">
			<label for="publisher" class="col-sm-2 col-form-label">출판사</label>
			<div class="col-sm-10">
				<input type="text" name="publisher" id="publisher" class="form-control" value="${content_view.publisher}" required>
			</div>
		</div>
		<div class="form-group row">
			<label for="comments" class="col-sm-2 col-form-label">설명</label>
			<div class="col-sm-10">
				<input type="text" name="comments" id="comments" class="form-control" value="${content_view.comments}">
			</div>
		</div>
		<div class="form-group row d-flex mt-5">	
      		<a href="list.do" class="btn btn-secondary mr-auto" role="button" aria-pressed="true">목록</a>
      		<a href="delete.do?bId=${content_view.bId}" class="btn btn-danger" role="button" aria-pressed="true" onclick="return delete_btn_event();">삭제하기</a>
      		<button type="submit" class="btn btn-primary ml-2">수정하기</button>
		</div>
	</form>
</div>


<jsp:include page="footer.jsp"/>