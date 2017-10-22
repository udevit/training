package com.udev.ws.client;

import com.udev.wsimport.client.GlobalWeather;
import com.udev.wsimport.client.GlobalWeatherSoap;

public class WSImportClient {

	public static void main(String[] args) {
		GlobalWeather weather = new GlobalWeather();
		GlobalWeatherSoap port = weather.getGlobalWeatherSoap();
		System.out.println(port.getCitiesByCountry("Mexico"));
	}
	
}
