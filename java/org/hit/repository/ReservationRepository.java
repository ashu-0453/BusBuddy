package org.hit.repository;

import java.time.LocalDate;
import java.util.List;


import org.hit.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
	public List<Reservation> findByReservationDate(LocalDate date);

}
