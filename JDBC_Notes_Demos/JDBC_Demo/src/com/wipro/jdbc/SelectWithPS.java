package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectWithPS {

	public static void main(String[] args) {

		Connection conn = DBUtil.getDBConnection();

		String selectQuery = "select * from Emp where salary > ?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectQuery);
			
			pstmt.setDouble(1, 50000);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("eid") + "  " + rs.getDouble("salary") + "  " + rs.getString("ename"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
