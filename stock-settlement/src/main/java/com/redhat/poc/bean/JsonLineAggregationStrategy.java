package com.redhat.poc.bean;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class JsonLineAggregationStrategy implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		if (oldExchange == null) {
			// the first time we aggregate we only have the new exchange,
			// so we just return it
			return newExchange;
		}

		String oldBody = oldExchange.getIn().getBody(String.class);
		String newBody = newExchange.getIn().getBody(String.class);
		
		String aggregate = oldBody + System.lineSeparator() + "," + newBody;
		oldExchange.getIn().setBody(aggregate);
		
		return oldExchange;
	}

}
