package com.microservice.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.microservice.gateway.filters.ErrorFilter;
import com.microservice.gateway.filters.PostFilter;
import com.microservice.gateway.filters.PreFilter;
import com.microservice.gateway.filters.RouteFilter;

@Configuration
public class RegisterFilter {

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
}
