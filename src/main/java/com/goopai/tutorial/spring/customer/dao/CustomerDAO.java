package com.goopai.tutorial.spring.customer.dao;

import com.goopai.tutorial.spring.model.Customer;

public interface CustomerDAO {

	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
