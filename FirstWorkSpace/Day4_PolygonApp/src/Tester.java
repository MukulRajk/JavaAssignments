// abstract concept

abstract class Polygon{
	public abstract double calArea();
	public abstract double calPeri();
	
}


/*
 *class polygon{
 public double calArea();
  public double calPeri();
  }
 * */

class Circle extends Polygon{
	private int radius;
	
	
	public Circle() {
		radius=1;
	}
	
	public Circle(int r) {
		radius=r;
	}
	
	public double calArea() {
		return 3.14*radius*radius;
	}
	
	
	public double calPeri() {
		return 2*3.14*radius;
	}
	
}
class Rectangle extends Polygon{
	private int len,breadth;

	public Rectangle() {
		//super();
		len = 1;
		breadth = 1;
	}
	
	public Rectangle(int l, int b) {
		//super();
		len = l;
		breadth = b;
	}
	
	
	public double calArea() {
		return len*breadth;
	}
	
	public double calPeri() {
		return 2*(len+breadth);
	}
}

	class Square extends Rectangle {
		 public Square() {
			 
			 
	}
		 
		 
		 public Square(int s) {
			 super(s,s);
		 }
	
		 public double calArea() {
			 return super.calArea();
		 }
   
		 public double calPeri() {
			 return super.calPeri();
			 
		 }
}
	
	







public class Tester {

	public static void main(String[] args) {
	 Circle c=new Circle(5);	
System.out.println("Area:"+ c.calArea());
System.out.println("perimeter:"+ c.calPeri());

Rectangle r=new Rectangle(5,5);
System.out.println("  Rectangle "+"\n"+"Area:"+ r.calArea());
System.out.println("perimeter:"+ r.calPeri());

Square s=new Square(10);
System.out.println("Square"+"\n"+"Area:"+ s.calArea());
System.out.println("perimeter:"+ s.calPeri());

//abstract concept
System.out.println("Polygon \n\n");
Polygon p=new Circle(10);	
System.out.println("Area:"+ c.calArea());
System.out.println("perimeter:"+ c.calPeri());
	}
	
	

}
