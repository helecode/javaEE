package S1021Thread;

class ThreadYield1 extends Thread {
	public ThreadYield1(String name){
		super(name);//���ø���Ĺ��췽����ʼ��name
	}
	public void run() {
		for (int i = 0; i < 3; i++) {
				System.out .println(Thread.currentThread().getName()+ (i + 1) + "������");	
				Thread.currentThread().yield ();//����			
	}
	}
}
class ThreadYield2 extends Thread {
	public ThreadYield2(String name){
		super(name);//���ø���Ĺ��췽����ʼ��name
	}
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out .println(Thread.currentThread().getName()+ (i + 1) + "������");
			Thread.currentThread().yield ();
	}
	}
}

class ThreadDaemon extends	Thread{
	public ThreadDaemon(String name){
		super(name);//���ø���Ĺ��췽����ʼ��name
	}
	public void run() {
		while ( true) {
			System.out .println(Thread.currentThread().getName());
		}
		}
}

public class S3ThreadControl extends Thread{

	public S3ThreadControl(String name){
		super(name);//���ø���Ĺ��췽����ʼ��name
		
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
				S3ThreadControl threadControl=new S3ThreadControl("��·������߳�");	
				threadControl.start();
				threadControl.sleep(2000);//�̵߳ȴ�2s����ִ��
				threadControl.join();//�����̵߳���һ���߳���ɺ��ڼ���ִ��
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		ThreadYield1 threadYield1=new ThreadYield1("yield1�߳�");
		ThreadYield2 threadYield2=new ThreadYield2("yield2�߳�");
		threadYield1.start();
		threadYield2.start();
		ThreadDaemon threadDaemon=new ThreadDaemon("��̨�߳�");
		
		threadDaemon.setDaemon(true);//����Ϊ��̨�߳�
		threadDaemon.join();
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread().getName()+" "+i+"�ж��Ƿ��Ǻ�̨����:"+threadDaemon.isDaemon());//�ж��Ƿ��Ǻ�̨����
			threadDaemon.interrupt();//�ж��߳�
		}
	}
}

