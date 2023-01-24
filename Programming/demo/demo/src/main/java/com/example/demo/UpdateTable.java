package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Pankaj@12345");
			Statement stmt = conn.createStatement();
			String sql = "UPDATE my_table " +
					"SET id = 1";
			stmt.executeUpdate(sql);

			ResultSet rs = stmt.executeQuery("select * from my_table");
			while(rs.next()){
				//Display values
				System.out.print("ID: " + rs.getInt("id"));
			}
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
