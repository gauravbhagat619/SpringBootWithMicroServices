package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.model.Order;


@Service
public class OrderService {
	final static Logger logger = LoggerFactory.getLogger(OrderService.class);
	List<Order> allorders = new ArrayList<Order>();
	
	public Order getOrder() {
		Order order = new Order();
		Address address1 = new Address();
		Address address2 = new Address();
		
		address1.setStreetnName("Walkers Street");
		address2.setStreetNo(101);
		
		address2.setStreetnName("Joggers Street");
		address2.setStreetNo(201);
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);
		
		order.setId(1);
		order.setItem("Guitar");
		order.setPrice(8000.0F);
		order.setAddresses(addresses);
		
		allorders.add(order);
		
		return order;
	}
	public List<Order> getAllOrders() {
		return allorders;
		
	}
}
