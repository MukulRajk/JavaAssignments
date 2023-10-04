import java.sql.*;
import java.util.*;


		public class CaseStudy{

			public static void main(String[] args) throws SQLException {
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

				while(true){
				//public static void alternateViewTable(Connection con) throws SQLException
				
				    String query = "select accno,name,balance from Bank2";
				    try (Statement stmt = con.createStatement()) {
				      ResultSet rs = stmt.executeQuery(query);
				      while (rs.next()) {
				        
				        int accno = rs.getInt(1);
				        String name = rs.getString(2);
				        double balance = rs.getDouble(3);
				        //int sales = rs.getInt(4);
				        //int total = rs.getInt(5);
				        //System.out.println(coffeeName + ", " + supplierID + ", " + price +", " + sales + ", " + total);
				      System.out.println(accno+","+name+","+balance);
				      }
				    } catch (SQLException e) {
				      System.out.println(e);//sysoutJDBCTutorialUtilities.printSQLException(e);
				    }
				  
				
				/*double percentage=0.20;{
				    try (Statement stmt =
				      con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
				      ResultSet uprs = stmt.executeQuery("SELECT * FROM bank2");
				      while (uprs.next()) {
				        double f = uprs.getDouble("balance");
				        uprs.updateDouble("balance", f * percentage);
				        uprs.updateRow();
				      }
				    } catch (SQLException e) {
				      System.out.println(e);//JDBCTutorialUtilities.printSQLException(e);
				    }
				  }*/
				
				int accno=0;
				String name="";
				double balance=0.0;
				con.setAutoCommit(false);
				PreparedStatement pstmt = con.prepareStatement(
				                              "INSERT INTO COFFEES VALUES( " +
				                              "?, ?, ?)");
				
				pstmt.setInt(1, accno);
				pstmt.setString(2, name);
				pstmt.setDouble(3, balance);
				
				//pstmt.addBatch();

				

				// ... and so on for each new
				// type of coffee

				int[] updateCounts = pstmt.executeBatch();
				con.commit();
				con.setAutoCommit(true);
				
				/*Scanner sc=new Scanner(System.in);
				
				System.out.println("enter AccountNumber,Name,Balance");
				int AccountNumber=sc.nextInt();
				String Name=sc.next();
				double Balance=sc.nextDouble();
				
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");
		
PreparedStatement pstmt=conn.prepareStatement("insert into Bank2 values(?,?,?)");		
	pstmt.setInt(1, AccountNumber);
	pstmt.setString(2, Name);
	pstmt.setDouble(3, Balance);

		boolean status=pstmt.execute();
		if(!status)
		System.out.println("row inserted successfully");
		
		
			
PreparedStatement pstmt2=conn.prepareStatement("select AccountNumber,Name,Balance from Bank2");
ResultSet rs=pstmt2.executeQuery();
while(rs.next()) {
	int AccountNumber1=rs.getInt("AccountNumber");
	String Name1=rs.getString("Name");
	double Balance1=rs.getDouble("Balance");
	System.out.println(AccountNumber1 + ", " + Name1 + ", " + Balance1);

	boolean status2=pstmt2.execute();
	if(!status2)
	System.out.println("selected successfully");
}
*/}
			 }
		}
