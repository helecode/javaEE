package S1018Collection;

import java.util.*;

public class S2ArrayList {
	public static void main(String[] args) {
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("����");
		arrayList.add("�ڹ�");
		arrayList.add("�ǹ�");
		arrayList.add("С��");
		arrayList.add("С��");
		System.out.println(arrayList);
		//1.ʹ�õ�������
		Iterator<String>i=arrayList.iterator();
		System.out.println("��������");
		while(i.hasNext()){
			System.out.print(i.next()+"\t");
		}
		System.out.println();
		//2.ʹ��ѭ������
		System.out.println("ѭ������");
		for(int k=0;k<arrayList.size();k++){
			System.out.print(arrayList.get(k)+"\t");
		}
		System.out.println();
		//3.ת��Ϊ�������
		System.out.println("ת��Ϊ�������");
		Object [] array=arrayList.toArray();
		for(Object o:array){
			System.out.print(o+"\t");
		}
}
}
