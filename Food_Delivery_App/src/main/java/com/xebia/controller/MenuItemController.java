package com.xebia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.model.MenuItem;

/**
 * This will list down the available item to customer, Menu item's availability
 * will be updated by delivery agent or kitchen lead
 * 
 * @author m.bm.kumar
 *
 */
@RestController
public class MenuItemController {

	/**
	 * This will return the available menu items
	 * 
	 * @return
	 */
	@GetMapping("/menuItem")
	public List<MenuItem> getMenuItem() {

		// this service will fetch the available item list from DB which will be
		// periodically updated by delivery agent and kitchen agent through different
		// service
		return null;
	}
}
