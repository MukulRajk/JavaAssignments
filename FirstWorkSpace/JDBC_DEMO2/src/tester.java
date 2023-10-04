import java.sql.*;
import java.util.*;

public class tester {
public static void main(String args[]) throws SQLException {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","rootroot");
	    System.out.println("Connection established.");
	   try { 
	    String sql = "INSERT INTO bank2 (accno, name, balance) VALUES (?, ?, ?)";
	    PreparedStatement statement = con.prepareStatement(sql);
	    statement.setInt(1, 567);
	    statement.setString(2, "check15");
	    statement.setDouble(3, 100);
	    statement.executeUpdate();
	    System.out.println("Record created.");
	   }
	   catch(SQLException e) {
		   System.out.println(e);
	   }
	    
	    
	   try {
	    String sql1 = "SELECT accno, name, balance FROM bank2 WHERE accno = ?";
	    PreparedStatement statement1 = con.prepareStatement(sql1);
	    statement1.setInt(1, 1);
	    ResultSet result = statement1.executeQuery();
	    if (result.next()) {
	        int accno = result.getInt("accno");
	        String name = result.getString("name");
	        double balance= result.getDouble("balance");
	        System.out.println("accno : " + accno);
	        System.out.println("name : " + name);
	        System.out.println("balance :" + balance);
	    } 
	    }
	   catch(SQLException e) {
		   System.out.println(e);
	   }
	    
	    
	   try { 
	   String sql2 = "UPDATE bank2 SET accno = ?, name = ?, balance = ? WHERE accno = ?";
	    PreparedStatement statement2 = con.prepareStatement(sql2);
	    statement2.setString(1, "new_value1");
	    statement2.setString(2, "new_value2");
	    statement2.setInt(3, 456);
	    statement2.setInt(4, 1);
	    statement2.executeUpdate();
	    System.out.println("Record updated.");
	   }
	   catch(SQLException e) {
		   System.out.println(e);
	   }
	   
	    String sql3 = "DELETE FROM bank2 WHERE accno = ?";
	    PreparedStatement statement3 = con.prepareStatement(sql3);
	    statement3.setInt(1, 1);
	    statement3.executeUpdate();
	    System.out.println("Record deleted.");
	    
	    
	   //con.close();
	}
	
	  }

	

