package com.asif;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:8086/Session16REST/rest/hello

@Path("/hello")
public class HelloRest {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {

		return "Hello From REST WEB SERVICES!!!";

	}

	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_HTML) public String sayHTMLHello() {
	 * 
	 * return "<html><h1>+Hello From sayHTMLHello SERVICES!!!" + "</h1></html>";
	 * 
	 * }
	 * 
	 * @GET
	 * 
	 * @Produces(MediaType.APPLICATION_XML) public String sayXMLHello() {
	 * 
	 * return "Hello From sayXMLHello SERVICES!!!";
	 * 
	 * }
	 */
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello() {

		return "{name:'John', age:30, city:'New York'}";

	}

}
