package org.hit.repository;

import java.time.LocalDate;
import java.util.List;

import org.hit.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Integer> {
	public List<Bus> findByBusType(String busType);
	public List<Bus> findByRouteFromAndRouteToAndBusDate(String routeFrom, String routeTo, LocalDate busDate);
}
