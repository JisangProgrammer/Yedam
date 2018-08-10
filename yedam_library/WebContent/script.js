function reset_btn_event() {
	var message = confirm("다시 작성하시겠습니까?");
	if (message == true) {
		return true;
	} else {
		return false;
	}
};

function delete_btn_event(){
	var message = confirm("정말 삭제하시겠습니까?");
	if (message == true){
		alert("책 정보가 삭제되었습니다.");
		return true;
	} else {
		return false;
	}
};
