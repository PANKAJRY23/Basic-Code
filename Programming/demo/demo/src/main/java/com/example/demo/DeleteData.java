package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s = "jdbc:mysql://localhost:3306/newdb";
		String username = "root";
		String password = "Pankaj@12345";

		try {
			Connection conn = DriverManager.getConnection(s,username,password);
			Statement stmt = conn.createStatement();
			String sql = "DELETE from my_table";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
