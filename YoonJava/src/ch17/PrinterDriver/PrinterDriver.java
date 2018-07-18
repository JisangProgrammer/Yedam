package ch17.PrinterDriver;

interface Printable {  // MS가 정의하고 제공한 인터페이스
	public void print(String doc);
}

class SPrinterDriver implements Printable {  // 삼성이 정의한 클래스
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LGPrinterDriver implements Printable {  // LG가 정의한 클래스
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

public class PrinterDriver {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		// LG 프린터로 출력
		prn = new LGPrinterDriver();
		prn.print(myDoc);
	}
}
