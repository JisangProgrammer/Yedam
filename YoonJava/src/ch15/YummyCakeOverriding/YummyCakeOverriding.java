package ch15.YummyCakeOverriding;

class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {  // Cake의 yummy 메소드를 오버라이딩
		System.out.println("Yummy Cheese Cake");
	}
}

class YummyCakeOverriding {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();

		c1.yummy();  // 오버라이딩한 CheeseCake의 yummy 메소드 호출됨
		c2.yummy();  // 오버라이딩한 CheeseCake의 yummy 메소드 호출됨
	}
}