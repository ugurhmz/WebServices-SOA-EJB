package com.ugur.restbinding.methods.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

import com.ugur.restbinding.binding.Product;




public class BeanPOST {
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client
							.target("http://localhost:8080/restbinding/rest")
							.path("method")
							.path("binding");
		
		
		//JSON-B ile Doğrudan Nesne kullanımı ( Binding)
		
		Product product = new Product();		
		product.setProductId(605L);
		product.setProductName("ASUS PC");
		product.setSalesPrice(10500.0);
		
		
		target
			.request("application/json; charset=UTF-8")
			.post(Entity.entity(product,"application/json; charset=UTF-8"),Void.class);	
	}
}










