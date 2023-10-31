package com.java.appweatherforecastsimple.controller;

import com.java.appweatherforecastsimple.dto.ResponseDTO;
import com.java.appweatherforecastsimple.enums.Regions;
import com.java.appweatherforecastsimple.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/")
    public String homePage(Model model){

        List<String> regions = Arrays.stream(Regions.values()).map(Enum::toString).toList();
        model.addAttribute("regions", regions);

        return "weather";
    }

    @GetMapping("/weather")
    public String showWeather(@RequestParam String reg, Model model){
        System.out.println("region = " + reg);
        ResponseDTO weatherResults = weatherService.getWeatherResults(reg);
        model.addAttribute("results",weatherResults);
        return "weather";
    }
}
