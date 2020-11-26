package S1018Collection;

import java.util.LinkedList;
public class S3LinkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.add("E");
		linkedList.add("F");
		linkedList.addFirst("开始");
		linkedList.addLast("结束");
		linkedList.add(1, "索引为1");
		linkedList.set(3, "修改索引为3的元素");
		System.out.println("linkedList:"+linkedList+"\t"+linkedList.size());
		linkedList.remove(3);
		linkedList.remove("E");
		linkedList.removeFirst();
		System.out.println("linkedList:"+linkedList+"\t"+linkedList.size());
		System.out.println("linkedList:"+linkedList.get(3)+"\t"+linkedList.getFirst()+"\t"+linkedList.getLast());
		System.out.println(linkedList.contains("D")+"\t"+linkedList.indexOf("D"));
	}
}
