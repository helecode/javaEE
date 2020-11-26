package S1022Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.sun.org.apache.bcel.internal.generic.FieldGen;

public class S1ReflectClass {
	public	int id=1;
	String name="����";
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
		//1.ʵ��������
		S1ReflectClass reflect=new S1ReflectClass();
		//ͨ������õ���Ӧ�ķ�����
		Class<?> c=reflect.getClass();
		//ͨ��������õ��������
		S1ReflectClass reflect2=(S1ReflectClass) c.newInstance();
		System.out.println(reflect2.name);
		System.out.println("��������"+c.getPackage());
		System.out.println("�õ�����:"+c.getSuperclass());
		System.out.println("������"+c.getName());
		Constructor<?>[] constructors=c.getDeclaredConstructors();
		System.out.print("ͨ��������õ����й��췽��:");
		for(Constructor constructor:constructors){
			System.out.print(constructor.getName()+"\t");
		}
		System.out.println();	
		System.out.print("ͨ��������õ���������:");
		Field[] fields=c.getDeclaredFields();
		for(Field field:fields){
			System.out.print(field.getName()+"\t");
		}
		System.out.println();
		System.out.print("ͨ��������õ�public��������:");
		Field[] fieldsP=c.getFields();
		for(Field field:fieldsP){
			System.out.print(field.getName()+"\t");
		}

		System.out.println();
		System.out.print("ͨ��������õ����з���:");
		Method methods[]=c.getDeclaredMethods();
		for(Method method: methods){
			System.out.print(method.getName()+"\t");
		}
		System.out.println();
	
	}

}
