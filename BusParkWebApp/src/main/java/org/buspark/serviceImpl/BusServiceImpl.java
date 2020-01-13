package org.buspark.serviceImpl;

import java.util.List;

import org.buspark.dao.BusDao;
import org.buspark.model.Bus;
import org.buspark.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("busService")
@Transactional
public class BusServiceImpl implements BusService{

	@Autowired
	private BusDao dao;
	
	@Override
	public Bus findById(int id) {
		return dao.getBusById(id);
	}

	@Override
	public Bus findByGarageNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bus findByRegNumber(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveBus(Bus bus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBus(Bus bus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBusByGarageNumber(String number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBusByRegNumber(String number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bus> findAllBuses() {
		return dao.showAllBuses();
	}

	@Override
	public boolean isBusGarageNumberUnique(Integer id, String number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBusRegNumberUnique(Integer id, String number) {
		// TODO Auto-generated method stub
		return false;
	}

}
