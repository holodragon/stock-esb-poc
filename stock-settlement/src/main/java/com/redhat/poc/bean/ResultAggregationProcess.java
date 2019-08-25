package com.redhat.poc.bean;

import java.io.IOException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class ResultAggregationProcess implements Processor {

	public void process(Exchange exchange) throws JsonProcessingException, IOException {

		String oldInBody = exchange.getIn().getBody().toString();
//		String oldOutBody = exchange.getOut().getBody().toString();

		String oldHeader = exchange.getIn().getHeader("TX_OUTPUT").toString();

		System.out.println("Aggregate Result old IN Body: " + oldInBody);
//		System.out.println("Aggregate Result old OUT Body: " + oldOutBody);
		System.out.println("Aggregate Result old Header: " + oldHeader);

		JsonNode arrNode = new ObjectMapper().readTree(oldHeader);
		if (arrNode.isArray()) {
		    for (final JsonNode objNode : arrNode) {
		        System.out.println("HEADER CONTENT: "+objNode);
		    }
		}
		
		ObjectMapper mapper = new ObjectMapper();
	    JsonNode actualObj = mapper.readTree(oldInBody);
	    System.out.println("Aggregate Result jsonNode1: " + actualObj.toString());
	    JsonNode jsonNode1 = actualObj.get("ESB028002").get("Body");
		System.out.println("Aggregate Result jsonNode1: " + jsonNode1.toString());
		
		((ObjectNode)((ObjectNode) actualObj).get("ESB028002")).set("Body",arrNode);
	
		System.out.println("Aggregate Result: " + actualObj.toString());
		
		exchange.getIn().setBody(actualObj.toString());
		}

}
