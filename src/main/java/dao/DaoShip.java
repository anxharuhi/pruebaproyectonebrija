/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Ship;

/**
 * 
 */
public class DaoShip {

	// Singleton pattern
	public static Connection con = null;

	public DaoShip() throws SQLException {
		this.con = DBConnexion.getConnection();
	}

	public void insert(Ship s) throws SQLException {
		String sql = "INSERT INTO ships(name, denomination, licensePlate, description, status) VALUES (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, s.getName());
		ps.setString(2, s.getDenomination());
		ps.setString(3, s.getLicensePlate());
		ps.setString(4, s.getDescription());
		ps.setString(5, s.getStatus());

		int rows = ps.executeUpdate();
		ps.close();
	}
}
