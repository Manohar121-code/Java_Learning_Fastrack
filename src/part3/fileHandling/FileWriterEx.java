package part3.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {
		String s = "Java is a platform independent language and it is robust";
		FileWriter fw = new FileWriter("D:\\test/fileExample.txt");
		
		fw.write(s);
		fw.close();
		
		System.out.println("Write operation is successful");
	}
}
