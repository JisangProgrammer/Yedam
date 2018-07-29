package ch29.StringStream;

import java.util.Arrays;
import java.util.stream.Stream;

class StringStream {
	public static void main(String[] args) {
		String[] names = {"HONG", "LEE", "GWON"};
		Stream<String> stm = Arrays.stream(names);
		stm.forEach(s -> System.out.println(s));
	}
}