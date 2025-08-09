package com.wipro.userNotif.service;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.userNotif.dto.Notification;


@Service
@FeignClient(name="notification-ms")
public interface NotificationConnectService {
	@PostMapping("/notification")
	ResponseEntity<Notification> savePaymentData(@RequestBody Notification noti);
}
