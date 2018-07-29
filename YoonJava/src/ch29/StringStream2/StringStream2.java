package ch29.StringStream2;

import java.util.Arrays;

class StringStream2 {
	public static void main(String[] args) {
		String[] names = {"HONG", "LEE", "GWON"};
		Arrays.stream(names).forEach(s -> System.out.println(s));
	}
}
