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
		//��ȡ����1
//		char c=' ';//�����ȡ�ַ�
//		int k=0;
//		while((k=is.read())!=-1){
//			System.out.print((char)k);
//		}
//		System.out.println();
		//��ȡ����2
//		byte b[]=new byte[(int)file.length()];
//		is.read(b);//���ļ����ݶ�ȡ�����������ֽ�����b��
//		String s=new String(b);
//		System.out.println("ss:"+s);
//		System.out.println();
		//��ȡ����3
		System.out.println("ʣ���ֽ���:"+is.available());
		System.out.println("���ȣ�"+file.length());
		Scanner input=new Scanner(is);
		input.useDelimiter("b");
		while(input.hasNext()){
			System.out.println(input.next());
			System.out.println("����:"+is.available());
		}
	}
}
