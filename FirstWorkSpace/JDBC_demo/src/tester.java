import java.sql.*;

public class tester {

	public static void main(String[] args) throws SQLException {
//driver loading
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");
//name,username,password
	 

Statement smt=conn.createStatement();
ResultSet rset=smt.executeQuery("select *  from Laptop");
while(rset.next())
{
	System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getDouble(3));
	
//Connection conn=DriverManager.getConnection(url,username,pd);
	//conn.createStatement;
	//conn.executeQuery;
	//print
	

}
conn.close();
	}

}
