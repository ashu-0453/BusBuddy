package org.hit.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FeedBack {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer feedBackId;
	private Integer driverRating;
	private Integer serviceRating;
	private Integer overallRating;
	private String comments;
	private LocalDate feedBackdate;
//	private User users;
//	private Bus bus; 
	public FeedBack() {
		
	}
	public FeedBack(Integer driverRating, Integer serviceRating, Integer overallRating, String comments,
			LocalDate feedbackdate, User users, Bus bus) {
		super();
		this.driverRating = driverRating;
		this.serviceRating = serviceRating;
		this.overallRating = overallRating;
		this.comments = comments;
		this.feedBackdate = feedbackdate;
//		this.users = users;
//		this.bus = bus;
	}
	public Integer getFeedBackId() {
		return feedBackId;
	}
	public void setFeedBackId(Integer feedBackId) {
		this.feedBackId = feedBackId;
	}
	public Integer getDriverRating() {
		return driverRating;
	}
	public void setDriverRating(Integer driverRating) {
		this.driverRating = driverRating;
	}
	public Integer getServiceRating() {
		return serviceRating;
	}
	public void setServiceRating(Integer serviceRating) {
		this.serviceRating = serviceRating;
	}
	public Integer getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(Integer overallRating) {
		this.overallRating = overallRating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public LocalDate getFeedBackdate() {
		return feedBackdate;
	}
	public void setFeedBackdate(LocalDate feedBackdate) {
		this.feedBackdate = feedBackdate;
	}
	
	
//	public User getUsers() {
//		return users;
//	}
//	public void setUsers(User users) {
//		this.users = users;
//	}
//	public Bus getBus() {
//		return bus;
//	}
//	public void setBus(Bus bus) {
//		this.bus = bus;
//	}
	
	
	
	
	
	
	
	

}
