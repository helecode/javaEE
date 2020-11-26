package S1029Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class S6ServerSocketThread implements Runnable{
	public  static Socket client;
	
	
	public S6ServerSocketThread(Socket clinet) {
		this.client=clinet;
	}

	public void run() {
		try {
			OutputStream os=client.getOutputStream();
			InputStream is=client.getInputStream();

			Reader r=new InputStreamReader(is);
			PrintStream out=new PrintStream(os);
		
			BufferedReader br=new BufferedReader(r);
			boolean flag=true;
			while(flag){
				String s=br.readLine();
				System.out.println("读取到的信息："+s);
				if(s==null) flag=false;
				else{
					if("bye".equals(s)){System.out.println("bye");	flag=false;}
					else {System.out.println("非bye");	out.println("回复信息ok："+s);}
				}
				client.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {

		ServerSocket server=new ServerSocket(1234);
		boolean f=true;
		while(f){
			System.out.println("服务器正在运行，等待客户端的连接");
			client=server.accept();
			System.out.println("客户端已经连接");
			System.out.println("client:"+client);
			S6ServerSocketThread sst=new S6ServerSocketThread(client);
			Thread t=new Thread(sst);
			t.start();
		}
		server.close();

	}

	

}
