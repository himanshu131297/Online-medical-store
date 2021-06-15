package omos;

import java.sql.*;
import java.util.*;

public class omos
{
	// JDBC driver name and database URL

	public static void executor(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try {

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int ID = rs.getInt("ID");

				// Display values
				System.out.print("ID: " + ID);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}

	public static void executor1(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try {

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name
				String CODE = rs.getString("CODE");

				// Display values
				System.out.print("CODE: " + CODE);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}

	public static Connection getConnection(String databaseURL, String user, String password) 
	{
		Connection conn = null;
		databaseURL = "jdbc:mysql://localhost:3306/OM";
		user = "root";
		password = "Himanshu123@";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(databaseURL, user, password);
			if (conn != null) 
			{

			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return conn;
	}

	public static void executor2(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try 
		{

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name
				int buyer_id = rs.getInt("buyer_id");
				String fullname = rs.getString("full_name");

				// Display values
				System.out.print("buyerid: " + buyer_id + " " + "name: " + fullname);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}

	public static void executor3(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try 
		{

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name
				int seller_id = rs.getInt("seller_id");
				String fullname = rs.getString("full_name");

				// Display values
				System.out.print("seller_id: " + seller_id + " " + "name: " + fullname);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}

	public static void executor4(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try {

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name
				int ID = rs.getInt("ID");
				int BUYER_ID = rs.getInt("BUYER_ID");
				int SELLER_ID = rs.getInt("SELLER_ID");
				String DESCRPITION = rs.getString("DESCRIPTION");

				// Display values
				System.out.print("issue_id: " + ID + " " + " BuyerID: " + BUYER_ID + " SELLERID: " + SELLER_ID
						+ " DESCRIPTION " + DESCRPITION);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) {

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}

	public static void executor5(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try 
		{

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name
				int ID = rs.getInt("ID");
				String CATEGORY_NAME = rs.getString("CATEGORY_NAME");

				// Display values
				System.out.print("CATEGORY_ID: " + ID + " " + " CATEGORY_NAME: " + CATEGORY_NAME);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}

	public static void executor6(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try 
		{

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name

				int BUYER_ID = rs.getInt("BUYER_ID");
				String paymentmode = rs.getString("payment_mode");
				String delivery_address = rs.getString("delivery_address");

				// Display values
				System.out.print(" BuyerID: " + BUYER_ID + " paymentmode : " + paymentmode + " deliveryaddress "
						+ delivery_address);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}

	public static void executor7(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try 
		{

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name

				int ID = rs.getInt("ID");
				String NAME = rs.getString("NAME");
				String SUBSITUTE_NAME = rs.getString("SUBSITUTE_NAME");

				// Display values
				System.out.print(" Product_ID: " + ID + "  NAME : " + NAME + "SUBSITUTE_NAME :  " + SUBSITUTE_NAME);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}

	public static void executor8(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try 
		{

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name

				int order_id = rs.getInt("order_id");
				int buyer_id = rs.getInt("buyer_id");
				int product_id = rs.getInt("product_id");

				// Display values
				System.out.print(" Order_ID: " + order_id + "  BuyerID : " + buyer_id + "  ProductID:  " + product_id);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}

	public static void executor9(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/db";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try 
		{

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name

				int issue_id = rs.getInt("ID");
				int buyer_id = rs.getInt("buyer_id");
				int seller_id = rs.getInt("seller_id");
				int employee_id = rs.getInt("employee_id");
				boolean resolved = rs.getBoolean("RESOLVED");

				// Display values
				System.out.print(" ISSUE_ID: " + issue_id + "  BuyerID : " + buyer_id + "  Seller_ID:  " + seller_id
						+ "Employee assigned" + employee_id + " resolved " + resolved);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}
	public static void executor10(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/db";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try 
		{

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name

				int order_id = rs.getInt("order_id");
				int product_id = rs.getInt("product_id");
				
			

				// Display values
				System.out.print(" 	Order_ID: " + order_id + "  PRODUCT_ID : " + product_id);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			// end finally try
		}
		// end try
	}
	public static void executor11(String sqlquery) 
	{
		Connection conn = null;
		String databaseURL = "jdbc:mysql://localhost:3306/db";
		String user = "root";
		String password = "Himanshu123@";
		conn = getConnection(databaseURL, user, password);
		Statement stmt = null;
		try 
		{

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlquery);

			// STEP 5: Extract data from result set
			while (rs.next()) 
			{
				// Retrieve by column name

				int issue_id = rs.getInt("ID");
				String desc=rs.getString("DESCRIPTION");
				String resolved= rs.getString("RESOLVED");
				int EMPLOYEE_ID=rs.getInt("EMPLOYEE_ID");
				
			

				// Display values
				System.out.print(" 	Issue_id : " + issue_id  + "  EmployeeID  : " +EMPLOYEE_ID +" DESCPRITION :"+ desc+" RESOLVED: "+ resolved);

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException se) 
		{
			// Handle errors for JDBC
			se.printStackTrace();
		} 

		catch (Exception e) 
		{
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		finally 
		{
			// finally block used to close resources
			try 
			{
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException se2) 
			{

			} // nothing we can do
			try 
			{
				if (conn != null)
					conn.close();
			} 
			catch (SQLException se) 
			{
				se.printStackTrace();
			}
			
		}
		
	}


	public static void main(String[] args) 
	{
		// int buyerid=1000; increase this by one when creating a new user.....
		// String JDBC_DRIVER = "com.mysql.jdbc.Driver";

		// Database credentials

		Scanner inputofEmployee = new Scanner(System.in);
		Scanner inputofBuyer = new Scanner(System.in);
		Scanner inputofSeller = new Scanner(System.in);
		Scanner standardInput = new Scanner(System.in);
		String databaseURL = "jdbc:mysql://localhost:3306/OM";
		String user = "root";
		String password = "Himanshu123@";
		Connection conn = null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(databaseURL, user, password);
			if (conn != null) 
			{
				// System.out.println(conn);
				System.out.println("Connected to the database");
			}
		} 
		catch (ClassNotFoundException ex) 
		{
			System.out.println("Could not find database driver class");
			ex.printStackTrace();
		} 
		catch (SQLException ex) 
		{
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		}

		// STEP 2: Register JDBC driver
		// Class.forName("com.mysql.jdbc.Driver");
		// STEP 3: Open a connection
		// System.out.println("Connecting to database...");
		// conn = DriverManager.getConnection(DB_URL,USER,PASS);
		while (true)
		{
		System.out.println("Choose a role 1.Staff 2.Buyer 3.Seller");
		int choice = standardInput.nextInt();
		if (choice == 1) 
		{
			System.out.println("Enter Staff ID");
			int id = inputofEmployee.nextInt();
			String idStaff = Integer.toString(id);
			// run a query here to check if id exist or not
			while (true)
			{
				System.out.println("Choose from the following options");
				System.out.println("1.Browse Product Categorically");
				System.out.println("2.Display Users in The Ecosystem");
				System.out.println("3.Display Expired Coupons");
				System.out.println("4.Display Issues Assigned to you");
				int optionStaff = inputofEmployee.nextInt();
				if (optionStaff == 1) 
				{
					System.out.println("Choose from the following Category by typing out the category");
					System.out.println("antipyretics");
					System.out.println("analgesics");
					System.out.println("antimalarial");
					System.out.println("antibiotics");
					System.out.println("antiseptics");
					System.out.println("mood stabilizers");
					System.out.println("oral contraceptives");
					System.out.println("tranquilizers");
					System.out.println("stimulants");
					System.out.println("statins");
					String category = inputofEmployee.next();
					executor("Select * From Product Where Product in ( Select ID From Category Where Category_Name ="
							+ category + ";");
				} 
				else if (optionStaff == 2) 
				{
					System.out.println("1.View All Staff");
					System.out.println("2.View All Buyers");
					System.out.println("3.View All Sellers");
					int optioninsideStaff = inputofEmployee.nextInt();
					if (optioninsideStaff == 1) 
					{
						executor("Select * From Staff");
					} 
					else if (optioninsideStaff == 2) 
					{
						executor2("Select * From Buyers");
					} 
					else if (optioninsideStaff == 3) 
					{
						executor3("Select * From Sellers");
					}
				} 
				else if (optionStaff == 3) 
				{
					executor1("select CODE from Coupon where expiry <= '2022-06-01'");
				} 
				else if (optionStaff == 4) 
				{
					executor4("Select * From Issue Where EMPLOYEE_ID =" + idStaff + ";");
				} 
				else 
				{
					System.out.println("Invalid option from Staff");
					break;
				}
			}
		} 
		else if (choice == 2) 
		{
			System.out.println("Enter Customer ID");
			int id = inputofBuyer.nextInt();
			String idBuyer = Integer.toString(id);
			// run a query here to check if id exist or not
			while (true)
			{
				System.out.println("Choose from the following options");
				System.out.println("1.Display Categories");
				System.out.println("2.Browse Products Categorically");
				System.out.println("3.Display Cart");
				System.out.println("4.Display Substitute");
				System.out.println("5.Display Physician");
				System.out.println("6.Display Categorical Physician");
				System.out.println("7.Display Past Orders");
				System.out.println("8.Display Issues related with you");
				int optionBuyer = inputofBuyer.nextInt();
				if (optionBuyer == 1) 
				{
					executor5("Select * From Category ");
				} 
				else if (optionBuyer == 2) 
				{
					System.out.println("Choose from the following Category by typing out the category");
					System.out.println("antipyretics");
					System.out.println("analgesics");
					System.out.println("antimalarial");
					System.out.println("antibiotics");
					System.out.println("antiseptics");
					System.out.println("mood stabilizers");
					System.out.println("oral contraceptives");
					System.out.println("tranquilizers");
					System.out.println("stimulants");
					System.out.println("statins");

					String category = inputofBuyer.next();
					executor("Select * From Products Where Product in ( Select ID From Category Where Category_Name ="
							+ category + ");");
				} 
				else if (optionBuyer == 3) 
				{
					executor6("Select * From Checkout  Where buyer_id=" + idBuyer + ";");
				} 
				else if (optionBuyer == 4) 
				{
					System.out.println("Enter ProductID for which you want Substitute ");
					int productid = inputofBuyer.nextInt();
					executor7("Select * From Products Where ID=" + productid + ";");
				} 
				else if (optionBuyer == 5) 
				{
					System.out.println(
							"Enter ProductID for which you want Substitute so a Physician will contact you on this ");
					String substitute = inputofBuyer.next();
					executor(
							"Select * From Physician Where Category.Id in (Select Category.ID From Product Where ID in (Select substitute_ID From Substitute Where product_ID"
									+ substitute + "));");
				} 
				else if (optionBuyer == 6) 
				{
					System.out.println("Choose code from the following Category by typing out the category");
					System.out.println("801.antipyretics");
					System.out.println("802.analgesics");
					System.out.println("803.antimalarial");
					System.out.println("804.antibiotics");
					System.out.println("805.antiseptics");
					System.out.println("806.mood stabilizers");
					System.out.println("807.oral contraceptives");
					System.out.println("808.stimulants");
					System.out.println("809.tranquilizers");
					System.out.println("810.statins");
					String str2 = inputofBuyer.next();
					executor("Select * From Physician Where Category_ID =" + str2 + ";");
				} 
				else if (optionBuyer == 7) 
				{
					executor10("Select order_id, product_id From orders Where buyer_id =" + idBuyer + ";");
				} 
				else if (optionBuyer == 8) 
				{
					executor11("Select * From Issue Where BUYER_ID =" + idBuyer + ";");

				}
				else
				{
					System.out.println("Invalid Option from Buyer");
					break;
				}
			}
		} 
		else if (choice == 3) 
		{
			System.out.println("Enter Seller ID");
			int id = inputofSeller.nextInt();
			String idSeller = Integer.toString(id);
			// String category = inputofEmployee.next();
			// run a query here to check if id exist or not
			while (true)
			{
				System.out.println("Choose from the following options");
				System.out.println("1.View Orders");
				System.out.println("2.Display Categories");
				System.out.println("3.Browse Products Categorically");
				System.out.println("4.Display Issues related to you");
				int optionSeller = inputofSeller.nextInt();
				if (optionSeller == 1) 
				{
					executor8("Select * From Orders Where Seller_ID =" + idSeller + ";");
				} 
				else if (optionSeller == 2) 
				{
					String category = inputofEmployee.next();
					executor("Select * From Products Where Product in ( Select ID From Category Where Category_Name ="
							+ category + ");");
				} 
				else if (optionSeller == 3) 
				{
					String category = inputofEmployee.next();
					executor("Select * From Products Where Product in ( Select ID From Category Where Category_Name ="
							+ category + ");");
				} 
				else if (optionSeller == 4) 
				{
					executor9("Select * From Issue Where Seller_ID =" + idSeller + ";");
				}
				else
				{
					System.out.println("Invalid Option from Seller");
					break;
				}
			}

		}

		else 
		{

			System.out.println("Goodbye!");
			break;

		}
		}
		

	}

}