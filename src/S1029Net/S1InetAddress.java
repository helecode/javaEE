package S1029Net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class S1InetAddress {

	public static void main(String[] args) throws IOException {
		InetAddress ia=InetAddress.getByName("www.baidu.com");
		String hostName=ia.getHostName();
		String hostAddress=ia.getHostAddress();
		System.out.println("百度的地址为："+hostName+"\t"+hostAddress);
		InetAddress ial=InetAddress.getLocalHost();
		String hostNamel=ial.getHostName();
		String hostAddressl=ial.getHostAddress();
		System.out.println("本机地址为："+hostNamel+"\t"+hostAddressl);
		boolean f=ial.isReachable(1000);
		System.out.println("本机是否可达："+f);
	}

}
