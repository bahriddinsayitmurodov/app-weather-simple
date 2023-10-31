package com.java.appweatherforecastsimple.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Day{

	@JsonProperty("avgvis_km")
	private Object avgvisKm;

	@JsonProperty("uv")
	private Object uv;

	@JsonProperty("avgtemp_f")
	private Object avgtempF;

	@JsonProperty("avgtemp_c")
	private Object avgtempC;

	@JsonProperty("daily_chance_of_snow")
	private Integer dailyChanceOfSnow;

	@JsonProperty("maxtemp_c")
	private Object maxtempC;

	@JsonProperty("maxtemp_f")
	private Object maxtempF;

	@JsonProperty("mintemp_c")
	private Object mintempC;

	@JsonProperty("avgvis_miles")
	private Object avgvisMiles;

	@JsonProperty("daily_will_it_rain")
	private Integer dailyWillItRain;

	@JsonProperty("mintemp_f")
	private Object mintempF;

	@JsonProperty("totalprecip_in")
	private Object totalprecipIn;

	@JsonProperty("totalsnow_cm")
	private Object totalsnowCm;

	@JsonProperty("avghumidity")
	private Object avghumidity;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("maxwind_kph")
	private Object maxwindKph;

	@JsonProperty("maxwind_mph")
	private Object maxwindMph;

	@JsonProperty("daily_chance_of_rain")
	private Integer dailyChanceOfRain;

	@JsonProperty("totalprecip_mm")
	private Object totalprecipMm;

	@JsonProperty("daily_will_it_snow")
	private Integer dailyWillItSnow;
}