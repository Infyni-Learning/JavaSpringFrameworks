package com;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabitMqConfiguration {

	private static final String EXCHANGE_NAME ="My_Exchange";
	private static final String QUEUE_NAME ="My_Queue1";
	
		@Bean
		public Queue createQueue() {
		return new Queue(QUEUE_NAME);
		}
		
		
		@Bean
		public Exchange fanout() {
			return new FanoutExchange(EXCHANGE_NAME, true, false);
		}
	  @Bean
	  public Binding queueBinding() {
	    return new Binding(QUEUE_NAME, Binding.DestinationType.QUEUE, EXCHANGE_NAME, "", null);
	  }
}
