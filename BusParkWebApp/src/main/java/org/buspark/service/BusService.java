package org.buspark.service;

import java.util.List;

import org.buspark.model.Bus;

public interface BusService {

	Bus findById(int id);

	Bus findByGarageNumber(String number);

	Bus findByRegNumber(String number);

	void saveBus(Bus bus);

	void updateBus(Bus bus);

	void deleteBusByGarageNumber(String number);

	void deleteBusByRegNumber(String number);

	List<Bus> findAllBuses();

	boolean isBusGarageNumberUnique(Integer id, String number);

	boolean isBusRegNumberUnique(Integer id, String number);

}
