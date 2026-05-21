package com.hexaware.spring.layers.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hexaware.spring.layers.beans.Student;

@Repository
public class StudentRepositoryImp implements IStudentRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// RowMapper to map result set to Student object
	private final RowMapper<Student> rowMapper = (rs, rowNum) -> {
		Student student = new Student();
		student.setSid(rs.getInt("sid"));
		student.setSname(rs.getString("sname"));

		return student;
	};

	@Override
	public int addStudent(Student student) throws DataAccessException {

		// JDBC insert query code

		String insert = "insert into Students(sid,sname)  values(?,?)";

		return jdbcTemplate.update(insert, student.getSid(), student.getSname());

	}

	@Override
	public List<Student> getAllStudents() {
	
				String selectQuery ="select * from Students";
				
					return	jdbcTemplate.query(selectQuery, rowMapper );
		
		
	}

}
