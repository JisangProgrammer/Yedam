package myTest;

import java.util.Scanner;

interface Printable {
	void print(String s);
}

interface Calculable {
	int add(int a, int b);
}

abstract class MyTest implements Printable, Calculable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printable p; Calculable c;
		String a, b, hap = null;
		int an, bn, sum = 0;

		System.out.println("두 숫자의 합을 구하는 프로그램입니다.");
		System.out.print("첫 번째 숫자를 입력하세요. : ");
		a = sc.nextLine();
		System.out.print("두 번째 숫자를 입력하세요. : ");
		b = sc.nextLine();
		
		p = s -> System.out.println(a+" 그리고 "+b+"의 합은");
		p.print(hap);


//		c = (an, bn) -> {
//			hap = an + bn;
//			System.out.println(sum);
//			return sum;
//		};
//		c.add(an, bn);
//		System.out.println("합계 : " + s);
	}
}		

//class MyTest {
//	public static void main(String[] args) {
//	
//		Calculable c = (a,b) -> a+b;
//		Printable p = (s) -> {
//			System.out.println(s);
//		};
//	
//		p.print(Integer.toString(c.add(10, 2)));
//		
//	}
//}