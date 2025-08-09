package com.wipro.userNotif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wipro.userNotif")
public class UserNotifApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserNotifApplication.class, args);
	}

}
