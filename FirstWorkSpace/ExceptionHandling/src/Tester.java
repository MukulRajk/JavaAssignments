//Exception


	
/*
public class Tester {

	public static void fn1() throws InterruptedException {
		                                                         //	System.out.println("Error!");
		fn2();
		}
		
		public static void fn2() throws InterruptedException {
			System.out.println("fn2...");
			Thread.sleep(100);
		}
	
	public static void main(String[] args) {
		                                                      //A a=new A();
		                                                       //a.fun();
		
		try {
			fn1();
		} catch (InterruptedException e) {
			System.out.println("Pass!");
			e.printStackTrace();
		}
	}

}
*/




class Tester{
	
	public static double divide(int num,int den) throws Exception {
		{
			if(den==0) {
				throw new Exception("denominator is zero!");
			
		
		return (double)num/den;
			}
	
	public static void main(String args[]) {
		System.out.println(divide(12,0));
	
		catch(Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}
	}
}