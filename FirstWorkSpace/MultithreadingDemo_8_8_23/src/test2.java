// Runnable Interface

class MyThreads implements Runnable
{
	private Thread t1,t2;
	
	public MyThreads() {
		t1=new Thread(this,"first");
		t2=new Thread(this,"second");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			if(Thread.currentThread()==t1)
				System.out.println("Hi..");
			else if(Thread.currentThread()==t2)
				System.out.println("Hello....");
		}
		
	}
}


public class test2 {
	public static void main(String args[]) {
MyThreads m=new MyThreads();		
	}

}
