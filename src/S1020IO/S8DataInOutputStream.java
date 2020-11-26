package S1020IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class S8DataInOutputStream {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lgm\\Pictures\\preview (2).jpg");
		InputStream is=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(is);
		byte b[]=new byte[(int)f.length()];
		dis.read(b);
		File file=new File("C:\\Users\\lgm\\Desktop\\preview.jpg");
		OutputStream os=new FileOutputStream(file);
		DataOutputStream dos=new DataOutputStream(os);
		dos.write(b);
		dis.close();
		dos.close();
		is.close();
		os.close();
	}
}
