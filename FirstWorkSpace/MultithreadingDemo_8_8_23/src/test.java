//concurrency

//thraed class 
class FirstThread extends Thread{
	public void run() {
	for(int i=0;i<100;i++) {
		System.out.println("Hi..");
		try {
			Thread.sleep(30);
		}
		
		catch (InterruptedException e) {
			
		}
	}
} }

class SecondThread extends Thread{
	public void run() {
	for(int i=0;i<100;i++)
{
	System.out.println("Hello......");
	try {
		Thread.sleep(50);
	}
	
	catch (InterruptedException e) {
		
	}
}
} }

public class test {

	public static void main(String[] args) {
FirstThread ft=new FirstThread();
SecondThread st=new SecondThread();
		ft.start();
		st.start();
		
	}

}
