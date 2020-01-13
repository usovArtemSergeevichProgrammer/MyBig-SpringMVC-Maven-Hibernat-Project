package org.buspark.dao;

import java.util.List;

import org.buspark.model.DriverStatus;

public interface DriverStatusDao {

	DriverStatus getDriverStatusById(int id);

	void saveDriverStatus(DriverStatus status);

	void updateDriverStatus(DriverStatus status);

	void deleteDriverStatusById(int id);

	List<DriverStatus> showAllDriverStatus();
}
