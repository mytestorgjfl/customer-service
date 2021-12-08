package com.jubl.food.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jubl.food.customerservice.dto.CustomerDetails;
import com.jubl.food.customerservice.mapper.CustomerDetailsMapper;
import com.jubl.food.customerservice.properties.CustomerDetailsConfiguration;

@RestController
@RequestMapping("/customer")
@RefreshScope
public class CustomerController {

	@Autowired
	private CustomerDetailsConfiguration customerDetails;

	@Autowired
	private CustomerDetailsMapper mapper;
	
	@GetMapping("/details")
	public CustomerDetails getdetails() {
		return mapper.convert(customerDetails);
	}
	
}
