package com.java.appweatherforecastsimple.test;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastdayItem{

	@JsonProperty("date")
	private String date;

	@JsonProperty("astro")
	private Astro astro;

	@JsonProperty("date_epoch")
	private Integer dateEpoch;

	@JsonProperty("hour")
	private List<HourItem> hour;

	@JsonProperty("day")
	private Day day;
}