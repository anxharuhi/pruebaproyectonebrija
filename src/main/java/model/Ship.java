/**
 * 
 */
package model;

import java.sql.SQLException;

import dao.DaoShip;

/**
 * 
 */
public class Ship {

	private int id;
	private String name;
	private String denomination;
	private String licensePlate;
	private String description;
	private String photo;
	private String status;

	public Ship(int id, String name, String denomination, String licensePlate, String description, String photo,
			String status) {
		this.id = id;
		this.name = name;
		this.denomination = denomination;
		this.licensePlate = licensePlate;
		this.description = description;
		this.photo = photo;
		this.status = status;
	}

	public Ship(String name, String denomination, String licensePlate, String description, String status) {
		this(-1, name, denomination, licensePlate, description, "noPhoto", status);
	}

	@Override
	public String toString() {
		return "Ship [id=" + id + ", name=" + name + ", denomination=" + denomination + ", licensePlate=" + licensePlate
				+ ", description=" + description + ", photo=" + photo + ", status=" + status + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the denomination
	 */
	public String getDenomination() {
		return denomination;
	}

	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
		return licensePlate;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param denomination the denomination to set
	 */
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	/**
	 * @param licensePlate the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public void insertIntoDB() throws SQLException {

		DaoShip daoship = new DaoShip();
		daoship.insert(this);
	}
}
