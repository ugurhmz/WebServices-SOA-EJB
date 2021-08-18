package com.ugur.restbinding.binding;

import java.io.StringWriter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

@Path("/xml")
public class XmlRest {

	
	
	@GET
	@Path("processing")
	@Produces("application/xml; charset=UTF-8")
	public String getProcessinXml() {
		
		try {
			
			Document document = createDocument();
			
			//product
			Element product = document.createElement("product");
			document.appendChild(product);
			product.setAttribute("productId",Long.toString(155L));
			
			// productName
			Element productName = document.createElement("productName");
			productName.setTextContent("Cep Telefonu");
			product.appendChild(productName);
			
			//salesPrice
			Element salesPrice = document.createElement("salesPrice");
			salesPrice.setTextContent(Double.toString(1500.0));
			product.appendChild(salesPrice);
			
			
			//transformer
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer  = transformerFactory.newTransformer();
			StringWriter writer = new StringWriter();
			transformer.transform(new DOMSource(document), new StreamResult(writer));
			return writer.toString();
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return "";
		}
	}

	//Xml Binding
	@GET
	@Path("binding")
	@Produces("application/xml; charset=UTF-8")
	public Product getXmlBinding() {
		Product prd = new Product();
		prd.setProductId(401L);
		prd.setProductName("Phones");
		prd.setSalesPrice(12500.0);
		
		return prd;		
	}
	
	
	
	
	
	
	// DocumentBuilderFactory
	private Document createDocument() throws ParserConfigurationException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder =builderFactory.newDocumentBuilder();
		Document document = builder.newDocument();
		
		return document;
	}
	
	
}
