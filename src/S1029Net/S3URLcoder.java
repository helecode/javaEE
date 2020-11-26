package S1029Net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class S3URLcoder {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//按照特定字符编码编码
		String encode=URLEncoder.encode("黎冠猛", "GBK");
		System.out.println("GBK的编码为："+encode);
		//按照特定字符编码解码
		String decode=URLDecoder.decode(encode, "GBK");
		System.out.println("GBK的解码为："+decode);
	}

}
