package S1020IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class S6BufferedReader {
	public static void main(String[] args) throws Exception {
		File file=new File("C:/Users/lgm/Desktop/sss.txt");
		InputStream is=new FileInputStream(file);
		Reader reader=new InputStreamReader(is);
		BufferedReader bufferedReader=new BufferedReader(reader);
//		//1.逐个个读取
//		int c;
//		while((c=bufferedReader.read())!=-1){
//			System.out.print((char)c);
//		}
//		//2.逐行读取
//		String s="";
//		while((s=bufferedReader.readLine())!=null){
//			System.out.println(s);
//		}
		//3.多个读取且不超数组长度
		char c[]=new char[(int)file.length()];
		bufferedReader.read(c);
		System.out.println(new String(c));
		bufferedReader.close();
		reader.close();
		is.close();
		
		
	}
}
