package S1017DictionaryList;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class S4DictionaryFunction<T extends Object> {
	public T fun1(T t){//��ʱT��ʾ�ڶ��巺�����ʱ��ָ���ķ��ͱ�ʶ��
		System.out.println("fun1T:"+t);
		return t;
	}
	public <V extends Number> T fun2(V v){//��ʱVֻ���ڵ�ǰ����f��ʹ��
		System.out.println("fun2V:"+v);
		T t=null;
		return t;
	}
	public S4DictionaryFunction<T> fun3(T t){
		S4DictionaryFunction<T> s4DictionaryFunction=new S4DictionaryFunction<T>();
		return s4DictionaryFunction;
	}
	public static void main(String[] args) {
		S4DictionaryFunction<String> s4DictionaryFunctin=new S4DictionaryFunction<String>();
		s4DictionaryFunctin.fun1("sss");
		System.out.println(s4DictionaryFunctin.fun2(34.6));
		s4DictionaryFunctin.fun3("ssss");
	}
}
