package de.leuphana.cosa.routesystem.structure.model;

public class Route {

	private Places startingPlace;
	private Places destination;
	private String routeId;
	private String distance;
	private Integer price;

	public Places getStartingPlace() {
		return startingPlace;
	}

	public void setStartingPlace(Places startingPlace) {
		this.startingPlace = startingPlace;
	}

	public Places getDestination() {
		return destination;
	}

	public void setDestination(Places destination) {
		this.destination = destination;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
