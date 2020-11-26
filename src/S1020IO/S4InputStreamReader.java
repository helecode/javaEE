package S1020IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class S4InputStreamReader {

	public static void main(String[] args) throws IOException {
		File file=new File("C:/Users/lgm/Desktop/sss.txt");
		InputStream is=new FileInputStream(file);
		Reader reader=new InputStreamReader(is);
//		//1.逐个读取单个字符
//		char c=' ';
//		int k=0;
//		while((k=reader.read())!=-1){
//			System.out.print((char)k);
//		}
//		System.out.println();
		//2.一次性读取一个字符数组
//		char ca[]=new char[(int)file.length()];
//		reader.read(ca);
//		System.out.println(new String(ca));
//		reader.close();
//		is.close();
		System.out.println(file.length());
		Scanner input=new Scanner(reader);
		//input.useDelimiter("\n");//设置分隔符
		while(input.hasNext()){
		System.out.println(input.next());
		} 
		reader.close();
		is.close();
	}


}
