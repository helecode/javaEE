package S1020IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class S9Print {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("C:\\Users\\lgm\\Pictures\\preview (2).jpg");
		PrintStream ps=new PrintStream(f);
		ps.print("ÄãºÃ");
		ps.print(1212);
		ps.print(true);
		int id=100;
		String name="ÀîËÄ";
		double score=98.9;
		char c='A';
		ps.printf("%d%s%f%c", id,name,score,c);
		ps.close();
				
	}
}
