
 class Aa {
static int a;
 
static class B{
	public void fn() {
		a=123;
		System.out.println("abc..");
		
	}
}
	 
}
 
 public class  A{
	 public static void main(String args[]) {
		 Aa.B obj=new Aa.B();
		 obj.fn();
		 //showCnt();
		 System.out.println("Static import ...");
	 }
 }
