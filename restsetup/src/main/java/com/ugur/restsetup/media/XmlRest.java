package com.ugur.restsetup.media;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;




@Path("/xml")
public class XmlRest {

	
	@GET
	@Produces("application/xml; charset=UTF-8")
	public String getXml() {
		
		return "<product id=\"101\">"
				+ "<productname>Ceptelefonu</productname>"
				+"<salesPrice>3500</salesPrice>"
				+ "</product>";
	}
	
	
}
