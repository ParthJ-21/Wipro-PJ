package com.wipro.SpringBootdemo.repo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.SpringBootdemo.Service.CityService;

@Controller
@RequestMapping("/city")
public class CityController {
	@Autowired
	CityService cityservice;
	@GetMapping("/list")
	String getCityList(Model m) {
		m.addAttribute("citylist", cityservice.getCityList());
		return "cityList";
	}
}
