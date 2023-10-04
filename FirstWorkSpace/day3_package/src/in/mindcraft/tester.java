

public class tester{
	private  int lid;
	private String make;
	private double cost;
    private static int cnt;

//add cnt to count
public tester(){   // default constructor
	lid=101;
	make="ASUS";
	cost=87400;
	cnt++;
}

//add cnt to count objects

public tester(int lid,String make, double cost) { //parameterized constructor
this.lid=lid;   //this -refere to laptop->private->lid
this.make=make;
this.cost=cost;
cnt++;

}

//schowcnt
public static  void showCnt() {
	System.out.println("No. of objects: "+cnt);
}


public void show() {
	System.out.println(lid+" "+make+" "+cost);
}

}
