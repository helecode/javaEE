package S1022Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class S3DynamicCreate {
	public int id;
	public String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public S3DynamicCreate(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public S3DynamicCreate() {
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c=Class.forName("S1022Reflect.S3DynamicCreate");
		Constructor cons=c.getConstructor(new Class[]{int.class,String.class});
		S3DynamicCreate dynamicCreate=(S3DynamicCreate) cons.newInstance(1,"lisi");
		System.out.println(dynamicCreate.id+"\t"+dynamicCreate.name);	
	}
}
