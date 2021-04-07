package com.accuweather.adapter;

import com.nt.external.IWeatherReportComp;
import com.nt.external.WeatherReportCompImpl;

public class WeatherReportCompAdapter {
	
	public double fetchTemperature(String cityName) {
		int cityCode = 0;
		if(cityName.equalsIgnoreCase("HYD"))
			cityCode = 1001;
		else if(cityName.equalsIgnoreCase("Mumbai"))
			cityCode = 1002;
		else if(cityName.equalsIgnoreCase("Bangalore"))
			cityCode = 1003;
		else if(cityName.equalsIgnoreCase("Chennai"))
			cityCode = 1004;
		else
			throw new IllegalArgumentException("Invalid City Name");
		//get External Comp obj
		IWeatherReportComp comp = WeatherReportCompImpl.getInstance();
		//call b.method
		double temp = comp.getTemperature(cityCode);
		//convert fahrenheit tio celsius
		temp = ((temp-32)*5)/9;
		return temp;
	}

}
