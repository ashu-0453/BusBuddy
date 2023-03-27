package org.hit.service;

import java.time.LocalDate;
import java.util.List;

import org.hit.model.Bus;

public interface BusService {
	public Bus addBus(Bus bus);
	public Bus updateBus(Bus bus);
	public Bus deleteBus(int busId);
	public Bus viewBus(int busId);
	public List<Bus> viewBusByType(String busType);
	public List<Bus> viewAllBus();
	public List<Bus> viewBusBySourceDestinationAndDate(String routeFrom,String routeTo,LocalDate busDate);
	
}
