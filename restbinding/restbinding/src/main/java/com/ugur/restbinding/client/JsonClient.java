package com.ugur.restbinding.client;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class JsonClient {

	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();		// (1) Bağlanmaya yarayan, Önce Client Oluştur
		
		WebTarget target = client				// (2) Nereye bağlanacağımız
				.target("http://localhost:8080/restbinding/rest")
				.path("json")
				.path("binding");
		
		 String plain = target				 // (3) Ona Yapılan istek
				 		.request("application/json; charset=UTF-8")
				 		.get(String.class);		// (4)  GET ile istek
		
		System.out.println("Plain : "+plain);
						
		
		
		JsonReader jsonReader = Json.createReader(new StringReader(plain));
		JsonObject jsonObject = jsonReader.readObject();
		
		jsonReader.close();
		
		
		long productId = jsonObject.getJsonNumber("productId").longValue();
		String productName = jsonObject.getString("productName");
		double salesPrice = jsonObject.getJsonNumber("salesPrice").doubleValue();
		System.out.println(productId + " "+ productName+ " "+salesPrice);
	}
}
