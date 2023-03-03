package org.hit.controller;

import java.util.List;

import org.hit.model.Route;
import org.hit.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/route")
public class RouteController {
	
	@Autowired
	private RouteService routeService;
	
	@GetMapping("/addroute")
	public String addRoute(Model model) {
		Route route=new Route();
		model.addAttribute("route",route);
		return "route/addroute";
	}
	
	@PostMapping("/addrouteprocess")
	public String addRouteProcess(@ModelAttribute("route")Route route) {
		Route r=routeService.addRoute(route);
		if(r.getDistance() == null) {
			return "route/routeaddunsuccess";
		}else {
			return "route/routeaddsuccess";
		}
		
	}
	
	
	@GetMapping("/modifyroute")
	public String modifyRoute(Model model) {
		Route route=new Route();
		model.addAttribute("route", route);
		return "route/modifyroute";
	}
	
	@GetMapping("/routesearchformodification")
	public String searchRouteForModification(@ModelAttribute("route")Route route,Model model) {
		Route r = routeService.viewRoute(route.getRouteId());
		if(r==null) {
			return "route/routenotfound";
		}
		else {
			model.addAttribute("route",r);
			return "route/routemodifysearch";
		}
	}
	
	@PostMapping("/modifyrouteprocess")
	public String modifyRouteProcess(@ModelAttribute("route")Route route) {
		Route r=routeService.updateRoute(route);
		if(r==null) {
			return "route/routemodificationunsuccess";
		}
		else {
			return "route/routemodificationsuccess";
		}
	}
	
	
	@GetMapping("/deleteroute")
	public String deleteRoute(Model model) {
		Route route=new Route();
		model.addAttribute("route", route);
		return "route/deleteroute";
	}
	
	@GetMapping("/routesearchfordeletion")
	public String routeSearchForDeletion(@ModelAttribute("route")Route route,Model model) {
		Route r=routeService.viewRoute(route.getRouteId());
		
		if(r==null) {
			return "route/routenotfound";
		}
		else {
			model.addAttribute("route",r);
			return "route/routedeletesearch";
		}
	}
	
	@PostMapping("/deleterouteprocess")
	public String deleteRouteProcess(@ModelAttribute("route")Route route) {
		Route r=routeService.deleteRoute(route.getRouteId());
		if(r==null) {
			return "route/routedeletionunsuccess";
		}
		else {
			return "route/routedeletionsuccess";
		}
	}
	
	
	@GetMapping("/displayroutebyidindividual")
	public String displayRouteByIdIndividual(Model model) {
		Route route=new Route();
		model.addAttribute("route", route);
		return "route/searchroutebyid";
		
	}
	
	
	@GetMapping("/routesearchbyid")
	public String routeSearchById(@ModelAttribute("route")Route route,Model model) {
		Route r=routeService.viewRoute(route.getRouteId());
		
		if(r==null) {
			return "route/routenotfound";
		}
		else {
			model.addAttribute("route",r);
			return "route/displayroutebyid";
		}
	}
	
	
	
	
	@GetMapping("/listallroutes")
	public String listAllRoutes(Model model) {
		List<Route> route=routeService.viewAllRoute();
		model.addAttribute("routes", route);
		return "route/listallroutes";
	}
	
	
	
	
	@GetMapping("/displayroutebyid")
	public String displayRouteById(@RequestParam("routeId") Integer routeId, Model model) {
		Route route=routeService.viewRoute(routeId);
		model.addAttribute("route", route);
		return "route/displayroutebyid";
		
	}
	
	
	@GetMapping("delroutefromall")
	public String deleteRouteFromAll(@RequestParam("routeId")Integer routeId,Model model){
		Route r=routeService.viewRoute(routeId);
		if(r==null) {
			return "route/routenotfound";
		}
		model.addAttribute("route", r);
		return "route/routedeletesearch";
	}
	
	
	
	

}
