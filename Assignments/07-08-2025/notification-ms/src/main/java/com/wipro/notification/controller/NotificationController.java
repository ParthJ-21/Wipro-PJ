package com.wipro.notification.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.notificatio_ms.dto.Action;



@RestController
public class NotificationController {
	 @PostMapping("/notify")
	    public ResponseEntity<String> notify(@RequestBody Action dto) {
	        String username = dto.getUser().getUsername();
	        String action = dto.getAction();
	        System.out.println("User " + username + " is " + action);
	        return ResponseEntity.ok("Notification processed");
	 }
}
