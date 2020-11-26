package S1022Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.sun.org.apache.bcel.internal.generic.FieldGen;

public class S1ReflectClass {
	public	int id=1;
	String name="李四";
	private int age=14;
	public S1ReflectClass(){	
	}	
	public S1ReflectClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void function(){
		
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		//1.实例化对象
		S1ReflectClass reflect=new S1ReflectClass();
		//通过对象得到对应的反射类
		Class<?> c=reflect.getClass();
		//通过反射类得到该类对象
		S1ReflectClass reflect2=(S1ReflectClass) c.newInstance();
		System.out.println(reflect2.name);
		System.out.println("所属包："+c.getPackage());
		System.out.println("得到父类:"+c.getSuperclass());
		System.out.println("类名："+c.getName());
		Constructor<?>[] constructors=c.getDeclaredConstructors();
		System.out.print("通过反射类得到所有构造方法:");
		for(Constructor constructor:constructors){
			System.out.print(constructor.getName()+"\t");
		}
		System.out.println();	
		System.out.print("通过反射类得到所有属性:");
		Field[] fields=c.getDeclaredFields();
		for(Field field:fields){
			System.out.print(field.getName()+"\t");
		}
		System.out.println();
		System.out.print("通过反射类得到public类型属性:");
		Field[] fieldsP=c.getFields();
		for(Field field:fieldsP){
			System.out.print(field.getName()+"\t");
		}

		System.out.println();
		System.out.print("通过反射类得到所有方法:");
		Method methods[]=c.getDeclaredMethods();
		for(Method method: methods){
			System.out.print(method.getName()+"\t");
		}
		System.out.println();
	
	}

}
