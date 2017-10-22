package com.udev.ws.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleClientHttp {

	public static void main(String[] args) throws IOException {
		URL endPoint = new URL("http://www.webservicex.net/GlobalWeather.asmx");
		HttpURLConnection conn = (HttpURLConnection)endPoint.openConnection();
		
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		
		conn.setRequestProperty("Content-type", "text/xml; chartset= utf-8");
		conn.setRequestProperty("SOAPAction", 
			"http://www.webserviceX.NET/GetCitiesByCountry");
		
		String reqXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.webserviceX.NET\"> " +
		   "<soapenv:Header/>" +
		   "<soapenv:Body>" +
		      "<web:GetCitiesByCountry>" +
		         "<web:CountryName>Mexico</web:CountryName>" +
		      "</web:GetCitiesByCountry>" +
		   "</soapenv:Body>" +
		"</soapenv:Envelope>";
		
		OutputStream outStream = conn.getOutputStream();
		outStream.write(reqXML.getBytes());
		
		InputStream inStream = conn.getInputStream();
		byte[] byteXML = new byte[10240];
		int size = inStream.read(byteXML);
		
		System.out.println("Size: " + size);
		System.out.println(new String(byteXML));
	}

}
