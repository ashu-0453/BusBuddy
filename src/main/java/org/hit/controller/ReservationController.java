package org.hit.controller;

import java.time.LocalDate;
import java.util.List;

import org.hit.model.Reservation;
import org.hit.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/addreservation")
	public String addReservation(Model model) {
		Reservation reservation=new Reservation();
		model.addAttribute("reservation",reservation);
		return "reservation/addreservation";
	}
	
	@PostMapping("/addreservationprocess")
	public String addReservationProcess(@ModelAttribute("reservation")Reservation reservation) {
		Reservation r=reservationService.addReservation(reservation);
		if(r.getSource() == null) {
			return "reservation/reservationaddunsuccess";
		}else {
			return "reservation/reservationaddsuccess";
		}
		
	}
	
	@GetMapping("/modifyreservation")
	public String modifyReservation(Model model) {
		Reservation reservation=new Reservation();
		model.addAttribute("reservation", reservation);
		return "reservation/modifyreservation";
	}
	
	@GetMapping("/reservationsearchformodification")
	public String searchReservationForModification(@ModelAttribute("reservation")Reservation reservation,Model model) {
		Reservation r = reservationService.viewReservation(reservation.getReservationId());
		if(r==null) {
			return "reservation/reservationnotfound";
		}
		else {
			model.addAttribute("reservation",r);
			return "reservation/reservationmodifysearch";
		}
	}
	
	@PostMapping("/modifyreservationprocess")
	public String modifyReservationProcess(@ModelAttribute("reservation")Reservation reservation) {
		Reservation r=reservationService.updateReservation(reservation);
		if(r==null) {
			return "reservation/reservationmodificationunsuccess";
		}
		else {
			return "reservation/reservationmodificationsuccess";
		}
	}
	
	
	
	
	@GetMapping("/deletereservation")
	public String deleteReservation(Model model) {
		Reservation reservation=new Reservation();
		model.addAttribute("reservation", reservation);
		return "reservation/deletereservation";
	}
	

	@GetMapping("delreservationfromall")
	public String deleteReservationFromAll(@RequestParam("reservationId")Integer reservationId,Model model){
		Reservation r=reservationService.viewReservation(reservationId);
		if(r==null) {
			return "reservation/reservationnotfound";
		}
		model.addAttribute("reservation", r);
		return "reservation/reservationdeletesearch";
	}

	
	@GetMapping("/reservationsearchfordeletion")
	public String reservationSearchForDeletion(@ModelAttribute("reservation")Reservation reservation,Model model) {
		Reservation r=reservationService.viewReservation(reservation.getReservationId());
		
		if(r==null) {
			return "reservation/reservationnotfound";
		}
		else {
			model.addAttribute("reservation",r);
			return "reservation/reservationdeletesearch";
		}
	}
	
	@PostMapping("/deletereservationprocess")
	public String deleteReservationProcess(@ModelAttribute("reservation")Reservation reservation) {
		Reservation r=reservationService.deleteReservation(reservation.getReservationId());
		if(r==null) {
			return "reservation/reservationdeletionunsuccess";
		}
		else {
			return "reservation/reservationdeletionsuccess";
		}
	}
	
	@GetMapping("/listallreservations")
	public String listAllReservations(Model model) {
		List<Reservation> reservation=reservationService.viewAllReservation();
		model.addAttribute("reservations", reservation);
		return "reservation/listallreservations";
	}
	
	
	
	@GetMapping("/displayreservationbyid")
	public String displayReservationById(@RequestParam("reservationId") Integer reservationId, Model model) {
		Reservation reservation=reservationService.viewReservation(reservationId);
		model.addAttribute("reservation", reservation);
		return "reservation/displayreservationbyid";
		
	}
	
	
	
	
	@GetMapping("/findreservation")
	public String findbydate(Model model) {
		Reservation reservation=new Reservation();
		model.addAttribute("reservation", reservation);
		return "reservation/findreservation";
	}
	
	@GetMapping("/listbydate")
	public String getReservationByDate(@RequestParam("reservationDate")LocalDate reservationDate,Model model) {
		List<Reservation> reservation=reservationService.getAllReservation(reservationDate);
		model.addAttribute("reservations",reservation);
		return "reservation/listreservationbydate";
		
	}
	
}
