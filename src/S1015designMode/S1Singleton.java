package S1015designMode;

class Singleton{
	private Singleton(){
	}
	private static Singleton singleton;
	public static Singleton getSingleton(){
		if(singleton==null){
			return new Singleton();
		}
		return singleton;
	}
}
public class S1Singleton {
	
	public static void main(String[] args) {
		System.out.println(Singleton.getSingleton());
	}

}
