package com.example.weatherapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city,
                             @RequestParam String day) {
        String weather = "cloudy"; // static example
        return String.format("Weather in %s for %s is %s.", city, day, weather);
    }
}
