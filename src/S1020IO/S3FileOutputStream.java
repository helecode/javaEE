package S1020IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class S3FileOutputStream {

	public static void main(String[] args) throws IOException {
		File file=new File("C:/Users/lgm/Desktop/sss.txt");
		OutputStream os=new FileOutputStream(file,true);//ÿ��д�������׷�ӵ��ļ�����
		//����Ӧ�ļ������ڻ��Զ�����
		//д�����1:���ֽ�д��
		char c=' ';
		os.write((int)c);
		//д�����2:���ֽ�����д��
		String s="���� hellow orld";
		os.write(s.getBytes());
		os.close();
		

	}

}
