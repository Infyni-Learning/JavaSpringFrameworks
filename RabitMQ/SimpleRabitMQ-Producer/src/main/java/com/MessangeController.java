package com;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessangeController {

	private final AmqpTemplate amqpTemplate;
	  @Autowired
	  public MessangeController(AmqpTemplate amqpTemplate) {
	    this.amqpTemplate = amqpTemplate;
	  }
	  
	  private static final String EXCHANGE_NAME ="My_Exchange";
	  
	  @GetMapping("/sendMessage/{msg}")
	  public String sendMessage(@PathVariable("msg") String msg) {
		amqpTemplate.convertAndSend(EXCHANGE_NAME, "", msg);
	    return "Message Sent";
	  }
}
