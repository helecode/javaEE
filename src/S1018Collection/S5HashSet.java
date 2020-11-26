package S1018Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class S5HashSet {
	public static void main(String[] args) {
		Set<String> hashSet=new HashSet<String>();
		System.out.println("判断是否为空："+hashSet.isEmpty()+"\t"+hashSet.size());
		hashSet.add("B");
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("F");
		hashSet.add("E");
		hashSet.add("G");
		hashSet.add("C");
		Iterator<String> i=hashSet.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+"\t");//存在相同被自动覆盖
		}
		hashSet.remove("B");
		System.out.println("\n是否包含E："+hashSet.contains("E"));
		Object a[]=hashSet.toArray();
		for(Object o:a){
			System.out.print(o+"\t");
		}
	}
}
