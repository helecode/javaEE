package S1021Thread;
class Account {
	int balance = 800;// 余额	
	public void withdraw(int amount) {// 取款
		balance = balance - amount;
	}
}
public class S4ThreadSynchronized implements Runnable{
	Account acct=new Account();	
	public void run() {
		for(int x=0;x<5;x++){		
		try {
				makeWithdrawal(100,x);//取款
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	//同步代码块实现
	/*private	void makeWithdrawal(int amt,int x) throws InterruptedException{
		synchronized(acct){
			if(acct.balance>amt){
				System.out.println("取款\t"+Thread.currentThread().getName()+",余额为"+"\t"+acct.balance);				
				acct.withdraw(amt);//如果余额足够,则取款
			}else{
				System.out.println(Thread.currentThread().getName()+"取款余额不足,余额为"+"\t"+acct.balance);
			}
		}
	}*/
	//同步方法实现
	private	 synchronized void makeWithdrawal(int amt,int x) throws InterruptedException{
			if(acct.balance>amt){
				System.out.println("取款\t"+Thread.currentThread().getName()+",余额为"+"\t"+acct.balance);				
				acct.withdraw(amt);//如果余额足够,则取款
			}else{
				System.out.println(Thread.currentThread().getName()+"取款余额不足,余额为"+"\t"+acct.balance);
			}
	}
	public static void main(String[] args) {
		// 创建两个线程分别表示张三和张三的老婆
		S4ThreadSynchronized r = new S4ThreadSynchronized();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("张三");
		two.setName("张三的妻子");
		one.start();
		two.start();
		
	}
}
