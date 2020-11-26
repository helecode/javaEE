package S1029Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class S7SocketThread1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input =new Scanner(System.in);
		Socket client=new Socket("localhost",1234);

		InputStream is=client.getInputStream();
		OutputStream os=client.getOutputStream();
		
		Reader r=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(r);//接收键盘数据
		PrintStream out=new PrintStream(os);//发送数据
		boolean f=true;
		while(f){
			System.out.println("输入信息：");
			String str=input.nextLine();
			out.println(str);//向服务器发送数据
			System.out.println("str:"+str);
			if("bye".equals(str)) {f=false;
									System.out.println("bye");}
			else {
				System.out.println("非bye");
				String echo=br.readLine();
				System.out.println(echo);
				
			}
		}
		br.close();
		client.close();

	}

}
