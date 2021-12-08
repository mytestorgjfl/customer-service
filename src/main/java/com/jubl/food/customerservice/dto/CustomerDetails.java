package com.jubl.food.customerservice.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails {

	private String firstname;
	private String username;
	private String email;
	private String lastname;
	private String name;
	private String length;
	private Date age;
}
