package com.java.appweatherforecastsimple.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current{

	@JsonProperty("feelslike_c")
	private Object feelslikeC;

	@JsonProperty("uv")
	private Object uv;

	@JsonProperty("last_updated")
	private String lastUpdated;

	@JsonProperty("feelslike_f")
	private Object feelslikeF;

	@JsonProperty("wind_degree")
	private Integer windDegree;

	@JsonProperty("last_updated_epoch")
	private Integer lastUpdatedEpoch;

	@JsonProperty("is_day")
	private Integer isDay;

	@JsonProperty("precip_in")
	private Object precipIn;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("gust_mph")
	private Object gustMph;

	@JsonProperty("temp_c")
	private Object tempC;

	@JsonProperty("pressure_in")
	private Object pressureIn;

	@JsonProperty("gust_kph")
	private Object gustKph;

	@JsonProperty("temp_f")
	private Object tempF;

	@JsonProperty("precip_mm")
	private Object precipMm;

	@JsonProperty("cloud")
	private Integer cloud;

	@JsonProperty("wind_kph")
	private Object windKph;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("wind_mph")
	private Object windMph;

	@JsonProperty("vis_km")
	private Object visKm;

	@JsonProperty("humidity")
	private Integer humidity;

	@JsonProperty("pressure_mb")
	private Object pressureMb;

	@JsonProperty("vis_miles")
	private Object visMiles;
}