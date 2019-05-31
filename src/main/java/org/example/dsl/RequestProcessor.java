package org.example.dsl;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class RequestProcessor  implements Processor  {

	@Override
	public void process(Exchange exchange) throws Exception {
		try {
			Message inMessage = exchange.getIn();
			String body = inMessage.getBody(String.class);
			
			System.out.println("Body_____" + body);
			
		
		} catch (Exception e) {
			System.out.println(e);
		}
	
}
}
