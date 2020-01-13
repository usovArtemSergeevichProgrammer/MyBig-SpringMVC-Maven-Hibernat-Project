package org.buspark.dao;

import java.util.List;

import org.buspark.model.RepairStatus;

public interface RepairStatusDao {

	RepairStatus getRepairStatusById(int id);

	void saveRepairStatus(RepairStatus repairStatus);

	void updateRepairStatus(RepairStatus repairStatus);

	void deleteRepairStatusById(int id);

	List<RepairStatus> showAllRepairStatuses();

}
