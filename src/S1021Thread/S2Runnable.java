package S1021Thread;

import java.io.IOException;


public class S2Runnable implements	 Runnable{
	int i=6;
	public void run() {	
		for(;i>0;i--){
			System. out .println(Thread. currentThread ()+"ʣ��"+(i-1)+"��Ʊ");
			}
	}
	public static void main(String[] args) {
		System.out.println("ʵ��Runnable�����߳�,����̹߳���һ��Thread����,�̹߳���ȫ����Դ");
		S2Runnable thread=new S2Runnable();
		//�����̹߳�����Դ
		Thread thread1=new Thread(thread);
		Thread thread2=new Thread(thread);
		thread1.setPriority(4);
		thread1.start();
		thread2.start();
	}
	

}
