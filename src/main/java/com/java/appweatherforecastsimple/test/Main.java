package com.java.appweatherforecastsimple.test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {

        System.out.println(getWeatherResults("tashkent"));

    }

    public static String sendWeather(String city){
        String url = "https://wttr.in/" + city + "?format=4";
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url)).GET().build();

            HttpResponse<String> send = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(send.body());
            return send.body();
        } catch (URISyntaxException | IOException | InterruptedException exception) {
            throw new RuntimeException(exception);
        }

    }



    public static String getWeatherResults(String region) {
         final String APIKEY = "9f535ebcbe2317d2a8acae9a3225f3ae";
        final String url = "https://api.openweathermap.org/data/2.5/weather?q="+region+"&appid="+APIKEY;

        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url)).GET().build();

            HttpResponse<String> send = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            return send.body();

        } catch (URISyntaxException | IOException | InterruptedException exception) {
            throw new RuntimeException(exception);
        }

    }
}

