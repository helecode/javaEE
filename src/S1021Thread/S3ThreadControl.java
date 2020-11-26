package S1021Thread;

class ThreadYield1 extends Thread {
	public ThreadYield1(String name){
		super(name);//调用父类的构造方法初始化name
	}
	public void run() {
		for (int i = 0; i < 3; i++) {
				System.out .println(Thread.currentThread().getName()+ (i + 1) + "次运行");	
				Thread.currentThread().yield ();//礼让			
	}
	}
}
class ThreadYield2 extends Thread {
	public ThreadYield2(String name){
		super(name);//调用父类的构造方法初始化name
	}
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out .println(Thread.currentThread().getName()+ (i + 1) + "次运行");
			Thread.currentThread().yield ();
	}
	}
}

class ThreadDaemon extends	Thread{
	public ThreadDaemon(String name){
		super(name);//调用父类的构造方法初始化name
	}
	public void run() {
		while ( true) {
			System.out .println(Thread.currentThread().getName());
		}
		}
}

public class S3ThreadControl extends Thread{

	public S3ThreadControl(String name){
		super(name);//调用父类的构造方法初始化name
		
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++){
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<5;i++){
			if(i==3){
				S3ThreadControl threadControl=new S3ThreadControl("半路加入的线程");	
				threadControl.start();
				threadControl.sleep(2000);//线程等待2s后再执行
				threadControl.join();//阻塞线程等另一个线程完成后在继续执行
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		ThreadYield1 threadYield1=new ThreadYield1("yield1线程");
		ThreadYield2 threadYield2=new ThreadYield2("yield2线程");
		threadYield1.start();
		threadYield2.start();
		ThreadDaemon threadDaemon=new ThreadDaemon("后台线程");
		
		threadDaemon.setDaemon(true);//设置为后台线程
		threadDaemon.join();
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName()+" "+i+"判断是否是后台进程:"+threadDaemon.isDaemon());//判断是否是后台进程
			threadDaemon.interrupt();//中断线程
		}
	}
}

