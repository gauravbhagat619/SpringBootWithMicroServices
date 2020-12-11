package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
	final static Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	OrderService orderservice;
	
	@GetMapping("/order")
	public Order getOrder(String order) {
		logger.debug("Getting Order");
		return orderservice.getOrder();
	}
	
	@GetMapping("/getAllOrders")
	public List<Order> getAllOrders(String order) {
		logger.debug("Getting All Order");
		return orderservice.getAllOrders();
	}
	
	@PostMapping("/addOrder")
	public String addOrder() {
		return "New Order Added";
	}
}
