package org.hit.service;

import java.util.List;
import java.util.Optional;

import org.hit.model.Route;
import org.hit.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {
	
	@Autowired
	private RouteRepository routeRepository;

	@Override
	public Route addRoute(Route route) {
		
		return routeRepository.save(route);
	}
	

	@Override
	public Route updateRoute(Route route) {
		
		return routeRepository.save(route);
	}

	@Override
	public Route deleteRoute(int routeId) {
		Optional<Route> opt=routeRepository.findById(routeId);
		if(opt.isPresent()) {
			Route r=opt.get();
			routeRepository.delete(r);
			return r;
		}
		return null;
	}

	@Override
	public Route viewRoute(int routeId) {
		Optional<Route> opt=routeRepository.findById(routeId);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Route> viewAllRoute() {
		
		return routeRepository.findAll();
	}

}
