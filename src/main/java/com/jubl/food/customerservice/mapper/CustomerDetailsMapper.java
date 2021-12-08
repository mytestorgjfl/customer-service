package com.jubl.food.customerservice.mapper;

import java.util.Date;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jubl.food.customerservice.dto.CustomerDetails;
import com.jubl.food.customerservice.properties.CustomerDetailsConfiguration;

@Mapper
public interface CustomerDetailsMapper {

	@Mapping(source = "hight", target = "length")
	@Mapping(target = "age", expression = "java(getAge())")
	CustomerDetails convert(final CustomerDetailsConfiguration customerDetails);
	
	List<CustomerDetails> convert(final List<CustomerDetailsConfiguration> customerDetails);
	
	default Date getAge() {
		return new Date();
	}
}
