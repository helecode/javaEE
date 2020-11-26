package S1018Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class S1Collection {
	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<String>();
		boolean f=collection.isEmpty();
		System.out.println("集合是否为空:"+f);
		collection.add("ssss");
		collection.add("bbbb");
		int n=collection.size();
		collection.remove("ssss");
		System.out.println("集合长度:"+n);
		//将集合转换为对象数组
		Object[] a=collection.toArray();
		for(Object o:a){
			System.out.println("o:"+o);
		}
		//使用迭代器遍历集合中的元素
		Iterator<String> i=collection.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
