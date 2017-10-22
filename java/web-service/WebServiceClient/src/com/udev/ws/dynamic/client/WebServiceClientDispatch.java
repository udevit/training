package com.udev.ws.dynamic.client;

import java.io.IOException;

public class WebServiceClientDispatch implements Callable{

	@Override
	public Result call(String endPoint, Source source) throws IOException {
		// TODO Mi implementación usando dispatch
		return new Result(200, "test");
	}

}
