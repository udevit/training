package com.udev.ws.client;

import java.io.ByteArrayInputStream;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.Service.Mode;
import javax.xml.ws.http.HTTPBinding;

public class DispatchClient {

	public static void main(String[] args) throws TransformerException {
		Mode mode = Mode.MESSAGE;
		
		final String END_POINT = "http://www.webservicex.net/GlobalWeather.asmx";
		final String NAME_SPACE = "http://www.webserviceX.NET";
		final QName SERVICE_QNAME = new QName(NAME_SPACE, "GlobalWeather");
		final QName PORT_QNAME = new QName(NAME_SPACE, "GlobalWeatherSoap");
		
		Service svc = Service.create(SERVICE_QNAME);
		svc.addPort(PORT_QNAME, HTTPBinding.HTTP_BINDING, END_POINT);
		
		Dispatch<Source> dispatch = svc.createDispatch(PORT_QNAME, Source.class, mode);
		
		String reqXML = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.webserviceX.NET\"> " +
				   "<soapenv:Header/>" +
				   "<soapenv:Body>" +
				      "<web:GetCitiesByCountry>" +
				         "<web:CountryName>Mexico</web:CountryName>" +
				      "</web:GetCitiesByCountry>" +
				   "</soapenv:Body>" +
				"</soapenv:Envelope>";
		
		ByteArrayInputStream arrayXML = new ByteArrayInputStream(reqXML.getBytes());
		Source source = dispatch.invoke(new StreamSource(arrayXML));
		
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		StreamResult result = new StreamResult(System.out);
		transformer.transform(source, result);
	}

}
