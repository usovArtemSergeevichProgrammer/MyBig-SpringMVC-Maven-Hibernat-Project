package org.buspark.dao;

import java.util.List;

import org.buspark.model.BusStatus;

public interface BusStatusDao {

	BusStatus getBusStatusById(int id);

	void saveBusStatus(BusStatus status);

	void updateBusStatus(BusStatus status);

	void deleteBusStatusById(int id);

	List<BusStatus> showAllBusStatus();
}
