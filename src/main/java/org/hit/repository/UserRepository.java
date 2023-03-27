package org.hit.repository;

import java.util.Optional;

import org.hit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
	public Optional<User> findByUsernameAndPassword(String username,String password);
	
	

}
