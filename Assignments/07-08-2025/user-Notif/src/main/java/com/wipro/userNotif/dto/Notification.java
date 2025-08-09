package com.wipro.userNotif.dto;
import com.wipro.userNotif.Entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
	private User user;
    private String action;
}
