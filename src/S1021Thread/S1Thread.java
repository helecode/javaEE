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
			System.out.println(Thread.currentThread()+"\tʣ��"+(i-1)+"��Ʊ");
		}
	}

	public static void main(String[] args) {
		S1Thread thread1=new S1Thread("�߳�1");
		S1Thread thread2=new S1Thread("�߳�2");
		System.out.println("�߳�������ȼ�:"+thread1.MAX_PRIORITY);
		System.out.println("�߳�������ȼ�:"+thread1.MIN_PRIORITY);
		System.out.println("�߳�Ĭ�����ȼ�:"+thread1.NORM_PRIORITY);
		System.out.println("�߳�id:"+thread1.getId());
		System.out.println("�߳�name:"+thread1.getName());
		System.out.println("�߳����ȼ�:"+thread1.getPriority());
		System.out.println("�߳�״̬:"+thread1.getState());
		System.out.println("�߳�������"+thread1.getThreadGroup());
		System.out.println("�߳��Ƿ��ж�:"+thread1.interrupted());
		System.out.println("�߳��Ƿ����:"+thread1.isAlive());
		System.out.println("�߳��Ƿ����ػ��߳�:"+thread1.isDaemon());
		thread1.start();
		thread2.start();
	}
}
