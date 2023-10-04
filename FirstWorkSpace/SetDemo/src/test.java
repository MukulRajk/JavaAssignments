import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> s=new HashSet<>();
s.add(10);
s.add(244);
s.add(1);
s.add(900);
System.out.println("HashSET: ");
System.out.print(s+" ");
		


Set<Integer> l=new LinkedHashSet<>();
l.add(10);
l.add(244);
l.add(1);
l.add(900);
System.out.println("\n LinkedHashSET: ");
System.out.print(l+" ");
		
Set<Integer> t=new TreeSet<>();
t.add(10);
t.add(244);
t.add(1);
t.add(900);
System.out.println("\n TreeSET: ");
System.out.print(t+" ");
		

	}

}
