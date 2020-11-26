package S1022Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class S4InvokeFunction {
	public int fun(int id,String name){
		System.out.println("调用fun方法");
		return 10;
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> c=S4InvokeFunction.class;
		Object obj=c.newInstance();
		Method m=c.getMethod("fun", new Class[]{int.class,String.class});
		Object o=m.invoke(obj,new Object[]{1,"aa"});	
		System.out.println("o:"+o);
	}

}
