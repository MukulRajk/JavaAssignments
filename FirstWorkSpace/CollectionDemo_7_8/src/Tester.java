import java.util.*;
//import java.util.Vector;
//vector= collection of dynamic arrays
public class Tester {
	
	public static void main(String args[]) {

		List<Integer> v=new Vector<>();
		v.add(33);
		v.add(44);
		v.add(55);
		v.add(66);
		v.add(77);
		System.out.println("toString:");
		System.out.println(v);  //using toString 
		
		
		System.out.println("primitive class");
		for(int val:v) {
			System.out.print(val+" ");
		}
		
		// wrapper class
		
		System.out.println("\n Wrapper(Integer:)");  // using for each
		for(Integer val:v) {
			System.out.print(val+" ");
		}
		
		//iterator
		System.out.println("\n iterator:");
		Iterator<Integer> itr=v.iterator();  // using iterator
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n Get Method:");
		System.out.print(v.get(1)*5);  //multiply 1st index element with 5
}
}