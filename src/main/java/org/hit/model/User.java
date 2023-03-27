package org.hit.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer userLoginid;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Long contact;
    private String email;

    
	public User() {
		
	}
//	public Reservation getReservation() {
//		return reservation;
//	}
//	public void setReservation(Reservation reservation) {
//		this.reservation = reservation;
//	}
	
	public User(String username, String password, String firstName, String lastName, Long contact,
			String email) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.email = email;
	}
	
	public Integer getUserLoginid() {
		return userLoginid;
	}
	public void setUserLoginid(Integer userLoginid) {
		this.userLoginid = userLoginid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userLoginid=" + userLoginid + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", contact=" + contact + ", email=" + email + "]";
	}
	
	
	
    
    

}
