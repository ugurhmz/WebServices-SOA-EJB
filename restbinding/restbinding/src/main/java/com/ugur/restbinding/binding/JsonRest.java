package com.ugur.restbinding.binding;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;



@Path("/json")
public class JsonRest {
	
	
	@GET
	@Path("plain/{cat}/{id}")
	@Produces("application/json; charset=UTF-8")
	public String getJson(@PathParam("cat") String category ,@PathParam("id") long productId) {
		return "{"+
				"\"productId\":"+productId+","
				+ "\"Category\" : \""+category+"\","
				+"\"salesPrice\":1500.0"+
				"}";
	}
	
	// JSON create JSON-P 
	@GET
	@Path("processing")
	@Produces("application/json; charset=UTF-8")
	public String getProcessing() {
		
		return Json.createObjectBuilder()
				.add("productId",501L)
				.add("productName","Laptop")
				.add("price",6700.0)
				.build().toString();
		
	}
	
	
	// Object BINDING JSON-B
	@GET
	@Path("binding")
	@Produces("application/json; charset=UTF-8")
	public Product getProduct() {
		Product prd = new Product();
		prd.setProductId(105L);
		prd.setProductName("Shoes");
		prd.setSalesPrice(375.0);
		
		return prd;
	}
	

}















