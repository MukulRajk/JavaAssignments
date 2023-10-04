class MyMath<G>
{
//Generic  method= G
	
	
	
public void Swap(G a,G b) {
	G temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println(a+" "+b);
}
}
public class Tester {

	public static void main(String[] args) {
		MyMath<Integer> m=new MyMath<>();
		m.Swap(11,22);
		
		MyMath<String> m1=new MyMath<>();
		m1.Swap("MindCraft","Asus");
		
		MyMath m3=new MyMath();
		m3.Swap(34, "Mind");
		
		
	}

}
