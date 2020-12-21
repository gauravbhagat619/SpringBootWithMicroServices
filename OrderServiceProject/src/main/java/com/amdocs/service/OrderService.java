package com.amdocs.service;


import org.springframework.stereotype.Service;

import com.amdocs.model.Order;


@Service
public class OrderService {
	
	public String createOrder(Order order) {
		
		if(order.getItem().equals("")) {
			return "Item name should not be blank";
		}
		else {
			return order.getItem();
		}
		
	}
	
}
