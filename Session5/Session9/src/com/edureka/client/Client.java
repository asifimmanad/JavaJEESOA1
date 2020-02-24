package com.edureka.client;

import com.edureka.bean.Employee;
import com.edureka.db.JDBCDemo;

public class Client {

	public static void main(String[] args) {
		// step1 :-  Load Driver
		// step2 :-  create connections
		// step3 :-  java.sql.*; - JDBC API - Statement/PreparedStatement/CallableStatement
		// step4 :-  execute query - DDL, DML, DQL
		// step5 :-  close connections
		
		
		//CallableStatement --> PlSql --> functions, procedures
		
		Employee e1 = new Employee(102, "Siva", "siva@gmail.com");
//		Employee e2 = new Employee(101, "Vijay", "vijay@gmail.com");
//		Employee e3 = new Employee(101, "Vijay", "vijay@gmail.com");
		
		JDBCDemo obj = new JDBCDemo();
		
		obj.createConnection();
	//	obj.createTable();
	//	obj.insertEmployee(e1);
	//	obj.updateEmployee(101,"sayani");
		
	//	obj.getEmployee();
		
		obj.batchUpdate();
		
		obj.closeConnections();
		
	}
}
