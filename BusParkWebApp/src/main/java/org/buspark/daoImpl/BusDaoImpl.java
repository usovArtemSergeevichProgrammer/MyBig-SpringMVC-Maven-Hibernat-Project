package org.buspark.daoImpl;

import java.util.List;

import org.buspark.dao.AbstractDao;
import org.buspark.dao.BusDao;
import org.buspark.model.Bus;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("busDao")
public class BusDaoImpl extends AbstractDao<Integer, Bus> implements BusDao {

	static final Logger logger = LoggerFactory.getLogger(BusDaoImpl.class);

	@Override
	public Bus getBusById(int id) {
		Bus bus = getByKey(id);
		return bus;
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
	public void deleteBusById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Bus> showAllBuses() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("regNumber"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<Bus> buses = (List<Bus>) criteria.list();
		return buses;
	}

}
