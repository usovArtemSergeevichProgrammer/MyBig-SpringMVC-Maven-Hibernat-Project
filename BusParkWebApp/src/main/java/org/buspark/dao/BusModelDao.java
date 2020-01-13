package org.buspark.dao;

import java.util.List;

import org.buspark.model.BusModel;

public interface BusModelDao {

	BusModel getBusModelById(int id);

	void saveBusModel(BusModel engine);

	void updateBusModel(BusModel engine);

	void deleteBusModelById(int id);

	List<BusModel> showAllBusModel();
}
