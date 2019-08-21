package com.redhat.poc.bean;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class SumAggregationStrategy implements AggregationStrategy{

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		  if (oldExchange == null) {
	            // the first time we aggregate we only have the new exchange,
	            // so we just return it
	            return newExchange;
	        }

	        Float oldAmt = oldExchange.getIn().getBody(Float.class);
	        Float newAmt = newExchange.getIn().getBody(Float.class);

//	        System.out.println("Aggregate old: "+oldAmt.toString());
//	        System.out.println("Aggregate new: "+newAmt.toString());

	        oldAmt = oldAmt + newAmt;
	        // put combined Number back on old to preserve it
	        oldExchange.getIn().setBody(oldAmt);

	        // return old as this is the one that has all the Number gathered until now
	        return oldExchange;
	    }

}
