package com.xebia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.model.Item;
import com.xebia.model.Order;

/**
 * This controller will help to take a customer order and update the oder status
 * by delivery agent
 * 
 * @author m.bm.kumar
 *
 */
@RestController
public class OrderController {

	/**
	 * This service will take list of item from customer and will generate the order
	 * 
	 * @param item
	 * @return
	 */
	@PostMapping("/placeOrder")
	public Order placeOrder(List<Item> item) {
		// generate the order and save into the DB
		// call kitchen service to print the order into kitchen
		return new Order();
	}

	/**
	 * delivery agent/kitchen lead can update the kitchen order status once item is
	 * ready to pick up by delivery boy. Delivery agent can update the order status
	 * once order is ready to deliver. Delivery boy can update the delivery status
	 * upon item is delivered
	 * 
	 * @param ordrId
	 * @param status It should be enum in actual implementation
	 * @return
	 */
	@PostMapping("/updateOrderStatus")
	public boolean updateOrderStatus(String ordrId, String status) {
		// find the order by order id and update the order status - ready to deliver,
		// delay by x minutes etc.
		return false;
	}
}
