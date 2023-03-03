package org.hit.service;

import java.util.List;

import org.hit.model.User;

public interface UserService {

	public User addUser(User user);
    public User updateUser(User user);
    public User deleteUser(int userid);
    public User viewUser(int userid);
    public List<User> viewAll();
}
