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
			temp = 100-Math.random();
		else if(cityCode==1002)
			temp = 101-Math.random();
		else if(cityCode==1003)
			temp = 102-Math.random();
		else if(cityCode==1004)
			temp = 103-Math.random();
		else
			throw new IllegalArgumentException("Invalid Inputs");
		return temp;
	}

}
