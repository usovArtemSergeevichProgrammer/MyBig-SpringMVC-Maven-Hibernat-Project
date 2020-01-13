package org.buspark.dao;

import java.util.List;

import org.buspark.model.Repair;

public interface RepairDao {

	Repair getRepairById(int id);

	void saveRepair(Repair repair);

	void updateRepair(Repair repair);

	void deleteRepairById(int id);

	List<Repair> showAllRepairs();
}
