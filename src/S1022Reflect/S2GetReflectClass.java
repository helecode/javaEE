package S1022Reflect;

public class S2GetReflectClass {

	public static void main(String[] args) throws ClassNotFoundException {
		//1.ͨ��������.getClass()�õ�������
		S2GetReflectClass s2GetReflectClass=new S2GetReflectClass();
		Class<?> getClassClass=s2GetReflectClass.getClass();
		System.out.println("��������.getClass()�õ�������:"+getClassClass.getName());
		//2.ͨ��������class.forName()�õ�������
		Class<?> forNameClass=Class.forName("S1022Reflect.S2GetReflectClass");
		System.out.println("��������.getClass()�õ�������:"+getClassClass.getName());
		//3.ͨ������.class�õ�������	
		Class classClass=S2GetReflectClass.class;
		System.out.println("ͨ������.class�õ�������:"+classClass.getName());
		//4.ͨ����װ��.TYPE�õ�������
		Class typeClass=Integer.TYPE;
		System.out.println("ͨ����װ��.type�õ�������:"+typeClass.getName());
	}

}
