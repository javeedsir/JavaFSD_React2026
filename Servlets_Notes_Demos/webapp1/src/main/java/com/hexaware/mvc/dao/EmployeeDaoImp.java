package com.hexaware.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.mvc.pojo.Employee;

public class EmployeeDaoImp implements IEmployeeDao {
	
	
		Connection conn =	 DBUtil.getDBConnection();

	@Override
	public int addEmployee(Employee emp) {

		
			int count =0;
			
		try {
			PreparedStatement pstmt =		conn.prepareStatement("insert into  EmployeeInfo  values(?,?,?)");
			
							pstmt.setInt(1, emp.getEid());
							pstmt.setString(2, emp.getEname());
							pstmt.setDouble(3, emp.getSalary());
			
			
				count =		pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ? positional parameters
		
		
		return  count;
	}

	@Override
	public List<Employee> displayAllEmployees() {

		
		List<Employee>  list = new ArrayList<Employee>();
		
		try {
			PreparedStatement pstmt =		conn.prepareStatement("Select  eid,ename ,salary from EmployeeInfo");
		
				ResultSet rs =	pstmt.executeQuery();
				
				while(rs.next()) {
					
				Integer eid =	rs.getInt("eid");
				String ename = rs.getString("ename");
				double  salary = rs.getDouble("salary");
				
				
				Employee emp = new Employee(eid, ename, salary);
				
				list.add(emp);
					
				}
				
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	/*
	 * @Override public int updateEmployee(Employee emp) {
	 * 
	 * 
	 * int count =0;
	 * 
	 * try { PreparedStatement pstmt = conn.
	 * prepareStatement("update EmployeeInfo set ename = ? , salary = ? where eid =?"
	 * );
	 * 
	 * pstmt.setString(1, emp.getEname()); pstmt.setDouble(2, emp.getSalary());
	 * pstmt.setInt(3, emp.getEid());
	 * 
	 * 
	 * count = pstmt.executeUpdate();
	 * 
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } // ? positional parameters
	 * 
	 * 
	 * return count; }
	 * 
	 * @Override public Employee selectByEid(int eid) {
	 * 
	 * Employee emp = null;
	 * 
	 * try { PreparedStatement pstmt =
	 * conn.prepareStatement("select * from EmployeeInfo where eid = ?");
	 * 
	 * pstmt.setInt(1, eid);
	 * 
	 * ResultSet rs = pstmt.executeQuery();
	 * 
	 * while(rs.next()) {
	 * 
	 * 
	 * int id = rs.getInt("eid"); String ename = rs.getString("ename"); double
	 * salary = rs.getDouble("salary");
	 * 
	 * 
	 * emp = new Employee(id, ename, salary);
	 * 
	 * }
	 * 
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * 
	 * return emp; }
	 * 
	 * @Override public int deleteByEid(int eid) {
	 * 
	 * int count =0;
	 * 
	 * try { PreparedStatement pstmt =
	 * conn.prepareStatement("delete from EmployeeInfo where eid = ?");
	 * 
	 * pstmt.setInt(1, eid);
	 * 
	 * count = pstmt.executeUpdate();
	 * 
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return count;
	 * 
	 * }
	 */

}
