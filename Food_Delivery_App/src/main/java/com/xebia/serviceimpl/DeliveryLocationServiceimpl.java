package com.xebia.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xebia.service.DeliveryLocationService;
import com.xebia.staticContent.FoodDeliveryContent;

@Service
public class DeliveryLocationServiceimpl implements DeliveryLocationService {

	/**
	 * checking Delivery location by zip Code
	 */
	@Override
	public boolean checkDeliveryLocation(String zipCode) {
		// assuming FoodDeliveryContent.zipList will be populated from DB in actual
		// implementation.
		List<String> zipList = FoodDeliveryContent.zipList;
		return zipList.contains(zipCode);
	}

}
