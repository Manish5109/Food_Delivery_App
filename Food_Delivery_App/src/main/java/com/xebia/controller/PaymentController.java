package com.xebia.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.model.PaymentDetails;

/**
 * This will help to manage the customer payment
 * @author m.bm.kumar
 *
 */
@RestController
public class PaymentController {

	/**
	 * this will help to take payment from customer through payment gateway. 
	 * @param paymentDetails
	 * @return
	 */
	@PostMapping("/payment")
	public Boolean payment(PaymentDetails paymentDetails) {
		// this service will intact the payment gateway to take the money from customer 
		// will also update the order status once payment is accepted or rejected
		return false;
	}
}
