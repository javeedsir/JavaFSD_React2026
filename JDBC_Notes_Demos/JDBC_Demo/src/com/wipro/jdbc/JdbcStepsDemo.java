package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStepsDemo {

	public static void main(String[] args) {

		// step 1 register driver class

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			// step2 get connection

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb", "root", "admin");

			System.out.println(conn);

			// step3 create statement

			Statement stmt = conn.createStatement();

			// step 4 execute query
			
			//int id = 111;  String name = "satish";  double salary = 90000;

			//String insertQuery = "insert into Emp values("+id+","+name+","+salary+")";

			// String updateQuery = "update Emp set ename = 'javeed khan' , salary = 50000
			// where eid = 103";

			// String deleteQuery = "delete from Emp where eid = 103";

			/*
			 * int count = stmt.executeUpdate(deleteQuery);
			 * 
			 * System.out.println(count +"  record effected");
			 */

			String selectAll = "select * from Emp";

			ResultSet rs = stmt.executeQuery(selectAll);

			while (rs.next()) {

				int eid = rs.getInt("eid");
				String ename = rs.getString("ename");

				double salary = rs.getDouble(3);

				System.out.println(eid + " " + ename + "  " + salary);

			}

			// step 5 close DB connection
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
