/**
 * 
 */
package dao;

/**
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnexion {

	public static final String JDBC_URL = "jdbc:mysql://localhost:3316/fleet";
	public static Connection instance = null;

	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password", "nebrijawebdev");
			props.put("charset", "UTF-8");
			instance = DriverManager.getConnection(JDBC_URL, props);
		}

		return instance;
	}
}
