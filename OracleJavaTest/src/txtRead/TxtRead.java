package txtRead;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class TxtRead {
	public static void main(String[] args) {
//		Path fp = Paths.get("D:\\java\\memo.txt");
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\java\\memo.txt"), "UTF-8"))) {
			String str;
			while(true) {
				str = br.readLine();
				if(str == null)
					break;
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
