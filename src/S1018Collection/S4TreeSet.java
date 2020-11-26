package S1018Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class S4TreeSet {
	public static void main(String[] args) {
		Set<String> treeSet=new TreeSet<String>();
		System.out.println("判断是否为空："+treeSet.isEmpty()+"\t"+treeSet.size());
		treeSet.add("B");
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("F");
		treeSet.add("E");
		treeSet.add("G");
		treeSet.add("C");
		Iterator<String> i=treeSet.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+"\t");//存在相同被自动覆盖
		}
		treeSet.remove("B");
		System.out.println("\n是否包含E："+treeSet.contains("E"));
		System.out.println();
		Object a[]=treeSet.toArray();
		for(Object o:a){
			System.out.print(o+"\t");
		}
		
	}
}
