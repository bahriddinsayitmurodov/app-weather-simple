package com.java.appweatherforecastsimple.httpresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Location{

	@JsonProperty("localtime")
	private String localtime;

	@JsonProperty("country")
	private String country;

	@JsonProperty("localtime_epoch")
	private Integer localtimeEpoch;

	@JsonProperty("name")
	private String name;

	@JsonProperty("lon")
	private Object lon;

	@JsonProperty("region")
	private String region;

	@JsonProperty("lat")
	private Object lat;

	@JsonProperty("tz_id")
	private String tzId;

}