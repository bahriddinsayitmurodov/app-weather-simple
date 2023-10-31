package com.java.appweatherforecastsimple.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.appweatherforecastsimple.dto.ResponseDTO;
import com.java.appweatherforecastsimple.httpresponse.Condition;
import com.java.appweatherforecastsimple.httpresponse.Location;
import com.java.appweatherforecastsimple.httpresponse.WeatherResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class WeatherService {

    public ResponseDTO getWeatherResults(String region){

        HttpResponse<String> httpResponse = sendRequest(region);
        return getResponseDTO(httpResponse);
    }
    @Qualifier
    public HttpResponse<String> sendRequest(String region) {
        //https://api.weatherapi.com/v1/current.json?key=6cdf8bccda31453b8f375901232810&q=Tashkent
        final String APIKEY = "6cdf8bccda31453b8f375901232810";
        final String url = "https://api.weatherapi.com/v1/current.json?key="+APIKEY+"&q="+region;

        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url)).GET().build();

            return httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (URISyntaxException | IOException | InterruptedException exception) {
            throw new RuntimeException(exception);
        }

    }

    public ResponseDTO getResponseDTO(HttpResponse<String> httpResponse){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println("httpResponse = " + httpResponse.body());
            WeatherResponse weatherResponse = objectMapper.readValue(httpResponse.body(), WeatherResponse.class);

            Location location = weatherResponse.getLocation();
            String lastUpdated = weatherResponse.getCurrent().getLastUpdated();

            Condition condition = weatherResponse.getCurrent().getCondition(); // sunny

            Object temperatureCel = weatherResponse.getCurrent().getFeelslikeC();
            Object temperatureF = weatherResponse.getCurrent().getFeelslikeF();
            Object windKph = weatherResponse.getCurrent().getWindKph();
            Integer humidity = weatherResponse.getCurrent().getHumidity();
            Object visKm = weatherResponse.getCurrent().getVisKm();
            Object pressureMb = weatherResponse.getCurrent().getPressureMb();
            String icon = weatherResponse.getCurrent().getCondition().getIcon();


            return ResponseDTO.builder()
                    .location(location)
                    .lastUpdated(lastUpdated)
                    .condition(condition)
                    .temperatureCel(temperatureCel)
                    .temperatureF(temperatureF)
                    .windKph(windKph)
                    .humidity(humidity)
                    .visKm(visKm)
                    .pressureMb(pressureMb)
                    .icon(icon)
                    .build();

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}
