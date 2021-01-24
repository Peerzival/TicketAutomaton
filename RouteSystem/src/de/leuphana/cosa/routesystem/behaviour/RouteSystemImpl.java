package de.leuphana.cosa.routesystem.behaviour;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.leuphana.cosa.routesystem.structure.model.Places;
import de.leuphana.cosa.routesystem.structure.model.Route;

public class RouteSystemImpl {

	private Set<Route> routes;
	private Logger logger;
	private Route route;

	public RouteSystemImpl() {
		routes = new HashSet<Route>();

		logger = LogManager.getLogger(this.getClass());
	}

	public void addRoutes(Route route) {
		routes.add(route);
		logger.info("Route with starting place " + route.getStartingPlace() + " and destination "
				+ route.getDestination() + " added!");
	}

	public void removeRoute(Route route) {
		routes.remove(route);
		logger.info("Route with starting place " + route.getStartingPlace() + " and destination "
				+ route.getDestination() + " removed!");
	}
	
	public static Set<String> getSupportedPlaces() {
		return Arrays.stream(Places.values()).map(Enum::name).collect(Collectors.toSet());
	}
	
}
