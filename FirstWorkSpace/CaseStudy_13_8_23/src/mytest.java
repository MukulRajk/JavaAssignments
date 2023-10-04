import java.sql.*;
import java.util.*;

public class mytest {

	public static void main(HashMap<String, Integer> balance)  throws SQLException{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

	 {
		    String updateString =
		      "update bank2 set balance = ? where accno = ?";
		   String updateStatement ="update bank2 set balance = balance + ? where accno = ?";

		    try (PreparedStatement updateSales = con.prepareStatement(updateString);
		         PreparedStatement updateTotal = con.prepareStatement(updateStatement))
		    
		    {
		      con.setAutoCommit(false);
		      for (Map.Entry<String, Integer> e : balance.entrySet()) {
		        updateSales.setInt(1, e.getValue().intValue());
		        updateSales.setString(2, e.getKey());
		        updateSales.executeUpdate();

		        updateTotal.setInt(1, e.getValue().intValue());
		        updateTotal.setString(2, e.getKey());
		        updateTotal.executeUpdate();
		        con.commit();
		      }
		    } catch (SQLException e) {
		     System.out.println(e);
		      if (con != null) {
		        try {
		          System.err.print("Transaction is being rolled back");
		          con.rollback();
		        } catch (SQLException excep) {
		           System.out.println(excep);
		        }
		      }
		    }
		  }
		
		
	}

}
