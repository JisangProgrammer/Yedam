package ch18.ExceptionCase6;

import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionCase6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a? ");
			int n1 = kb.nextInt();  // int형 정수 입력
			System.out.print("a/b...b? ");
			int n2 = kb.nextInt();  // int형 정수 입력
			System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);  // 예외 발생 지점
		}
		catch(ArithmeticException | InputMismatchException e) {
			e.getMessage();
		}
		
		System.out.println("Good Bye~!");
	}
}