package ch26.Lambda3;

interface Printable {  // 추상 메소드가 하나인 인터페이스
	void print(String s);
}

class Lambda3 {
	public static void main(String[] args) {
		Printable prn = (s) -> { System.out.println(s); };
		prn.print("What is Lambda?");
	}
}