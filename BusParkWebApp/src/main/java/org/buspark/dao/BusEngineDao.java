package org.buspark.dao;

import java.util.List;

import org.buspark.model.BusEngine;

public interface BusEngineDao {

	BusEngine getBusEngineById(int id);

	void saveBusEngine(BusEngine engine);

	void updateBusEngine(BusEngine engine);

	void deleteBusEngineById(int id);

	List<BusEngine> showAllBusEngines();
}
