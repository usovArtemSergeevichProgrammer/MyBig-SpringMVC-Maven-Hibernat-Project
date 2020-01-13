package org.buspark.daoImpl;

import java.util.List;

import org.buspark.dao.AbstractDao;
import org.buspark.dao.DriverDao;
import org.buspark.model.Driver;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("driverDao")
public class DriverDaoImpl extends AbstractDao<Integer, Driver> implements DriverDao {

	static final Logger logger = LoggerFactory.getLogger(DriverDaoImpl.class);

	@Override
	public Driver getDriverById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveDriver(Driver driver) {
		persist(driver);
	}

	@Override
	public void updateDriver(Driver driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDriverById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Driver> showAllDrivers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<Driver> drivers = (List<Driver>) criteria.list();
		return drivers;
	}

}
