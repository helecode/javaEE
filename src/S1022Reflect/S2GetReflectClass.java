package S1022Reflect;

public class S2GetReflectClass {

	public static void main(String[] args) throws ClassNotFoundException {
		//1.通过对象名.getClass()得到反射类
		S2GetReflectClass s2GetReflectClass=new S2GetReflectClass();
		Class<?> getClassClass=s2GetReflectClass.getClass();
		System.out.println("过对象名.getClass()得到反射类:"+getClassClass.getName());
		//2.通过对象名class.forName()得到反射类
		Class<?> forNameClass=Class.forName("S1022Reflect.S2GetReflectClass");
		System.out.println("过对象名.getClass()得到反射类:"+getClassClass.getName());
		//3.通过类名.class得到反射类	
		Class classClass=S2GetReflectClass.class;
		System.out.println("通过类名.class得到反射类:"+classClass.getName());
		//4.通过包装类.TYPE得到反射类
		Class typeClass=Integer.TYPE;
		System.out.println("通过包装类.type得到反射类:"+typeClass.getName());
	}

}
