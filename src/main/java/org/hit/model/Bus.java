package org.hit.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer busId;
	
	private String busName;
	private String driverName;	
	private String busType;
	private String routeFrom;
	private String routeTo;
	private LocalDate busDate;
	private LocalTime arrivalTime;
	private LocalTime departureTime;
	private Integer seats;
	private Integer availableSeats;
	
	public Bus() {
		
	}

	public Bus(String busName, String driverName, String busType, String routeFrom, String routeTo, LocalDate busdate,
			LocalTime arrivalTime, LocalTime departureTime, Integer seats, Integer availableSeats) {
		super();
		this.busName = busName;
		this.driverName = driverName;
		this.busType = busType;
		this.routeFrom = routeFrom;
		this.routeTo = routeTo;
		this.busDate = busdate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.seats = seats;
		this.availableSeats = availableSeats;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
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
	

	public LocalDate getBusDate() {
		return busDate;
	}

	public void setBusDate(LocalDate busDate) {
		this.busDate = busDate;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", driverName=" + driverName + ", busType=" + busType
				+ ", routeFrom=" + routeFrom + ", routeTo=" + routeTo + ", busDate=" + busDate + ", arrivalTime="
				+ arrivalTime + ", departureTime=" + departureTime + ", seats=" + seats + ", availableSeats="
				+ availableSeats + "]";
	}

	
	
	
	

}
