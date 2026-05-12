package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() {

		Connection conn = null;

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// step2 get connection

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb", "root", "admin");

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return conn;

	}

}
