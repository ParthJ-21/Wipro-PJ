package com.example.firstdemomvc.repository;

import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarRepositoryImpl implements CarRepository {
    @Override
    public List<String> getCarNames() {
        return Arrays.asList("Audi", "Mercedes", "BMW");
    }
}
