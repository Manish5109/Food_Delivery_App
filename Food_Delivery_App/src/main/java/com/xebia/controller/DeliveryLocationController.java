package com.xebia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.service.DeliveryLocationService;

/**
 * This controller has end point to facilitate customer to identify whether food
 * is deliverable at their location or not.
 * 
 * @author m.bm.kumar
 *
 */
@RestController
public class DeliveryLocationController {

	@Autowired
	DeliveryLocationService deliveryLocationService;

	/**
	 * validate zipcode with master zipCode list available in DB to identify whether
	 * food can be deliver at given location or not. This service can be enhanced to
	 * take address as well in future if needed.
	 * 
	 * @param zipCode
	 * @return
	 */
	@GetMapping("/checkDeliveeyLocation")
	public Boolean checkDeliveeyLocation(@RequestBody String zipCode) {
		return deliveryLocationService.checkDeliveryLocation(zipCode);
	}
}
