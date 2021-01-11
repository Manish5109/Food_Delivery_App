package com.xebia.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.model.Order;

/**
 * This controller will help to print user order into the kitchen where kitchen
 * member can take the kitchen order and prepare the food, and finally hand over
 * to delivery counter
 * 
 * @author m.bm.kumar
 *
 */
@RestController
public class KitchenController {

	/**
	 * This will print the User order into the Kitchen to prepare the food, This end
	 * point is secured and only will be called by delivery agent
	 * 
	 * @param order
	 * @return
	 */
	@PostMapping("/placeKitchenOrder")
	public boolean placeKitchenOrder(Order order) {
		// This will call kitchen service to print the oder into the kitchen
		return false;
	}
	
	
}
