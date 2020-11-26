package S1031XML;

import java.io.File;
import java.util.Iterator;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

public class T04DOM4J {

	public static void main(String[] args) throws DocumentException {
		// TODO Auto-generated method stub
		File f=new File("xmldom.xml");
		SAXReader reader=new SAXReader();//1.得到解析器
		Document d=reader.read(f);//2.通过解析器解析XML文件得到Document对象
		Element root=d.getRootElement();//3.得到DOM树的根节点
		Iterator<Element> it=root.elementIterator();//4.使用迭代器来遍历节点
		while(it.hasNext()){
			Element e=it.next();
			System.out.println(e.elementText("NO"));
			System.out.println(e.elementText("ADDR"));
		}
		
	}

}
