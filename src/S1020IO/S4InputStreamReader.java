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
//		//1.�����ȡ�����ַ�
//		char c=' ';
//		int k=0;
//		while((k=reader.read())!=-1){
//			System.out.print((char)k);
//		}
//		System.out.println();
		//2.һ���Զ�ȡһ���ַ�����
//		char ca[]=new char[(int)file.length()];
//		reader.read(ca);
//		System.out.println(new String(ca));
//		reader.close();
//		is.close();
		System.out.println(file.length());
		Scanner input=new Scanner(reader);
		//input.useDelimiter("\n");//���÷ָ���
		while(input.hasNext()){
		System.out.println(input.next());
		} 
		reader.close();
		is.close();
	}


}
