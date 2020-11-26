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
		//一次性写入单个字符
		writer.write((int)'A');
		//一次性写入一个字符数组
		String s="内部OSPF骨干和非骨干";
		char c[]=s.toCharArray();
		writer.write(c);
		//一次性写入一个字符串
		String ss="写入一个字符串";
		writer.write(ss);
		writer.close();
		os.close();
		
		
	}
}
