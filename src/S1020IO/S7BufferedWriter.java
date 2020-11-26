package S1020IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class S7BufferedWriter {

	public static void main(String[] args) throws IOException {
		File file=new File("C:/Users/lgm/Desktop/sss.txt");
		OutputStream os=new FileOutputStream(file);
		Writer writer=new OutputStreamWriter(os);
		BufferedWriter bufferedWriter=new BufferedWriter(writer);
		//1.写入单个字符
		bufferedWriter.write((int)'F');
		//2.写入字符数组
		String sa="设计开发sss安抚撒发生";
		bufferedWriter.write(sa.toCharArray());
		//3.写入字符串
		bufferedWriter.write("通过缓冲输出流写入字符串");
		bufferedWriter.close();
		writer.close();
		os.close();
	}

}
