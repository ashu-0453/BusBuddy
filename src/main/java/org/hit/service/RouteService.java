package org.hit.service;

import java.util.List;

import org.hit.model.Route;

public interface RouteService {
	public Route addRoute(Route route);
	public Route updateRoute(Route route);
	public Route deleteRoute(int routeId);
	public Route viewRoute(int routeId);
	public List<Route> viewAllRoute();
	
}
