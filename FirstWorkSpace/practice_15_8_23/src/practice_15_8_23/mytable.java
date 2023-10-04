package practice_15_8_23;

import java.sql.*;
import java.util.Scanner;

public class mytable {

public static void createTable() throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

while(true){
	 {
		String createString =
		  "create table COFFEES " + "(COF_NAME varchar(32) NOT NULL, " +
		  "SUP_ID int NOT NULL, " + "PRICE numeric(10,2) NOT NULL, " +
		  "SALES integer NOT NULL, " + "TOTAL integer NOT NULL, " +
		  "PRIMARY KEY (COF_NAME), " +
		  "FOREIGN KEY (SUP_ID) REFERENCES SUPPLIERS (SUP_ID))";
		try (Statement stmt = con.createStatement()) {
		  stmt.executeUpdate(createString);
		} catch (SQLException e) {
		  System.out.println(e); //JDBCTutorialUtilities.printSQLException(e);
		} }
			 } }
	
	
public static void populateTable() throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

			  try (Statement stmt = con.createStatement()) {
			    stmt.executeUpdate("insert into COFFEES " +
			   "values('Colombian', 00101, 7.99, 0, 0)");
			stmt.executeUpdate("insert into COFFEES " +
			   "values('French_Roast', 00049, 8.99, 0, 0)");
					      
			  } catch (SQLException e) {
			    System.out.println(e); //JDBCTutorialUtilities.printSQLException(e);
			  }
			}

	
public static void viewTable() throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

		 String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";
		 try (Statement stmt = con.createStatement()) {
		   ResultSet rs = stmt.executeQuery(query);
		   while (rs.next()) {
		     String coffeeName = rs.getString("COF_NAME");
		     int supplierID = rs.getInt("SUP_ID");
		     float price = rs.getFloat("PRICE");
		     int sales = rs.getInt("SALES");
		     int total = rs.getInt("TOTAL");
		     System.out.println(coffeeName + ", " + supplierID + ", " + price +
		                        ", " + sales + ", " + total);
		   }
		 } catch (SQLException e) {
		   System.out.println(e);//JDBCTutorialUtilities.printSQLException(e);
		 }
		}  


public static void alternateViewTable() throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

		String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";
		try (Statement stmt = con.createStatement()) {
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
		  String coffeeName = rs.getString(1);
		  int supplierID = rs.getInt(2);
		  float price = rs.getFloat(3);
		  int sales = rs.getInt(4);
		  int total = rs.getInt(5);
		  System.out.println(coffeeName + ", " + supplierID + ", " + price +
		                     ", " + sales + ", " + total);
		}
		} catch (SQLException e) {
		System.out.println(e);//JDBCTutorialUtilities.printSQLException(e);
		}
		}

public static void modifyPrices(float percentage) throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

		percentage = 0;
		try (Statement stmt =
		con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
		ResultSet uprs = stmt.executeQuery("SELECT * FROM COFFEES");
		while (uprs.next()) {
		  float f = uprs.getFloat("PRICE");
		  uprs.updateFloat("PRICE", f * percentage);
		  uprs.updateRow();
		}
		} catch (SQLException e) {
		System.out.println(e); //JDBCTutorialUtilities.printSQLException(e);
		}
		}

public static void batchUpdate() throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");

con.setAutoCommit(false);
try (Statement stmt = con.createStatement()) {

stmt.addBatch("INSERT INTO COFFEES " +
              "VALUES('Amaretto', 49, 9.99, 0, 0)");
stmt.addBatch("INSERT INTO COFFEES " +
              "VALUES('Hazelnut', 49, 9.99, 0, 0)");
stmt.addBatch("INSERT INTO COFFEES " +
              "VALUES('Amaretto_decaf', 49, 10.99, 0, 0)");
stmt.addBatch("INSERT INTO COFFEES " +
              "VALUES('Hazelnut_decaf', 49, 10.99, 0, 0)");

int[] updateCounts = stmt.executeBatch();
con.commit();
} catch (BatchUpdateException b) {
System.out.println(b);// JDBCTutorialUtilities.printBatchUpdateException(b);
} catch (SQLException ex) {
System.out.println(ex);//JDBCTutorialUtilities.printSQLException(ex);
} finally {
con.setAutoCommit(true);
}
}


public static void main(String[] args)  throws SQLException {
		Scanner sc=new Scanner(System.in);
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "rootroot");
		System.out.println("enter choice :");
		int a=sc.nextInt();
		switch(a) {
		
		case 1:
			while(true) {
		System.out.println("1.createTable :");
		createTable();
		break;}
		
		case 2:
			System.out.println(" 2.populateTable : ");
		populateTable();
		break;
		
		case 3:
			System.out.println("3.viewTable : ");
		viewTable();
		break;
		
		case 4:
			System.out.println(" 4.alternateViewTable : ");
		alternateViewTable();	
		break;
		
		case 5:
			System.out.println(" 5.modifyPrices : ");
		modifyPrices(20);
		break;
		
		case 6:
			System.out.println(" 6.batchUpdate : ");
		batchUpdate();
        break;
      
		case 7:
			System.out.println("7.exit");
			System.exit(0);
			
			
		}
   
      
     
      
   
      
   
      
		 }
		 
		 
	} 