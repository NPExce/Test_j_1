package org.example.services;

import org.example.api.HttpClientService;
import org.example.api.open_weather.CityOwResponse;

public class WeatherService {
	
	public CityOwResponse getWeatherFromOpenWeather() {
		String openWeatherUrl = "https://api.openweathermap.org/data/2.5/weather?appid=716238e6166ce6e1315daf3232959cd3&q=Warsaw&units=metric";
		
		var httpClientService = new HttpClientService<CityOwResponse>();
		final CityOwResponse response = httpClientService.getWeather(openWeatherUrl, CityOwResponse.class);
		
		return response;
	}
	
}
