package com.example.firstdemomvc.service;

import com.example.firstdemomvc.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<String> getCarList() {
        return carRepository.getCarNames();
    }
}
