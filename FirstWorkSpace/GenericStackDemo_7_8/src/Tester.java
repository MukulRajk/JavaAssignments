//stack is empty hence top=-1

class Stack{
	private int size;
	private int top;
	private int []arr;
	
	
	public Stack() {
		size=5;
		top=-1;
		arr=new int[size];
	}
	
	public Stack(int s) {
		size=s;
		top=-1;
		arr=new int[size];
	}
	
	public boolean isFull(){
		return top==size-1;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void push(int val) throws Exception {
		if(!isFull())
		 arr[++top]=val;
		else 
			throw new Exception("Overflow...");
		
		
	}
	
	public int pop() throws Exception {
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



public class Tester {

	public static void main(String[] args) {
		Stack s1=new Stack();
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

}
}
