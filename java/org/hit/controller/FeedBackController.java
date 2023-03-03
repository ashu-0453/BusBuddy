package org.hit.controller;

import java.util.List;

import org.hit.model.FeedBack;
import org.hit.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/feedback")
public class FeedBackController {

	@Autowired
	private FeedBackService feedBackService;
	
	@GetMapping("/addfeedback")
	public String addFeedBack(Model model) {
		FeedBack feedBack=new FeedBack();
		model.addAttribute("feedBack",feedBack);
		return "feedBack/addfeedBack";
	}
	
	@PostMapping("/addfeedbackprocess")
	public String addFeedBackProcess(@ModelAttribute("feedBack")FeedBack feedBack) {
		FeedBack r=feedBackService.addFeedBack(feedBack);
		if(r.getDriverRating() == null) {
			return "feedBack/feedBackaddunsuccess";
		}else {
			return "feedBack/feedBackaddsuccess";
		}
		
	}
	
	
	
	@GetMapping("/modifyfeedBack")
	public String modifyFeedBack(Model model) {
		FeedBack feedBack=new FeedBack();
		model.addAttribute("feedBack", feedBack);
		return "feedBack/modifyfeedBack";
	}
	
	
	@GetMapping("/feedBacksearchformodification")
	public String searchFeedBackForModification(@ModelAttribute("feedBack")FeedBack feedBack,Model model) {
		FeedBack f = feedBackService.viewFeedBack(feedBack.getFeedBackId());
		if(f==null) {
			return "feedBack/feedBacknotfound";
		}
		else {
			model.addAttribute("feedBack",f);
			return "feedBack/feedBackmodifysearch";
		}
	}
	
	@PostMapping("/modifyfeedBackprocess")
	public String modifyFeedBackProcess(@ModelAttribute("feedBack")FeedBack feedBack) {
		FeedBack f=feedBackService.updateFeedBack(feedBack);
		if(f==null) {
			return "feedBack/feedBackmodificationunsuccess";
		}
		else {
			return "feedBack/feedBackmodificationsuccess";
		}
	}
	
	@GetMapping("/deletefeedback")
	public String deleteFeedBack(Model model) {
		FeedBack feedBack=new FeedBack();
		model.addAttribute("feedBack", feedBack);
		return "feedBack/deletefeedBack";
	}
	
	@GetMapping("/feedbacksearchfordeletion")
	public String feedBackSearchForDeletion(@ModelAttribute("feedBack")FeedBack feedBack,Model model) {
		FeedBack r=feedBackService.viewFeedBack(feedBack.getFeedBackId());
		
		if(r==null) {
			return "feedBack/feedBacknotfound";
		}
		else {
			model.addAttribute("feedBack",r);
			return "feedBack/feedBackdeletesearch";
		}
	}
	
	@PostMapping("/deletefeedbackprocess")
	public String deleteFeedBackProcess(@ModelAttribute("feedBack")FeedBack feedBack) {
		FeedBack r=feedBackService.deleteFeedBack(feedBack.getFeedBackId());
		if(r==null) {
			return "feedBack/feedBackdeletionunsuccess";
		}
		else {
			return "feedBack/feedBackdeletionsuccess";
		}
	}
	
	
	@GetMapping("/displayfeedbackbyidindividual")
	public String displayFeedBackByIdIndividual(Model model) {
		FeedBack feedBack=new FeedBack();
		model.addAttribute("feedBack", feedBack);
		return "feedBack/searchfeedBackbyid";
		
	}
	
	
	@GetMapping("/feedbacksearchbyid")
	public String feedBackSearchById(@ModelAttribute("feedBack")FeedBack feedBack,Model model) {
		FeedBack f=feedBackService.viewFeedBack(feedBack.getFeedBackId());
		
		if(f==null) {
			return "feedBack/feedBacknotfound";
		}
		else {
			model.addAttribute("feedBack",f);
			return "feedBack/displayfeedBackbyid";
		}
	}
	
	@GetMapping("/listallfeedbacks")
	public String listAllFeedBacks(Model model) {
		List<FeedBack> feedBack=feedBackService.viewAllFeedBack();
		model.addAttribute("feedBacks", feedBack);
		return "feedBack/listallfeedBacks";
	}
	
	@GetMapping("delfeedbackfromall")
	public String deleteFeedBackFromAll(@RequestParam("feedBackId")Integer feedBackId,Model model){
		FeedBack f=feedBackService.viewFeedBack(feedBackId);
		if(f==null) {
			return "feedBack/feedBacknotfound";
		}
		model.addAttribute("feedBack", f);
		return "feedBack/feedBackdeletesearch";
	}
	
	
	
}
