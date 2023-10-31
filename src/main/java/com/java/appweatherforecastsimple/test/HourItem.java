package com.java.appweatherforecastsimple.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HourItem{

	@JsonProperty("feelslike_c")
	private Object feelslikeC;

	@JsonProperty("feelslike_f")
	private Object feelslikeF;

	@JsonProperty("wind_degree")
	private Integer windDegree;

	@JsonProperty("windchill_f")
	private Object windchillF;

	@JsonProperty("windchill_c")
	private Object windchillC;

	@JsonProperty("temp_c")
	private Object tempC;

	@JsonProperty("temp_f")
	private Object tempF;

	@JsonProperty("cloud")
	private Integer cloud;

	@JsonProperty("wind_kph")
	private Object windKph;

	@JsonProperty("wind_mph")
	private Object windMph;

	@JsonProperty("humidity")
	private Integer humidity;

	@JsonProperty("dewpoint_f")
	private Object dewpointF;

	@JsonProperty("will_it_rain")
	private Integer willItRain;

	@JsonProperty("uv")
	private Object uv;

	@JsonProperty("heatindex_f")
	private Object heatindexF;

	@JsonProperty("dewpoint_c")
	private Object dewpointC;

	@JsonProperty("is_day")
	private Integer isDay;

	@JsonProperty("precip_in")
	private Object precipIn;

	@JsonProperty("heatindex_c")
	private Object heatindexC;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("gust_mph")
	private Object gustMph;

	@JsonProperty("pressure_in")
	private Object pressureIn;

	@JsonProperty("chance_of_rain")
	private Integer chanceOfRain;

	@JsonProperty("gust_kph")
	private Object gustKph;

	@JsonProperty("precip_mm")
	private Object precipMm;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("will_it_snow")
	private Integer willItSnow;

	@JsonProperty("vis_km")
	private Object visKm;

	@JsonProperty("time_epoch")
	private Integer timeEpoch;

	@JsonProperty("time")
	private String time;

	@JsonProperty("chance_of_snow")
	private Integer chanceOfSnow;

	@JsonProperty("pressure_mb")
	private Object pressureMb;

	@JsonProperty("vis_miles")
	private Object visMiles;
}