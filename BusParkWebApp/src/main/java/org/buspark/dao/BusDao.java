package org.buspark.dao;

import java.util.List;

import org.buspark.model.Bus;

public interface BusDao {

	Bus getBusById(int id);

	void saveBus(Bus bus);

	void updateBus(Bus bus);

	void deleteBusById(int id);

	List<Bus> showAllBuses();

}
