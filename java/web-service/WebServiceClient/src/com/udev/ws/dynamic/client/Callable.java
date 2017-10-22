package com.udev.ws.dynamic.client;

import java.io.IOException;

public interface Callable {
	Result call(String endPoint, Source source) throws IOException;
}