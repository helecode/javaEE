package S1018Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class S1Collection {
	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<String>();
		boolean f=collection.isEmpty();
		System.out.println("�����Ƿ�Ϊ��:"+f);
		collection.add("ssss");
		collection.add("bbbb");
		int n=collection.size();
		collection.remove("ssss");
		System.out.println("���ϳ���:"+n);
		//������ת��Ϊ��������
		Object[] a=collection.toArray();
		for(Object o:a){
			System.out.println("o:"+o);
		}
		//ʹ�õ��������������е�Ԫ��
		Iterator<String> i=collection.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
