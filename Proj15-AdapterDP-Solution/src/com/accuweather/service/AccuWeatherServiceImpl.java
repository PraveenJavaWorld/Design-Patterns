package com.accuweather.service;

import java.text.DecimalFormat;

import com.accuweather.adapter.WeatherReportCompAdapter;

public class AccuWeatherServiceImpl implements AccuWeatherService {

	@Override
	public String showTemperature(String cityName) {
		//use Adapter
		WeatherReportCompAdapter adp = new WeatherReportCompAdapter();
		double temp = adp.fetchTemperature(cityName);
		DecimalFormat df = new DecimalFormat("0.00");
		return "Temperature in City " +cityName+" is :: "+df.format(temp)+" celsius";
	}

}
