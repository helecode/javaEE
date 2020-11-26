package S1021Thread;

import java.io.IOException;


public class S2Runnable implements	 Runnable{
	int i=6;
	public void run() {	
		for(;i>0;i--){
			System. out .println(Thread. currentThread ()+"剩余"+(i-1)+"张票");
			}
	}
	public static void main(String[] args) {
		System.out.println("实现Runnable创建线程,多个线程共享一个Thread对象,线程共享全局资源");
		S2Runnable thread=new S2Runnable();
		//两个线程共享资源
		Thread thread1=new Thread(thread);
		Thread thread2=new Thread(thread);
		thread1.setPriority(4);
		thread1.start();
		thread2.start();
	}
	

}
