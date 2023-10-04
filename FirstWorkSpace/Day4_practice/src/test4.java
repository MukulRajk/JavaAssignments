


public class test4 {
 
	static  int  add(int ...a) {
		int i,sum=0;
		for(i=0;i<a.length;i++) {
			sum=sum+a[i];
			
			//return sum;
		}
		System.out.println(sum);
		return sum;
	}
	
	
	public static void main(String[] args) {
		 test4 t=new test4();
		 t.add(2,10,20);
		 t.add(100,200,300,10,3);
		

	}

}
