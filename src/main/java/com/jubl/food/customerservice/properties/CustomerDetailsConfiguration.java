package com.jubl.food.customerservice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "customer")
@Data
public class CustomerDetailsConfiguration {

	private String firstname;
	private String username;
	private String email;
	private String lastname;
	private String name;
	private String hight;

}
