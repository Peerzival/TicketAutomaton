package de.leuphana.cosa.routesystem.structure.view;

import java.util.Scanner;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.leuphana.cosa.routesystem.behaviour.RouteSystemImpl;
import de.leuphana.cosa.routesystem.structure.model.Places;

public class RouteView {

	private static RouteView routeView;
	private Logger logger;
	
	private RouteView() {
		logger = LogManager.getLogger(this.getClass());
	}
	
	public static RouteView getRouteView () {
		if (routeView == null) {
			routeView = new RouteView();
		}
		return routeView;
	}
	
	public void initRouteView() {
		System.out.println("Wählen Sie Ihren Startort aus der folgenden Liste aus!");
		printPlaces();
		Scanner scanner = new Scanner(System.in);
		System.out.println("<> Geben Sie die Nummer Ihres Standortes ein!");
		System.out.println("<> Geben sie 7 ein, um abzubrechen!");
		boolean run = true;
		while(run) {
			String userInput = scanner.nextLine();
			if ("7".equals(userInput)) {
				System.out.println("Sie haben erfolgreich die Routenauswahl abgebrochen.");
				run = false;
			} else if("1".equals(userInput)) { //HAMBURG
				//TODO Event schmeißen, dass die RouteSystemImpl benachrichtigt. Dann in der RouteSystemImpl Methode schreiben, die folgendes tut:
//				route = new Route();
//				route.setStartingPlace(Places.HAMBURG);
				logger.info(Places.HAMBURG + "selected as the starting point!");
				run = false;
			} else if("2".equals(userInput)) { //MUNICH
				//TODO Event schmeißen, dass die RouteSystemImpl benachrichtigt. Dann in der RouteSystemImpl Methode schreiben, die folgendes tut:
//				route = new Route();
//				route.setStartingPlace(Places.MUNICH);
				logger.info(Places.MUNICH + "selected as the starting point!");
				run = false;
			} else if("3".equals(userInput)) { //BERLIN
				//TODO Event schmeißen, dass die RouteSystemImpl benachrichtigt. Dann in der RouteSystemImpl Methode schreiben, die folgendes tut:
//				route = new Route();
//				route.setStartingPlace(Places.BERLIN);
				logger.info(Places.BERLIN + "selected as the starting point!");
				run = false;
			} else if("4".equals(userInput)) { //FRANKFURT
				//TODO Event schmeißen, dass die RouteSystemImpl benachrichtigt. Dann in der RouteSystemImpl Methode schreiben, die folgendes tut:
//				route = new Route();
//				route.setStartingPlace(Places.FRANKFURT);
				logger.info(Places.FRANKFURT + "selected as the starting point!");
				run = false;
			} 
				System.out.println("Wrong input. Please type in one of the provided numbers");
		}
		
		System.out.println("Wählen Sie Ihren Zielort aus der folgenden Liste aus!");
//		printDestinations(userInput);
	}
	
	public void printPlaces() {
		Set<String> supportedPlaces = RouteSystemImpl.getSupportedPlaces();
		int i = 1;
		for(String places : supportedPlaces) {
			System.out.println(i + "  " + places);
			i++;
		}
	}
	
	public void printDestinations(String userInput) {
		Set<String> supportedPlaces = RouteSystemImpl.getSupportedPlaces();
		
	}
}
