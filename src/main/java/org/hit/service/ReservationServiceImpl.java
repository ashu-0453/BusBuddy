package org.hit.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.hit.model.Reservation;
import org.hit.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;
	
	@Override
	public Reservation addReservation(Reservation reservation) {
		
		return reservationRepository.save(reservation);
	}

	@Override
	public Reservation updateReservation(Reservation reservation) {
		
		return reservationRepository.save(reservation);
	}

	@Override
	public Reservation deleteReservation(int reservationId) {
		Optional<Reservation> opt=reservationRepository.findById(reservationId);
		if(opt.isPresent()) {
			Reservation r =opt.get();
			reservationRepository.delete(r);
			return r;
		}
		return null;
	}

	@Override
	public Reservation viewReservation(int reservationId) {
		Optional<Reservation> opt=reservationRepository.findById(reservationId);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Reservation> viewAllReservation() {
		return reservationRepository.findAll();
	}

	@Override
	public List<Reservation> getAllReservation(LocalDate date) {
		
		return reservationRepository.findByReservationDate(date);
	}

}
