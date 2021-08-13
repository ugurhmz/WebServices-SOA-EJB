package com.ugur.restsetup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/test")
public class RestTest {

	
	@GET
	public String getResult() {
		return "Hello ";
	}
}
