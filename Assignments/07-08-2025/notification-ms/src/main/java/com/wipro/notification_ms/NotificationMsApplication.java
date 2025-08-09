package com.wipro.notification_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class NotificationMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationMsApplication.class, args);
	}

}
