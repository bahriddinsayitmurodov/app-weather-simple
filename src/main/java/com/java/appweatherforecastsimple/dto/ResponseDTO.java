package com.java.appweatherforecastsimple.dto;

import com.java.appweatherforecastsimple.httpresponse.Condition;
import com.java.appweatherforecastsimple.httpresponse.Location;
import lombok.Builder;

@Builder
public record  ResponseDTO(
        Location location,
        String lastUpdated,
        Condition condition,
        Object temperatureCel,
        Object temperatureF,
        Object windKph,
        Integer humidity,
        Object visKm,
        Object pressureMb,
        String icon) {

}
