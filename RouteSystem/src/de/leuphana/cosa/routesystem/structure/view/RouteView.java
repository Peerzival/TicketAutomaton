package de.leuphana.cosa.routesystem.structure.view;

import java.util.Set;

import de.leuphana.cosa.routesystem.behaviour.RouteSystemImpl;

public class RouteView {

	private static RouteView routeView;
	
	private RouteView() {
	}
	
	public static RouteView getRouteView () {
		if (routeView == null) {
			routeView = new RouteView();
		}
		return routeView;
	}
	
	public void initRouteView() {
		System.out.println("Wählen Sie Ihren Startort aus der folgenden Liste aus?");
		printPlaces();
		
		System.out.println("Geben Sie die Nummer Ihres Standortes ein!");
	}
	
	public void printPlaces() {
		Set<String> supportedPlaces = RouteSystemImpl.getSupportedPlaces();
		int i = 1;
		for(String places : supportedPlaces) {
			System.out.println(i + "  " + places);
			i++;
		}
	}
}
