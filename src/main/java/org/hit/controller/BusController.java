package org.hit.controller;

import java.time.LocalDate;
import java.util.List;

import org.hit.model.Bus;
import org.hit.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/bus")
public class BusController {
	
	@Autowired
	private BusService busService;
	
	@GetMapping("/addbus")
	public String addBus(Model model) {
		Bus bus=new Bus();
		model.addAttribute("bus",bus);
		return "bus/addbus";
	}
	
	@PostMapping("/addbusprocess")
	public String addBusProcess(@ModelAttribute("bus")Bus bus) {
		Bus b=busService.addBus(bus);
		if(b.getBusName() == null) {
			return "bus/busaddunsuccess";
		}else {
			return "bus/busaddsuccess";
		}
		
	}
	
	
	@GetMapping("/modifybus")
	public String modifyBus(Model model) {
		Bus bus=new Bus();
		model.addAttribute("bus", bus);
		return "bus/modifybus";
	}
	
	@GetMapping("/bussearchformodification")
	public String searchBusForModification(@ModelAttribute("bus")Bus bus,Model model) {
		Bus b = busService.viewBus(bus.getBusId());
		if(b==null) {
			return "bus/busnotfound";
		}
		else {
			model.addAttribute("bus",b);
			return "bus/busmodifysearch";
		}
	}
	
	@PostMapping("/modifybusprocess")
	public String modifyBusProcess(@ModelAttribute("bus")Bus bus) {
		Bus b=busService.updateBus(bus);
		if(b==null) {
			return "bus/busmodificationunsuccess";
		}
		else {
			return "bus/busmodificationsuccess";
		}
	}
	
	@GetMapping("/deletebus")
	public String deleteBus(Model model) {
		Bus bus=new Bus();
		model.addAttribute("bus", bus);
		return "bus/deletebus";
	}
	
	@GetMapping("/bussearchfordeletion")
	public String busSearchForDeletion(@ModelAttribute("bus")Bus bus,Model model) {
		Bus b=busService.viewBus(bus.getBusId());
		
		if(b==null) {
			return "bus/busnotfound";
		}
		else {
			model.addAttribute("bus",b);
			return "bus/busdeletesearch";
		}
	}
	
	@PostMapping("/deletebusprocess")
	public String deleteBusProcess(@ModelAttribute("bus")Bus bus) {
		Bus b=busService.deleteBus(bus.getBusId());
		if(b==null) {
			return "bus/busdeletionunsuccess";
		}
		else {
			return "bus/busdeletionsuccess";
		}
	}
	
	@GetMapping("/displaybusbyid")
	public String displayBusById(Model model) {
		Bus bus=new Bus();
		model.addAttribute("bus", bus);
		return "bus/searchbusbyid";
		
	}
	
	
	@GetMapping("/bussearchbyid")
	public String busSearchById(@ModelAttribute("bus")Bus bus,Model model) {
		Bus b=busService.viewBus(bus.getBusId());
		
		if(b==null) {
			return "bus/busnotfound";
		}
		else {
			model.addAttribute("bus",b);
			return "bus/displaybusbyid";
		}
	}
	
	@GetMapping("/findbus")
	public String findbytype(Model model) {
		Bus bus=new Bus();
		model.addAttribute("bus", bus);
		return "bus/findbus";
	}
	
	@GetMapping("/listbusbytype")
	public String getBusByType(@RequestParam("busType")String busType,Model model) {
		List<Bus> bus=busService.viewBusByType(busType);
		if(bus==null) {
			return "bus/busnotfound";
		}
		else {
			model.addAttribute("buses",bus);
		    return "bus/listbusbytype";
		}
	}
	
	@GetMapping("/listallbuses")
	public String listAllBuses(Model model) {
		List<Bus> bus=busService.viewAllBus();
		model.addAttribute("buses", bus);
		return "bus/listallbuses";
	}
	
	
	@GetMapping("/displaybusbyidinall")
	public String displayBusByIdInAll(@RequestParam("busId") Integer busId, Model model) {
		Bus bus=busService.viewBus(busId);
		model.addAttribute("bus", bus);
		return "bus/displaybusbyid";
		
	}
	
	
	@GetMapping("delbusfromall")
	public String deleteBusFromAll(@RequestParam("busId")Integer busId,Model model){
		Bus b=busService.viewBus(busId);
		if(b==null) {
			return "bus/busnotfound";
		}
		model.addAttribute("bus", b);
		return "bus/busdeletesearch";
	}
	
	@GetMapping("/listbusbysourcedestinationanddate")
	public String getBusBySourceDestinationAndDate(@RequestParam("routeFrom")String routeFrom,@RequestParam("routeTo")String routeTo,@RequestParam("busDate")LocalDate busDate,Model model) {
		List<Bus> bus=busService.viewBusBySourceDestinationAndDate(routeFrom, routeTo, busDate);
		
		System.out.print(bus);
		
		if(bus==null) {
			return "bus/busnotfound";
		}
		else {
			model.addAttribute("buses",bus);
		    return "bus/listbusbysdd";
		}
		
	}
	
	
	
	
}
