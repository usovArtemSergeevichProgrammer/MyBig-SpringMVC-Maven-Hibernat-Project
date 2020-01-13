package org.buspark.dao;

import java.util.List;

import org.buspark.model.ControlRoom;

public interface ControlRoomDao {

	ControlRoom getControlRoomById(int id);

	void saveControlRoom(ControlRoom room);

	void updateControlRoom(ControlRoom room);

	void deleteControlRoomById(int id);

	List<ControlRoom> showAllControlRoom();
}
