package org.buspark.dao;

import java.util.List;

import org.buspark.model.Route;

public interface RouteDao {

	Route getRouteById(int id);

	void saveRoute(Route route);

	void updateRoute(Route route);

	void deleteRouteById(int id);

	List<Route> showAllRoutes();
}
