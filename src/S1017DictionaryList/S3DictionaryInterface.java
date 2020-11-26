package S1017DictionaryList;

interface PointInterface<T>{
	public void fun(T a);
}
class PointImplements1<T> implements PointInterface<T>{
	public void fun(T a) {
		System.out.println("泛型接口实现类1:"+a);	
	}	
}
class	PointImplements2<String> implements PointInterface<String>{
	public void fun(String a) {
		System.out.println("泛型接口实现类1:"+a);		
	}	
}
public class S3DictionaryInterface {
	public static void main(String[] args) {
		PointImplements1<Integer> pointImplements1=new PointImplements1<Integer>();
		pointImplements1.fun(4);
		
		PointImplements2<String> pointImplements2=new PointImplements2<String>();
		pointImplements2.fun("sss");
	}
}
