package S1021Thread;

public class S1Thread extends Thread{
	String name;
	public S1Thread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=3;i>0;i--){
			System.out.println(Thread.currentThread()+"\t剩余"+(i-1)+"张票");
		}
	}

	public static void main(String[] args) {
		S1Thread thread1=new S1Thread("线程1");
		S1Thread thread2=new S1Thread("线程2");
		System.out.println("线程最高优先级:"+thread1.MAX_PRIORITY);
		System.out.println("线程最低优先级:"+thread1.MIN_PRIORITY);
		System.out.println("线程默认优先级:"+thread1.NORM_PRIORITY);
		System.out.println("线程id:"+thread1.getId());
		System.out.println("线程name:"+thread1.getName());
		System.out.println("线程优先级:"+thread1.getPriority());
		System.out.println("线程状态:"+thread1.getState());
		System.out.println("线程所属组"+thread1.getThreadGroup());
		System.out.println("线程是否中断:"+thread1.interrupted());
		System.out.println("线程是否活着:"+thread1.isAlive());
		System.out.println("线程是否是守护线程:"+thread1.isDaemon());
		thread1.start();
		thread2.start();
	}
}
