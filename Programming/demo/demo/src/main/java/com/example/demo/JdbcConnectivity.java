package com.example.demo;

import java.sql.*;


public class JdbcConnectivity {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","Pankaj@12345");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from my_table ");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
