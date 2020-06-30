package com.assignment.weatherapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class WeatherDTO {
    private String city;
    private String weather;
    private float temperature;
    private float windSpeed;
}
