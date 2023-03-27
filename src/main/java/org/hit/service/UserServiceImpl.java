package org.hit.service;

import java.util.List;
import java.util.Optional;

import org.hit.dto.LoginToken;
import org.hit.model.User;
import org.hit.repository.ReservationRepository;
import org.hit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Override
	public User addUser(User user) {
//		reservationRepository.save(user.getReservation());
		return userRepository.save(user);
	}
	
	
	public User checkLogin(LoginToken loginToken) {
		Optional<User> userOpt=userRepository.findByUsernameAndPassword(loginToken.getUsername(), loginToken.getPassword());
		if(userOpt.isPresent()) {
			return userOpt.get();
		}
		else
		return null;
	}
	
	
	public User getUserByUserId(Integer userLoginid) {
		Optional<User> userOpt=userRepository.findById(userLoginid);
		if(userOpt.isPresent()) {
			return userOpt.get();
		}
		else
		return null;
		
	}


	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User deleteUser(int userid) {
		Optional<User> opt=userRepository.findById(userid);
        if(opt.isPresent()){
            User u=opt.get();
            userRepository.delete(u);
            return u;
        }
        return null;
	}
	
	
	
	@Override
	public User viewUser(int userid) {
		Optional<User> opt=userRepository.findById(userid);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	
	@Override
	public List<User> viewAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
