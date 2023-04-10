package com.jsp.schoolmanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	String url = "jdbc:mysql://localhost:3306/sejal";
	String username = "root";
	String password = "root";
	Connection connection = null;

	public Connection getConnection() {

		// load/register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}

}
