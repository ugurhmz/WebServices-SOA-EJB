package com.ugur.restsetup.subresource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/parent")
public class ParentRest {

	
	
	@GET
	@Path("plain")
	@Produces("text/plain; charset=UTF-8")
	public String getParent() {
		
		return "Hello text plain..";
	}
	
	
	@GET
	@Path("xml")
	@Produces("application/xml; charset=UTF-8")
	public String getXml() {
		return "<product id=\"101\">"
				+ "<productname>Ceptelefonu</productname>"
				+"<salesPrice>3500</salesPrice>"
				+ "</product>";
	}
	
	@GET
	@Path("json")
	@Produces("application/json; charset=UTF-8")
	public String getJson() {
		
		return "{"+
				"\"productId\":401,"
				+ "\"productName\" : \"Cep telefonu\","
				+"\"salesPrice\":1500.0"+
				"}";
	}
	
	
	
	
	
	
}












