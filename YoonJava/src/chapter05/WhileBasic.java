package chapter05;

class WhileBasic {
	public static void main(String[] args) {  // num < 5 을 만족하면 반복 실행
		int num = 0;
		
		while(num < 5) {
			System.out.println("I like Java " + num);
			num++;
		}
	}
}
