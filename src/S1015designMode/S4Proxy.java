package S1015designMode;
interface Network{	//定义network接口
	public void browse();
}
class Real implements Network{
	public void browse() {
		System.out.println("真实上网浏览信息");
	}}
class Proxy implements Network{
	private Network network;
	public Proxy(Network network){
		this.network=network;
	}
	public void check(){
		System.out.println("检查用户是否合法");
	}
	public void browse() {
		System.out.println("代理上网调用真实的上网方法");
		this.check();
		this.network.browse();
	}
}
public class S4Proxy {
	public static void main(String[] args) {
		new Proxy(new Real()).browse();
	}
}
