package org.hit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Route {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer routeId;
	private String routeFrom;
	private String routeTo;
	private Integer distance;
	
	public Route() {
		
	}

	public Route(String routeFrom, String routeTo, Integer distance) {
		super();
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.distance = distance;
	}

	public Integer getRouteId() {
		return routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public String getRouteFrom() {
		return routeFrom;
	}

	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}

	public String getRouteTo() {
		return routeTo;
	}

	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", distance="
				+ distance + "]";
	}
	
	
	
	

}
