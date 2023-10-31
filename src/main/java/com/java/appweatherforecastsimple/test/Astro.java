package com.java.appweatherforecastsimple.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Astro{

	@JsonProperty("moonset")
	private String moonset;

	@JsonProperty("moon_illumination")
	private Integer moonIllumination;

	@JsonProperty("sunrise")
	private String sunrise;

	@JsonProperty("moon_phase")
	private String moonPhase;

	@JsonProperty("sunset")
	private String sunset;

	@JsonProperty("is_moon_up")
	private Integer isMoonUp;

	@JsonProperty("is_sun_up")
	private Integer isSunUp;

	@JsonProperty("moonrise")
	private String moonrise;
}