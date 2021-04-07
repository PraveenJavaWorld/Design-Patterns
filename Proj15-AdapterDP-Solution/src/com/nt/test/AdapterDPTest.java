package com.nt.test;

import com.accuweather.service.AccuWeatherService;
import com.accuweather.service.AccuWeatherServiceImpl;

public class AdapterDPTest {

	public static void main(String[] args) {
		
		AccuWeatherService service = new AccuWeatherServiceImpl();
		try {
			System.out.println(service.showTemperature("HYD"));

		}catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		System.out.println("======================");
		try {
			System.out.println(service.showTemperature("MUMBAI"));

		}catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		System.out.println("======================");
		try {
			System.out.println(service.showTemperature("BANGALORE"));

		}catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		System.out.println("======================");
		try {
			System.out.println(service.showTemperature("CHENNAI"));

		}catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
	}

}
