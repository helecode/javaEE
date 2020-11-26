package S1029Net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class S2URL {
	public static void main(String[] args) throws IOException {
		URL url=new URL("https","www.baidu.com","/index.html");
		InputStream is=url.openStream();
//		Scanner input=new Scanner(is);
//		input.useDelimiter("/");
//		while(input.hasNext()){
//			System.out.println(input.next());
//		}
		int a=0;
		
		while((a=is.read())!=-1){
			System.out.print((char)a);
		}
	}
}
