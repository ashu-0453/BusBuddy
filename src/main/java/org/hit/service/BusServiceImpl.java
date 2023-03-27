package org.hit.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.hit.model.Bus;
import org.hit.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService{
	
	@Autowired
	private BusRepository busRepository;
	

	@Override
	public Bus addBus(Bus bus) {
		
		return busRepository.save(bus);
	}

	@Override
	public Bus updateBus(Bus bus) {
		
		return busRepository.save(bus);
	}

	@Override
	public Bus deleteBus(int busId) {
		Optional<Bus> opt=busRepository.findById(busId);
		if(opt.isPresent()) {
			Bus b=opt.get();
			busRepository.delete(b);
			return b;
		}
		return null;
	}

	@Override
	public Bus viewBus(int busId) {
		Optional<Bus> opt=busRepository.findById(busId);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Bus> viewBusByType(String busType) {
		
		return busRepository.findByBusType(busType);
	}

	@Override
	public List<Bus> viewAllBus() {
		
		return busRepository.findAll();
	}

	@Override
	public List<Bus> viewBusBySourceDestinationAndDate(String routeFrom, String routeTo, LocalDate busDate) {
		
		return busRepository.findByRouteFromAndRouteToAndBusDate(routeFrom, routeTo, busDate);
	}
	

}
