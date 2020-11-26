package S1031XML;


import java.io.IOException;
import java.util.*;

import javax.xml.parsers.*;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;


public class T02SAXDOM extends DefaultHandler{
	Stack t=new Stack();
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String ts=(String) t.peek();// //取出栈顶元素
		if(ts.equals("NO")){
			System.out.println(new String(ch,start,length));
		}
		if(ts.equals("ADDR")){
			System.out.println(new String(ch,start,length));
		}
	}
	public void startElement(String uri, String localName, String
			qName,Attributes attrs) {
			t.push(qName);  //进栈
			}
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		SAXParserFactory SAXpf=SAXParserFactory.newInstance();
		SAXParser SAXP=SAXpf.newSAXParser();
		T02SAXDOM tReader=new T02SAXDOM();
		SAXP.parse(new InputSource("xmldom.xml"), tReader);
		

	}

}
