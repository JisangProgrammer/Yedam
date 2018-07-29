package ch33.CopyFileFromFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class CopyFileFromFiles {
	public static void main(String[] args) throws IOException {
		Path src = Paths.get("D:\\java\\memo.txt");
		Path dst = Paths.get("D:\\java\\memo2.txt");
		
		// src가 지시하는 파일을 dst가 지시하는 위치와 이름으로 복사
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
	}
}
