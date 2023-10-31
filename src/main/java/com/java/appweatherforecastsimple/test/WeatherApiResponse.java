package com.java.appweatherforecastsimple.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherApiResponse{

	@JsonProperty("current")
	private Current current;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("forecast")
	private Forecast forecast;
}