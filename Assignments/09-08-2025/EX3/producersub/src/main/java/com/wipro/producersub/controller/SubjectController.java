package com.wipro.producersub.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.producersub.service.SubjectService;



@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	SubjectService stockService;
	
	@PostMapping
	public String sendStockData(@RequestParam String subjectName)
	{	
		
		 SubjectService.sendSubjectName(subjectName);
		 return "Subject is:"+subjectName;
	}
}
