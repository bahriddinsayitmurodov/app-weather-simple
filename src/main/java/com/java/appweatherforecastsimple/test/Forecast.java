package com.java.appweatherforecastsimple.test;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Forecast{

	@JsonProperty("forecastday")
	private List<ForecastdayItem> forecastday;
}