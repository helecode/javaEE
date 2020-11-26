package S1015designMode;

interface Target{
	public void request();//客户端请求处理方法
}
class Adaptee{
	public void specificRequest(){
		System.out.println("被配置的方法");
	}
}
class Adapter implements Target{
	public Adaptee adaptee;
	public Adapter(Adaptee adaptee){
		this.adaptee=adaptee;
	}
	public void request() {
		adaptee.specificRequest();		
	}	
}
public class S5Adapter {
	public static void main(String[] args) {
		new Adapter(new Adaptee()).request();
	}
}
