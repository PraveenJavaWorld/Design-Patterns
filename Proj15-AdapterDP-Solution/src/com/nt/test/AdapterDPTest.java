package com.nt.test;

import com.nt.external.IWeatherReportComp;
import com.nt.external.WeatherReportCompImpl;

public class AdapterDPTest {

	public static void main(String[] args) {
		
		IWeatherReportComp comp = WeatherReportCompImpl.getInstance();
		System.out.println("Weather in HYD is :: "+comp.getTemperature(1002));

	}

}
