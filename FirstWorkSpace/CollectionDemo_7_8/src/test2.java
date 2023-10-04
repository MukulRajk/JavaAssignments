import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class test2 {
public static void main(String args[]) {
	
	List<Integer> list=new ArrayList<>();
	
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	System.out.println("List : ");
	System.out.print(list+" ");
	
	System.out.println("\n For each :");
	for(Integer val:list) {
		System.out.print(val+" ");
		
		
	}
	
	System.out.println("\n iterator :");
	Iterator<Integer> itr=list.iterator();
	 while(itr.hasNext()) {
		 System.out.print(itr.next()+" ");
		 
	 }
	 System.out.println("\n "+list.get(2));
	
}

}
