package ch17.TryWithResource;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class TryWithResource {
	public static void main(String[] args) {
		Path file = Paths.get("D:\\java\\Simple.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(file)) {
			writer.write('A');
			writer.write('Z');
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}