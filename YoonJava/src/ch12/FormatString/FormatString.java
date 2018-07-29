package ch12.FormatString;

class FormatString {
	public static void main(String[] args) {
		int age = 31;
		double height = 171.9;
		String name = "HONG JISANG";
		
//		System.out.printf(" name: %s \n", name);
//		System.out.printf(" age: %d \n height: %e \n\n", age, height);
//		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
//		System.out.printf(" %g \n", 0.00014);
//		System.out.printf(" %g \n", 0.000014);
		
		System.out.format(" name: %s \n", name);
		System.out.format(" age: %d \n height: %e \n\n", age, height);
		System.out.format(" %d - %o - %x \n\n", 77, 77, 77);
		System.out.format(" %g \n", 0.00014);
		System.out.format(" %g \n", 0.000014);
	}
}