package S1020IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class S5OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		File file=new File("C:/Users/lgm/Desktop/sss.txt");
		OutputStream os=new FileOutputStream(file,true);
		Writer writer=new OutputStreamWriter(os);
		//һ����д�뵥���ַ�
		writer.write((int)'A');
		//һ����д��һ���ַ�����
		String s="�ڲ�OSPF�ǸɺͷǹǸ�";
		char c[]=s.toCharArray();
		writer.write(c);
		//һ����д��һ���ַ���
		String ss="д��һ���ַ���";
		writer.write(ss);
		writer.close();
		os.close();
		
		
	}
}
