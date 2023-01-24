package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Pankaj@12345");
			Statement stmt=con.createStatement();  

			String query = "CREATE TABLE mydata("
					+ "ID INT NOT NULL, "
					+ "NAME VARCHAR (20) NOT NULL, "
					+ "AGE INT NOT NULL, "
					+ "SALARY DECIMAL (18, 2), "
					+ "ADDRESS CHAR (25) , "
					+ "PRIMARY KEY (ID))";
			stmt.execute(query);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
