package com.ugur.restbinding.methods.client;


import javax.json.Json;
import javax.ws.rs.client.Client;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class JsonPOST {

	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client
					.target("http://localhost:8080/restbinding/rest")
					.path("method")
					.path("plain");
		
		String plain="{\n"+
				"\"productId\":401,\n"
				+ "\"productName\" :\"telefon\",\n"
				+"\"salesPrice\":1500.0\n"+
				"}";
		
			target
				.request("application/json; charset=UTF-8")
				.post(Entity.entity(plain,"application/json; charset=UTF-8"), Void.class);
			
			
		//JSON-P ile JSON ÜRETME
		String json = Json.createObjectBuilder()
				.add("productId",401L)
				.add("productName","Iphone 12")
				.add("salesPrice",7500.0)
				.build().toString();
		
			
		target
			.request("application/json; charset=UTF-8")
			.post(Entity.entity(json,"application/json; charset=UTF-8"), Void.class);
			
		
		
	}
}
