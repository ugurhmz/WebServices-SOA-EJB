package com.ugur.restbinding.methods.service;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.ugur.restbinding.binding.Product;



@Path("/method")
public class JsonResources {

	
	
	// JSON İLE ÇALIŞMA
	@POST
	@Path("plain")
	@Consumes("application/json; charset=UTF-8")
	public void postPlain(String plain) {
		System.out.println("Plain : "+plain);
		
		
		// String to -> Json
		JsonReader jsonReader = Json.createReader(new StringReader(plain));
		JsonObject jsonObject = jsonReader.readObject();
		
		jsonReader.close();
		
		
		long productId = jsonObject.getJsonNumber("productId").longValue();
		String productName = jsonObject.getString("productName");
		double salesPrice = jsonObject.getJsonNumber("salesPrice").doubleValue();
		System.out.println(productId + " "+ productName+ " "+salesPrice);
		
	}
	
	
	// OBJE İLE ÇALIŞMA
	@POST
	@Path("binding")
	@Consumes("application/json; charset=UTF-8")
	public void setBinding(Product product) {
		System.out.println("Prd : "+product.getProductId()+ " "
				+product.getProductName()+" "
				+product.getSalesPrice());
	}
	
	
}










