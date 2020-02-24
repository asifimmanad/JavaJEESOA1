package com.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.edureka.bean.Employee;

//CRUD
public class JDBCDemo {

	Connection con;
	Statement stmt;
	PreparedStatement pst;

	public void createConnection() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");

			System.out.println("Connections created");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createTable() {
		// TODO Auto-generated method stub

		String query = "create table employee (id int(10), name varchar(20), email varchar(20))";

		try {
			stmt = con.createStatement();

			stmt.execute(query);

			System.out.println("Query Executed");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		int id = e.getEmployeeId();
		String name = e.getEmployeeName();
		String email = e.getEmployeeEmail();

		// insert into employee values(id,name,email).

		// insert into employee values(101,'asif','asif@mail.com').
		// String query = "insert into employee values("+id +",'"+name+"','"+email+"')";

		try {
			/*
			 * stmt = con.createStatement(); stmt.execute(query);
			 */
			pst = con.prepareStatement("insert into employee values(?,?,?)");

			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			int i = pst.executeUpdate();

			System.out.println("Data inserted");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	/*	try {
			CallableStatement cts = con.prepareCall("{ call ProcedureName(?,?) }");
			
			cts.setInt(1, );
			cts.setInt(2, );
			
			cts.execute();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/

	}

	public void updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		try {
			/*
			 * stmt = con.createStatement(); stmt.execute(query);
			 */
			pst = con.prepareStatement("update employee set name = ? where id = ?");

			pst.setInt(2, id);
			pst.setString(1, name);

			int i = pst.executeUpdate();

			System.out.println("Data inserted" + i);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void deleteEmployee() {
		// TODO Auto-generated method stub

	}

	public void getEmployee() {
		// TODO Auto-generated method stub

		try {
			pst = con.prepareStatement("select * from employee");

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void closeConnections() {
		// TODO Auto-generated method stub
		try {
			if(stmt!= null)
				stmt.close();
			if(pst!= null)
				pst.close();
			if(con!= null);
				con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void batchUpdate() {
		// TODO Auto-generated method stub

		try {
			stmt = con.createStatement();
			
			con.setAutoCommit(false);
			
			stmt.addBatch("insert into employee values(103,'Victor','victor@gmail.com')");
			stmt.addBatch("insert into employee345 values(104,'nilesh','nilesh@hotmail.com')");
			
			stmt.executeBatch();
			
			con.commit();
			System.out.println("Commit");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("rollback");
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
		
		
	}
	

}

