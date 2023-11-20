package dbPackage;

import java.sql.Connection;
import java.sql.DriverManager;

 

public final class dbConnection {
	    static Connection connection = null;
	    private dbConnection() {}

	    static synchronized public Connection getConnection() {

	        try {
	            if (connection == null) {
	                Class.forName(dbInfo.DRIVER);
	                connection = DriverManager.getConnection(dbInfo.URL, dbInfo.USER, dbInfo.PASSWORD);
	                return connection;

	            } else {
	                return connection;
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
	}

