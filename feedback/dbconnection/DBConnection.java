package com.feedback.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // get the connection
	public static Connection getConnection() {
	    String connectionURL = "jdbc:postgresql://localhost:5432/employee_feedback";
	    String userName = "postgres"; 
	    String password = "experion"; 
	    Connection connection = null;

	    try {
	        Class.forName("org.postgresql.Driver"); 
	        connection = DriverManager.getConnection(connectionURL, userName, password);
//	        System.out.println("✅ Connected to PostgreSQL database!");
	    } catch (ClassNotFoundException e) {
	        System.err.println("PostgreSQL JDBC Driver not found! Add it to your classpath.");
	    } catch (SQLException e) {
	        System.err.println("Connection Failed! Check URL/username/password.");
	        e.printStackTrace();
	    }

	    return connection;
	}

    // close the connection
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
