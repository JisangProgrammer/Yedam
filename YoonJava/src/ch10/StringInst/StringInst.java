package ch10.StringInst;

class StringInst {
	public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		String str1 = new String("Simple String");
		String str2 = "The Best String";
		
		System.out.println(str1);
		System.out.println(str1.length());  // length의 반환값을 인자로 전달
		System.out.println();  // 단순히 '개행'이 이뤄진다.
		
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();
		
		showString("Funny String");  // String 인스턴스 생성 후 메소드 호출
		
		System.out.println();
		int len = "123".length();
		System.out.println(len);
	}
}
