package com.ugur.restsetup.subresource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/parametric")
public class ParametricRest {

	
	
	
	@GET
	@Path("{category}/{id}")
	@Produces("application/json; charset=UTF-8")
	public String getProduct(@PathParam("category") String category ,@PathParam("id") long productId) {
		
		return "{"+
				"\"productId\":"+productId+","
				+ "\"Category\" : \""+category+"\","
				+"\"salesPrice\":1500.0"+
				"}";
	}
	
}
