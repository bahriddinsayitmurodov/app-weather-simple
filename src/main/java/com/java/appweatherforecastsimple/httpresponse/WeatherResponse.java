package com.java.appweatherforecastsimple.httpresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class WeatherResponse{

	@JsonProperty("current")
	private Current current;

	@JsonProperty("location")
	private Location location;

}