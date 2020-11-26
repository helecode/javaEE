package S1021Thread;
class Account {
	int balance = 800;// ���	
	public void withdraw(int amount) {// ȡ��
		balance = balance - amount;
	}
}
public class S4ThreadSynchronized implements Runnable{
	Account acct=new Account();	
	public void run() {
		for(int x=0;x<5;x++){		
		try {
				makeWithdrawal(100,x);//ȡ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	//ͬ�������ʵ��
	/*private	void makeWithdrawal(int amt,int x) throws InterruptedException{
		synchronized(acct){
			if(acct.balance>amt){
				System.out.println("ȡ��\t"+Thread.currentThread().getName()+",���Ϊ"+"\t"+acct.balance);				
				acct.withdraw(amt);//�������㹻,��ȡ��
			}else{
				System.out.println(Thread.currentThread().getName()+"ȡ������,���Ϊ"+"\t"+acct.balance);
			}
		}
	}*/
	//ͬ������ʵ��
	private	 synchronized void makeWithdrawal(int amt,int x) throws InterruptedException{
			if(acct.balance>amt){
				System.out.println("ȡ��\t"+Thread.currentThread().getName()+",���Ϊ"+"\t"+acct.balance);				
				acct.withdraw(amt);//�������㹻,��ȡ��
			}else{
				System.out.println(Thread.currentThread().getName()+"ȡ������,���Ϊ"+"\t"+acct.balance);
			}
	}
	public static void main(String[] args) {
		// ���������̷ֱ߳��ʾ����������������
		S4ThreadSynchronized r = new S4ThreadSynchronized();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("����");
		two.setName("����������");
		one.start();
		two.start();
		
	}
}
