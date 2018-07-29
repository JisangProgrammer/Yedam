package ch15.YummyCakeSize;

class Cake {
	public int size;  // cake size
	
	public Cake(int sz) {
		size = sz;
	}
	public void showCakeSize() {
		System.out.println("Bread Ounces: " + size);
	}
}

class CheeseCake extends Cake {
	public int size;  // cheese cake size
	
	public CheeseCake(int sz1, int sz2) {
		super(sz1);
		size = sz2;
	}
	public void showCakeSize() {
		// super.size는 상위 클래스의 멤버 size를 의미함
		System.out.println("Bread Ounces: " + super.size);
		
		// size는 이 클래스 CheeseCake의 멤버 size를 의미함
		System.out.println("Cheese Cake Ounces: " + size);
	}
}

class YummyCakeSize {
	public static void main(String[] args) {
		CheeseCake ca1 = new CheeseCake(5, 7);
		Cake ca2 = ca1;

		// ca2는 Cake형이므로 ca2.size는 Cake의 멤버 size를 의미함
		System.out.println("Bread Ounces: " + ca2.size);
		
		// ca1은 CheeseCake형이므로 ca1.size는 CheeseCake의 멤버 size를 의미함
		System.out.println("Cheese Cake Ounces: " + ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();
	}
}