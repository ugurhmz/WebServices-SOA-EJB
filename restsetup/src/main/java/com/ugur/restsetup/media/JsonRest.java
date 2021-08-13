package com.ugur.restsetup.media;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/myjson")
public class JsonRest {

	
	@GET
	@Produces("application/json; charset=UTF-8")
	public String getJson() {
		
		return "{"+
				"\"productId\":401,"
				+ "\"productName\" : \"Cep telefonu\","
				+"\"salesPrice\":1500.0"+
				"}";
	}
	
}
