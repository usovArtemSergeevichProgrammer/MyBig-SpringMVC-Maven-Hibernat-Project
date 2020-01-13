package org.buspark.service;

import java.util.List;

import org.buspark.model.Driver;

public interface DriverService {

	Driver findById(int id);

	Driver findBySSO(String sso);

	void saveDriver(Driver driver);

	void updateDriver(Driver driver);

	void deleteDriverBySSO(String sso);

	List<Driver> findAllDrivers();

	boolean isDriverSSOUnique(Integer id, String sso);

}
