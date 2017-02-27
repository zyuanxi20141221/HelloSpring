package com.goopai.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.goopai.tutorial.spring.customer.dao.CustomerDAO;
import com.goopai.tutorial.spring.model.Customer;

public class CustomerProgram {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Model.xml");
		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
		customerDAO.insert(new Customer("johnzheng2", 31));
		
		Customer customer = customerDAO.findByCustomerId(1);
		System.out.println(customer);
	}
}
