package com.wipro.producersub.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.producersub.model.Subject;
import com.wipro.producersub.service.SubjectService;
@Service
public class SubjectImpl implements SubjectService {
	@Autowired
	KafkaTemplate<String,Subject> kafkTemplate;
	@Autowired
	String topic = "learn-subject";

	

	@Override
	public void sendSubjectName(String subjectName) {
		kafkTemplate.send(topic, subjectName);
        System.out.println("Sent message: " + subjectName);
		
	}
}
