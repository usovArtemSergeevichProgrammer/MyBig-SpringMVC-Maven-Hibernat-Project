package org.buspark.dao;

import java.util.List;

import org.buspark.model.Driver;

public interface DriverDao {

	Driver getDriverById(int id);

	void saveDriver(Driver driver);
	
	void updateDriver(Driver driver);

	void deleteDriverById(int id);

	List<Driver> showAllDrivers();
}
