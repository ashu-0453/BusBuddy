package org.hit.controller;

import java.util.List;

import org.hit.dto.LoginToken;
import org.hit.model.User;
import org.hit.service.UserService;
import org.hit.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/login")
@SessionAttributes("userid")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserServiceImpl loginService;
	
	
	
	@GetMapping
	public String login(Model model) {
		LoginToken token = new LoginToken();
		model.addAttribute("logintoken", token);
		return "login";
	}
	
	@PostMapping
	public String checkLogin(@ModelAttribute("logintoken") LoginToken token,Model model) {
		User user = loginService.checkLogin(token);
		if(user != null) {
			model.addAttribute("userid", user.getUserLoginid());
			return "loginsuccess";
		}else {
			return "loginunsuccess";
		}
	}
	
	
//	@GetMapping("/checkloggedin")
//	public String checkloggedin(Model model) {
//		Integer userid = (Integer) model.getAttribute("userid");
//		User user = loginService.getUserByUserId(userid);
//		model.addAttribute("user",user);
//		return "login/displayuser";
//	}
	
	
	
	
	
	@GetMapping("/adduser")
	public String addUser(Model model) {
		User user=new User();
		//user.setReservation(new Reservation());
		model.addAttribute("user", user);
		return "user/adduser";		
	}
	
	@PostMapping("/adduserprocess")
	public String addUserProcess(@ModelAttribute("user")User user) {
		User u=userService.addUser(user);
		if(u.getContact() == null) {
			return "user/useraddunsuccess";
		}else {
			return "user/useraddsuccess";
		}
		
	}
	
	@GetMapping("/modifyuser")
	public String modifyUser(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "user/modifyuser";
	}
	
	@GetMapping("/usersearchformodification")
	public String searchUserForModification(@ModelAttribute("user")User user,Model model) {
		User u=userService.viewUser(user.getUserLoginid());
		if(u==null) {
			return "user/usernotfound";
		}
		else {
			model.addAttribute("user",u);
			return "user/usermodifysearch";
		}
	}
	
	@PostMapping("/modifyuserprocess")
	public String modifyuserprocess(@ModelAttribute("user")User user) {
		User u=userService.updateUser(user);
		if(u==null) {
			return "user/usermodificationunsuccess";
		}
		else {
			return "user/usermodificationsuccess";
		}
	}
	
	@GetMapping("/deleteuser")
	public String deleteUser(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "user/deleteuser";
	}
	
	
	@GetMapping("deluserfromall")
	public String deleteUserFromAll(@RequestParam("userLoginid")Integer userLoginid,Model model){
		User u=userService.viewUser(userLoginid);
		if(u==null) {
			return "user/usernotfound";
		}
		model.addAttribute("user", u);
		return "user/userdeletesearch";
	}
	
	@GetMapping("/usersearchfordeletion")
	public String usersearchfordeletion(@ModelAttribute("user")User user,Model model) {
		User u=userService.viewUser(user.getUserLoginid());
		
		//System.out.println(user.getUserLoginid());
		//System.out.println(u);
		
		if(u==null) {
			return "user/usernotfound";
		}
		else {
			model.addAttribute("user", u);
			return "user/userdeletesearch";
		}
	}
	
	@PostMapping("/deleteuserprocess")
	public String deleteUserProcess(@ModelAttribute("user")User user) {
		User u=userService.deleteUser(user.getUserLoginid());
		if(u==null) {
			return "user/userdeletionunsuccess";
		}
		else {
			return "user/userdeletionsuccess";
		}
	}
	
	
	
	
	@GetMapping("/listallusers")
	public String listAllUsers(Model model) {
		List<User> list=userService.viewAll();
		model.addAttribute("users", list);
		return "user/listallusers";
	}
	
	
	@GetMapping("/displayuserbyid")
	public String displayUserById(@RequestParam("userLoginid") Integer userLoginid, Model model) {
		User user=userService.viewUser(userLoginid);
		model.addAttribute("user", user);
		return "user/displayuserbyid";
		
	}

	
}
