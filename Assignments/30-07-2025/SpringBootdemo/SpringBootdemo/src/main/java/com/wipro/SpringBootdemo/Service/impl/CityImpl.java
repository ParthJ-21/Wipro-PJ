package com.wipro.SpringBootdemo.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.SpringBootdemo.Service.CityService;
import com.wipro.SpringBootdemo.repo.CityRepo;


@Service
public class CityImpl implements CityService {
	@Autowired
	CityRepo cr ;
	@Override
	public List<String> getCityList() {
		// TODO Auto-generated method stub
		return cr.getCityList();
	}
	
}
