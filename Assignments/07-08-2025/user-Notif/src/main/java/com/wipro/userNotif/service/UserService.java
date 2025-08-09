package com.wipro.userNotif.service;
import java.util.List;

import com.wipro.userNotif.Entity.User;


public interface UserService {
	User createUser(User user);
    User updateUser(Integer id, User user);
    List<User> getAllUsers();
	void deleteUser(Integer id);
}
