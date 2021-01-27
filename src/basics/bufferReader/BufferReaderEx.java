package basics.bufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		FileReader fr = new FileReader("D:\\test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println("enter something");
		
		String input = null;
		while ((input = br.readLine()) != null) {
			System.out.println(input);
		}
		
	}
}
