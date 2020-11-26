package S1018Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class S6TreeMap {
	public static void main(String[] args) {
		Map<Integer,String> treeMap=new TreeMap<Integer,String>();
		treeMap.put(1, "A");	
		treeMap.put(2, "B");
		treeMap.put(3, "C");
		treeMap.remove(1);
		System.out.println("treeMap:"+treeMap);
		Set<Integer> set=treeMap.keySet();
		Iterator<Integer> i=set.iterator();
		//遍历key键
		while(i.hasNext()){
			System.out.print(i.next()+"\t");
		}
		//遍历value值
		Collection<String> list= treeMap.values();
		System.out.println();
		Iterator<String> il= list.iterator();
		while(il.hasNext()){
			System.out.print(il.next()+"\t");
		}
		System.out.println();
		//通过泛型嵌套使用同时遍历键-值
		Set<Map.Entry<Integer, String>> setMap=treeMap.entrySet();
		Iterator<Map.Entry<Integer, String>> it=setMap.iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> m=it.next();
			System.out.println(m.getKey()+"--->"+m.getValue());
		}
	}

}
