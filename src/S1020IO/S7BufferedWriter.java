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
		//1.д�뵥���ַ�
		bufferedWriter.write((int)'F');
		//2.д���ַ�����
		String sa="��ƿ���sss����������";
		bufferedWriter.write(sa.toCharArray());
		//3.д���ַ���
		bufferedWriter.write("ͨ�����������д���ַ���");
		bufferedWriter.close();
		writer.close();
		os.close();
	}

}
