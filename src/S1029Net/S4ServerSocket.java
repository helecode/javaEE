package S1029Net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class S4ServerSocket {
	public static void main(String[] args) throws IOException {
		Scanner input =new Scanner(System.in);
		ServerSocket sServer=new ServerSocket(3453);
		System.out.println("�����뷢�������ݣ�");
		String str=input.nextLine();
		System.out.println("�������ȴ��ͻ��˵�����");
		Socket sClient=sServer.accept();
		OutputStream os=sClient.getOutputStream();
		Writer w=new  OutputStreamWriter(os);
		w.write(str);
		
		w.close();
		os.close();
		sClient.close();
		sServer.close();
	}
}
