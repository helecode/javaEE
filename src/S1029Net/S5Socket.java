package S1029Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class S5Socket {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",3453);
		InputStream is=s.getInputStream();
		Reader r=new InputStreamReader(is);
		Scanner input=new Scanner(r);
		input.useDelimiter("/");
		while(input.hasNext()){
			System.out.println("�ͻ��˴ӷ��������յ����ݣ�"+input.next());
		}
		r.close();
		is.close();
		s.close();
		
	}
}
