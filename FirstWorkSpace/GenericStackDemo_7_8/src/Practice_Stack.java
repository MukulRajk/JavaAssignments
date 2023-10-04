
class Stack3 {
private int size;
private int arr[];
private int top;


 public Stack3() {
	 size=5;
	 top=-1;
	 arr =new int [size];
 }
 public Stack3(int size, int[] arr, int top) {
		//super();
		this.size = size;
		this.arr = arr;
		this.top = top;
	}
 
 //1,23
 public int   push(int val) {
	 return arr[top++]=val;
 }
  //
	public int pop(int val) {
		return arr[top--];
	}
	
	
	public boolean isFull() {
		return top==size-1;
	
 }
	public  boolean isEmpty() {
		return top==-1;
	}
	
	public void display() {
		for(int i=0;i<size-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
 

}
public class Practice_Stack {

	public static void main(String args[]) {
		Stack3 s=new Stack3();
		s.push(23);
	}
}
