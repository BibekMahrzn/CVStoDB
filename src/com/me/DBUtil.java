package com.me;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");  // not required in java 1.7+
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/batch","postgres","postgres");
	}

}
