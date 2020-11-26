package S1017DictionaryList;

public class S5Array {
	public static <T> T[] fun1(T...arg){
		return arg;
	}
	public static <T> void fun2(T param[]){
		for(T t:param){
			System.out.print(t+"\t");
		}
	}
	public static void main(String[] args) {
		fun2(fun1(1,2,3,4,5));
		
	}
}
