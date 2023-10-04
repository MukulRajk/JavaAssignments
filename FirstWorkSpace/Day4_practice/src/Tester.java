interface printable{
	
	public void printDetails();
	
	
}
  abstract class CktPlayer implements  printable{
	public String name;
	public int runs;
	
	public CktPlayer() {
	name="";
	runs=0;
	}
	
	public CktPlayer(String name, int runs) {
		//super();
		this.name = name;
		this.runs = runs;
	}
	
	public void show() {
		System.out.println("name:"+name+"\n"+"runs:"+runs);
	}
}


 abstract class FtPlayer  implements printable{
	public String name;
	public int goals;
	
	
	public FtPlayer() {
		name="";
		goals=0;
	}
	
	public FtPlayer(String name, int goals) {
		//super();
		this.name = name;
		this.goals = goals;
	}
	
	
	public void show() {
		System.out.println("name:"+name+"\n"+"goals:"+goals);
	}
}


public class Tester {

	public static void main(String[] args) {
	//CktPlayer  c=new CktPlayer("ray",34);
	//c.show();
		
		
	}

}
