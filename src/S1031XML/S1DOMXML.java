package S1031XML;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class S1DOMXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File f=new File("xmldom.xml");
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();//1.创建解析器工厂对象
		DocumentBuilder db=dbf.newDocumentBuilder();//2.由工厂解析器对象创建解析器对象
		Document d=db.parse(f);//3.由解析器对象对指定的xml文件进行解析，构建相应的DOM树，创建Document对象
		NodeList nl=d.getElementsByTagName("VALUE");//3.取得DOM树的节点值
		System.out.println(nl.getLength());
		for(int i=0;i<nl.getLength();i++){
			System.out.println(d.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());
			System.out.println(d.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
		}	
	}
}
