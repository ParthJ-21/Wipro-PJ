package com.wipro.SpringBootdemo.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class CityRepo {
	public List<String> getCityList()
	{
		return Arrays.asList("Pune","Mumbai","Delhi","Kolkata");
	}
}
