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
		OutputStream os=new FileOutputStream(file,true);//每次写入的内容追加到文件后面
		//若相应文件不存在会自动创建
		//写入操作1:按字节写入
		char c=' ';
		os.write((int)c);
		//写入操作2:按字节数组写入
		String s="中文 hellow orld";
		os.write(s.getBytes());
		os.close();
		

	}

}
