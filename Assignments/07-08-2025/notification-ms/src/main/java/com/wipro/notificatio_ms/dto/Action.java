package com.wipro.notificatio_ms.dto;

import com.wipro.notificatio_ms.entity.Notify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Action {
	private Notify user;
    private String action;
}
