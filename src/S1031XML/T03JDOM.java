package S1031XML;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom.*;
import org.jdom.input.SAXBuilder;

public class T03JDOM {

	public static void main(String[] args) throws JDOMException, IOException {
		SAXBuilder SAXB=new SAXBuilder();//1.创建解析器对象
		Document d=SAXB.build(new File("xmldom.xml"));//2.将XML文档转换为DOM树
		Element foo=d.getRootElement();//3.取得树的根节点元素
		List allChildren=foo.getChildren();//4.取得根节点下所有孩子节点
		for(int i=0;i<allChildren.size();i++){//5.对集合元素进行遍历
			System.out.println(((Element) allChildren.get(i)).getChild("NO").getText());
			System.out.println(((Element) allChildren.get(i)).getChild("ADDR").getText());
		}
	
	}

}
