package com.ugur.restsetup.media;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/plain")
public class PlainRest {

	
	@GET
	//@Produces(MediaType.TEXT_PLAIN)
	@Produces("text/plain; charset=UTF-8")
	public String getPlain() {
		
		return "401;\"Phoneçğ\";1300.0";
	}
	
}
