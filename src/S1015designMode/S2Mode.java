package S1015designMode;

abstract class	Game{
	public abstract void initialize();
	public abstract void start();
	public abstract void end();
	public void play(){
		initialize();
		start();
		end();
	}	
}
class football extends Game{
	public void initialize() {
		System.out.println("足球游戏初始化");
		}
	public void start() {
		System.out.println("足球游戏开始");
		
	}
	public void end() {
		System.out.println("足球游戏结束");
	}
	
} 
public class S2Mode {
	public static void main(String[] args) {
		Game footballGame=new football();
		footballGame.play();
	}
}
