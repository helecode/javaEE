package S1018Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class S5HashSet {
	public static void main(String[] args) {
		Set<String> hashSet=new HashSet<String>();
		System.out.println("�ж��Ƿ�Ϊ�գ�"+hashSet.isEmpty()+"\t"+hashSet.size());
		hashSet.add("B");
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("F");
		hashSet.add("E");
		hashSet.add("G");
		hashSet.add("C");
		Iterator<String> i=hashSet.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+"\t");//������ͬ���Զ�����
		}
		hashSet.remove("B");
		System.out.println("\n�Ƿ����E��"+hashSet.contains("E"));
		Object a[]=hashSet.toArray();
		for(Object o:a){
			System.out.print(o+"\t");
		}
	}
}
