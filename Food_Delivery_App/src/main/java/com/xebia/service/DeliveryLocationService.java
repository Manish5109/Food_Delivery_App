package com.xebia.service;

import org.springframework.stereotype.Service;

/**
 * @author m.bm.kumar
 *
 */
@Service
public interface DeliveryLocationService {

	// This service will help to check to delivery location by zip code
	public boolean checkDeliveryLocation(String zipCode);
}
