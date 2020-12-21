package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.model.Order;
import com.amdocs.service.OrderService;

@RestController
public class OrderController {
	private static final String MESSAGE_QUEUE = "orders_queue";
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	ConfigurableApplicationContext context;
	
	@PostMapping("/order")
	public String createOrder(@RequestBody Order order) {
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);  //RestTemplate
		jmsTemplate.convertAndSend(MESSAGE_QUEUE, order);
		return orderService.createOrder(order);
		
	}
}
