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

		String oldHeader = exchange.getIn().getHeader("TX_OUTPUT").toString();

		JsonNode arrNode = new ObjectMapper().readTree(oldHeader);
//		if (arrNode.isArray()) {
//			for (final JsonNode objNode : arrNode) {
//				System.out.println("HEADER CONTENT: " + objNode);
//			}
//		}

		ObjectMapper mapper = new ObjectMapper();
		JsonNode actualObj = mapper.readTree(oldInBody);

		((ObjectNode) ((ObjectNode) actualObj).get("ESB028002")).set("Body", arrNode);

		exchange.getIn().setBody(actualObj.toString());
	}

}
