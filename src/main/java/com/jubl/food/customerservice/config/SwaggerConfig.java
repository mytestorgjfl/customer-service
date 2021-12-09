package com.jubl.food.customerservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger Configuration.
 *
 * @author amit.kumar1
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Value("${app.version:unknown}")
	private String version;

	/**
	 * Defining Swagger2 configuration.
	 *
	 * @return Docket
	 */
	@Bean
	public Docket api() {
		System.out.println("version: " + version);
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder().title("Customer Service").version(version);
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfoBuilder.build())
				.select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.ant("/**")).build();
	}

}
