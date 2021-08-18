package com.ugur.restbinding.client;

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
						
	}
}
