package S1029Net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class S3URLcoder {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//�����ض��ַ��������
		String encode=URLEncoder.encode("�����", "GBK");
		System.out.println("GBK�ı���Ϊ��"+encode);
		//�����ض��ַ��������
		String decode=URLDecoder.decode(encode, "GBK");
		System.out.println("GBK�Ľ���Ϊ��"+decode);
	}

}
