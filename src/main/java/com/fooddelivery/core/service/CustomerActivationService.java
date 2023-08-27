package com.fooddelivery.core.service;

import com.fooddelivery.core.model.Customer;

public class CustomerActivationService {

	public void activate(Customer customer) {
		customer.setActive(true);
	}
}
