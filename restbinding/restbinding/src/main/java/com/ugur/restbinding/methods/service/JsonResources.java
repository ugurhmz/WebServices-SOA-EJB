package com.ugur.restbinding.methods.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;



@Path("/method")
public class JsonResources {

	@POST
	@Path("plain")
	@Consumes("application/json; charset=UTF-8")
	public void postPlain(String plain) {
		System.out.println("Plain : "+plain);
	}
	
	
}
