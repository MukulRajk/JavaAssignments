
//stack is empty hence top=-1

class Stack2<G>{
	private int size;
	private int top;
	private G []arr;
	
	
	public Stack2() {
		size=5;
		top=-1;
		arr=(G[]) new Object[size];       //arr=new int[size];
	}
	
	public Stack2(int s) {
		size=s;
		top=-1;
		arr=(G[])new Object[size];
	}
	
	public boolean isFull(){
		return top==size-1;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void push(G val) throws Exception {
		if(!isFull())
		 arr[++top]=val;
		else 
			throw new Exception("Overflow...");
		
		
	}
	
	public G pop() throws Exception {
		if(!isEmpty())
		return arr[top--];
      
		else
			throw new Exception("underflow...");
	 
	}
	
	public void display() {
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
}



public class GenericStack {

	public static void main(String[] args) {
		Stack2<Integer> s1=new Stack2<>();
		try {
			System.out.println("Push");
		s1.push(22);
	    //System.out.println();
		s1.push(23);
		//System.out.println();
		s1.push(24);
		//System.out.println();
		s1.push(89);
		s1.push(90);
		//s1.push(91);
		//System.out.println();
		s1.display();
		
		System.out.println("Pop");
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		

	}
		catch(Exception e) {
			System.out.println(e);
		}

System.out.println("\n For string:");	

Stack2<String> s2=new Stack2<>();
		try {
			System.out.println("Push");
		s2.push("A");
	    //System.out.println();
		s2.push("E");
		//System.out.println();
		s2.push("I");
		//System.out.println();
		s2.push("O");
		s2.push("U");
		//s1.push(91);
		//System.out.println();
		s2.display();
		
		System.out.println("\n Pop");
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		

	}
		catch(Exception e) {
			System.out.println(e);
		}

}
}
