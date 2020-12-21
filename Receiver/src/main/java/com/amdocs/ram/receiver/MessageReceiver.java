package com.amdocs.ram.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.amdocs.ram.model.Product;

@Component
public class MessageReceiver {
private static final String MESSAGE_QUEUE = "products_queue";
	
	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(Product product)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received " + product);
	}
	
	@JmsListener(destination = "queue2")
	public void receiveMessageFromQueue2(Product product)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received " + product);
	}
}
