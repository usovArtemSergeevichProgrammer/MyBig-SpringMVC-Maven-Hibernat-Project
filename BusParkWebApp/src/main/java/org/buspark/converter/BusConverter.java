package org.buspark.converter;

import org.buspark.model.Bus;
import org.buspark.service.BusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BusConverter implements Converter<Object, Bus> {

	static final Logger logger = LoggerFactory.getLogger(BusConverter.class);

	@Autowired
	BusService busService;

	@Override
	public Bus convert(Object source) {
		Integer uid = Integer.parseInt((String) source);
		Bus bus = busService.findById(uid);
		logger.info("Bus : {}", bus);
		return bus;
	}

}
