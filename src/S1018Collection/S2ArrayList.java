package S1018Collection;

import java.util.*;

public class S2ArrayList {
	public static void main(String[] args) {
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("旺旺");
		arrayList.add("黑狗");
		arrayList.add("狼狗");
		arrayList.add("小黑");
		arrayList.add("小白");
		System.out.println(arrayList);
		//1.使用迭代遍历
		Iterator<String>i=arrayList.iterator();
		System.out.println("迭代遍历");
		while(i.hasNext()){
			System.out.print(i.next()+"\t");
		}
		System.out.println();
		//2.使用循环遍历
		System.out.println("循环遍历");
		for(int k=0;k<arrayList.size();k++){
			System.out.print(arrayList.get(k)+"\t");
		}
		System.out.println();
		//3.转化为数组遍历
		System.out.println("转化为数组遍历");
		Object [] array=arrayList.toArray();
		for(Object o:array){
			System.out.print(o+"\t");
		}
}
}
