package org.hit.service;

import java.time.LocalDate;
import java.util.List;

import org.hit.model.Reservation;

public interface ReservationService {
	public Reservation addReservation(Reservation reservation);
	public Reservation updateReservation(Reservation reservation);
	public Reservation deleteReservation(int reservationId);
	public Reservation viewReservation(int reservationId);
	public List<Reservation> viewAllReservation();
	public List<Reservation> getAllReservation(LocalDate date);


}
