package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSDemo {

	public static void main(String[] args) {

		// step 1 register driver class

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// step2 get connection

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb", "root", "admin");

			
				// insert operation
			/*
			 * String query = "insert into Emp values(?,?,?)"; // ? postional parameters
			 * 
			 * PreparedStatement pstmt = conn.prepareStatement(query);
			 * 
			 * // values from KB
			 * 
			 * int id = 111; // scanner.nextInt(); String name = "tommy"; double sal =
			 * 99000;
			 * 
			 * pstmt.setInt(1, id); pstmt.setString(2, name); pstmt.setDouble(3, sal);
			 */
			
			String updateQuery = "update Emp set ename = ? , salary = ? where eid =?";
			
			 String deleteQuery = "delete from  Emp where eid = ?";
			
				
			
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
			
					 pstmt.setInt(1,111);
			
						/*
						 * pstmt.setString(1, "king khan"); pstmt.setDouble(2, 98000); pstmt.setInt(3,
						 * 101);
						 */
			
			
			int count = pstmt.executeUpdate();

			System.out.println(count + " record effected");

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}
