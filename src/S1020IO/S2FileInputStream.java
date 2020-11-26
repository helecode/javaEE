package S1020IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class S2FileInputStream {
	public static void main(String[] args) throws IOException {
		File file=new File("C:/Users/lgm/Desktop/sss.txt");
		InputStream is=new FileInputStream(file);
		//读取操作1
//		char c=' ';//保存读取字符
//		int k=0;
//		while((k=is.read())!=-1){
//			System.out.print((char)k);
//		}
//		System.out.println();
		//读取操作2
//		byte b[]=new byte[(int)file.length()];
//		is.read(b);//将文件内容读取出来并放入字节数组b中
//		String s=new String(b);
//		System.out.println("ss:"+s);
//		System.out.println();
		//读取操作3
		System.out.println("剩余字节数:"+is.available());
		System.out.println("长度："+file.length());
		Scanner input=new Scanner(is);
		input.useDelimiter("b");
		while(input.hasNext()){
			System.out.println(input.next());
			System.out.println("内容:"+is.available());
		}
	}
}
