package com.jsp.schoolmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.schoolmanagement.dto.Teacher;
import com.jsp.schoolmanagement.util.HelperClass;

public class TeacherDao {
	HelperClass helperClass = new HelperClass();

	public Teacher insertTeacher(Teacher teacher) {
		Connection connection = helperClass.getConnection();
		String sql = "Insert into teacher values(?,?,?)";

		try {
				//create statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,teacher.getId());
			preparedStatement.setString(2, teacher.getName());
			preparedStatement.setString(3, teacher.getLoc());
			
			//execute statement
			preparedStatement.execute();
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return teacher;
	}

	
	public boolean deleteTeacher(int id) {
	Connection connection=	helperClass.getConnection();
	String sql="Delete from teacher where id=?";
	
	 try {
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		
		preparedStatement.setInt(1, id);
		
		preparedStatement.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 finally {
		 try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	 return true;
	}

	public Teacher updateTeacher(Teacher teacher) {
		Connection connection= helperClass.getConnection();
		String sql="Update teacher set name=?,loc=? where id=?";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1, teacher.getName());
			preparedStatement.setString(2, teacher.getLoc());
			preparedStatement.setInt(3, teacher.getId());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return teacher;
	}

	
	public void getAllTeacher() {
		Connection connection= helperClass.getConnection();
		String sql="select * from teacher";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			ResultSet resultSet= preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("==========================");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


	public void getByIdTeacher(int id) {
		Connection connection= helperClass.getConnection();
		String sql="select * from teacher where id=?";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


}
