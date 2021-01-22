package de.leuphana.cosa.routesystem.behaviour;

import java.util.HashSet;
import java.util.Set;

import de.leuphana.cosa.routesystem.structure.Route;

public class RouteSystemImpl  {
	
	private Set<Route> routes;
	
	public RouteSystemImpl() {
		routes = new HashSet<Route>();
	}

	public void addRoutes(Route route) {
		routes.add(route);
	}
	
	public void removeRoute(Route route) {
		routes.remove(route);
	}

}
