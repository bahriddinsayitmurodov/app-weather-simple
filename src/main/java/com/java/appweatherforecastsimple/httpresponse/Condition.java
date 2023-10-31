package com.java.appweatherforecastsimple.httpresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Condition{

	@JsonProperty("code")
	private Integer code;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("text")
	private String text;

}