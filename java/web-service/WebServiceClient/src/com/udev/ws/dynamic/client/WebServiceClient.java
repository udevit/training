package com.udev.ws.dynamic.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebServiceClient implements Callable{

	@Override
	public Result call(String endPoint, Source source) throws IOException{
		URL url = new URL(endPoint);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		
		conn.setRequestProperty("Content-type", "text/xml; chartset= utf-8");
		conn.setRequestProperty("SOAPAction", source.getSoapAction());
		
		OutputStream outStream = conn.getOutputStream();
		outStream.write(source.getReqXML().getBytes());
		
		InputStream inStream = conn.getInputStream();
		byte[] byteXML = new byte[10240];
		inStream.read(byteXML);
		
		return new Result(200, new String(byteXML));
	}

}
