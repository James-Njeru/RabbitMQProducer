package com.springbatch.publisher;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbatch.config.MessagingConfig;
import com.springbatch.model.Customer;
import com.springbatch.model.CustomerStatus;
import com.springbatch.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerPublisher {
	@Autowired
	private RabbitTemplate template;
	@Autowired
	private CustomerService service;
	
	
	@GetMapping("/{id}")
	private String getCustomer(@PathVariable("id") int id) {
		//CustomerStatus customerStatus = new CustomerStatus(service.get(id));
		//Customer customer = new Customer(customer.getCustomer_id());
		template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, service.get(id));
		return "Success !!";
	}
	
}
