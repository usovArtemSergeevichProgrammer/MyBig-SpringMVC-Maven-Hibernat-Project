package org.buspark.serviceImpl;

import java.util.List;

import org.buspark.dao.DriverDao;
import org.buspark.model.Driver;
import org.buspark.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("driverService")
@Transactional
public class DriverServiceImpl implements DriverService {
	
	@Autowired
	private DriverDao dao;
	
	@Override
	public Driver findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver findBySSO(String sso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveDriver(Driver driver) {
		dao.saveDriver(driver);

	}

	@Override
	public void updateDriver(Driver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDriverBySSO(String sso) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Driver> findAllDrivers() {
		return dao.showAllDrivers();
	}

	@Override
	public boolean isDriverSSOUnique(Integer id, String sso) {
		// TODO Auto-generated method stub
		return false;
	}

}
