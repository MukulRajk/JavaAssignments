import java.sql.*;
import java.util.*;


public class test{
public static void main(String[] args) throws SQLException {
	
				Scanner sc=new Scanner(System.in);
				
				//System.out.println("enter accno,name,balance");
				int accno=0;//=sc.nextInt();
				String name="";//=sc.next();
				double balance=0.0;//=sc.nextDouble();
				

System.out.println("Welcome to Bank");
while(true) {
	System.out.println("Enter your Choice : ");
	System.out.println("1.Add a new Customer :");
	System.out.println("2.Search Customer Details(Name/Account Number) : ");
	System.out.println("3.Update your Details(Account Number) : ");
	System.out.println("4.Balance Enquiry : ");
	System.out.println("5.Close(Delete) the customer account : ");
	System.out.println("6.Exit ");
//int c,f=0;
//String d,e="";
int choice=sc.nextInt();

switch(choice) {

case 1:
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

	System.out.println("Enter your Account Number,Name & Money to be deposited : \n");
	int accno1=sc.nextInt();
	String name1=sc.next();
	double balance1=sc.nextDouble();
		
PreparedStatement pstmt=con.prepareStatement("insert into bank2 values(?,?,?)");
		pstmt.setInt(1, accno1);
		pstmt.setString(2, name1);
		pstmt.setDouble(3, balance1);
		
		boolean status=pstmt.execute();
		if(!status)
		System.out.println("row inserted successfully");
		break;
	
case 2:
	System.out.println("Enter your Account Number (preferably): ");
	Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

    PreparedStatement pstmt1=con1.prepareStatement("select accno from bank2");
    int	c=sc.nextInt();
    
	Statement stmt = con1.createStatement();
	ResultSet rs = pstmt1.executeQuery("select accno,name,balance from bank2");
      
	
	while(c==accno) {
		
	
  int accno11 = rs.getInt("accno");
  String name11 = rs.getString("name");
  double balance11 = rs.getDouble("balance");
  boolean status2=pstmt1.execute();
	
if(!status2)
	       
	        System.out.println(accno11 + ", " + name11 + ", " + balance11);
		System.out.println("retrieved success!");
	}

	break;	
	
case 3:
		
}	
		



}



		}
		}
		