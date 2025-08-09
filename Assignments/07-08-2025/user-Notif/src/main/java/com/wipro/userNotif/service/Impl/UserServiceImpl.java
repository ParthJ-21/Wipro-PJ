package com.wipro.userNotif.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.userNotif.Entity.User;
import com.wipro.userNotif.dto.Notification;
import com.wipro.userNotif.repo.UserRepo;
import com.wipro.userNotif.service.NotificationConnectService;
import com.wipro.userNotif.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService  {
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	NotificationConnectService notificationConnectService;
	private static final String NOTIFICATION_URL = "http://localhost:8082/notify";
	@Override
	@CircuitBreaker(name="user-cb" , fallbackMethod="handleFallBack")
	public
	User createUser(User user) {
        User savedUser = userRepo.save(user);
        notifyChange(savedUser, "Created");
        return savedUser;
    }

    @Override
	public
    User updateUser(Integer id, User user) {
        user.setId(id); // Ensure correct ID is set
        User updatedUser = userRepo.save(user);
        notifyChange(updatedUser, "Updated");
        return updatedUser;
    }

    @Override
    public void deleteUser(Integer id) {
        User existingUser = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
        userRepo.delete(existingUser);
        notifyChange(existingUser, "Deleted");
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    private void notifyChange(User user, String action) {
        Notification dto = new Notification(user, action);
        restTemplate.postForObject(NOTIFICATION_URL, dto, String.class);
    }

}