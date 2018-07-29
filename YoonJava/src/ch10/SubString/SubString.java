package ch10.SubString;

class SubString {
	public static void main(String[] args) {
		String st1 = "abcdefg";
		
		String st2 = st1.substring(2);  // 인덱스 2 이후의 내용으로 이뤄진 문자열 반환
		System.out.println(st2);
		
		String st3 = st1.substring(2, 4);  // 인덱스 2 ~ 3에 위치한 내용의 문자열 반환
		System.out.println(st3);
	}
}
