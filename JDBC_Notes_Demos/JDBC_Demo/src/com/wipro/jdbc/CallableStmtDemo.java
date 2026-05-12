package com.wipro.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class CallableStmtDemo {

	public static void main(String[] args) {


		Connection conn =	DBUtil.getDBConnection();
		
			try {
			CallableStatement cstmt =	conn.prepareCall("{call Emp_Pro()}");
				
					cstmt.execute();
			
				System.out.println("Procedure called successfully...");
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
