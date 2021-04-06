package com.nt.external;

public class WeatherReportCompImpl implements IWeatherReportComp {
	
	private static IWeatherReportComp INSTANCE;
	
	private WeatherReportCompImpl() {
		// no code
	}
	
	//static factory method
	public static IWeatherReportComp getInstance() {
		if(INSTANCE==null)
			INSTANCE = new WeatherReportCompImpl();
		return INSTANCE;
	}

	@Override
	public double getTemperature(int cityCode) {
		double temp;
		if(cityCode==1001)
			temp = Math.random()*100.0;
		else if(cityCode==1002)
			temp = Math.random()*100.0;
		else if(cityCode==1003)
			temp = Math.random()*100.0;
		else if(cityCode==1004)
			temp = Math.random()*100.0;
		else
			throw new IllegalArgumentException("Invalid Inputs");
		return temp;
	}

}
