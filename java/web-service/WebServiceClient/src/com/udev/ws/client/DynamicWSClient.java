package com.udev.ws.client;

import java.io.IOException;

import com.udev.ws.dynamic.client.Callable;
import com.udev.ws.dynamic.client.Result;
import com.udev.ws.dynamic.client.Source;
import com.udev.ws.dynamic.client.WebServiceClient;

public class DynamicWSClient {

	public static void main(String[] args) throws IOException {
		
		Callable svc = new WebServiceClient();
		String reqXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\"> " + 
		   "<soapenv:Header/>" +
		   "<soapenv:Body>" +
		      "<tem:Add>" +
		         "<tem:intA>2</tem:intA>" +
		         "<tem:intB>8</tem:intB>" +
		      "</tem:Add>" +
		   "</soapenv:Body>" +
		"</soapenv:Envelope>";
		
		Source source = new Source("http://tempuri.org/Add",
			reqXML);
		Result result = svc.call("http://www.dneonline.com/calculator.asmx", source);
		
		System.out.println(result.getRespXML());
	}

}
