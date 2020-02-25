package com.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringGatewayApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayApplication.class, args);
		
	}
//	
//	@Bean
//    public PreFilter preFilter() {
//        return new PreFilter();
//    }
//    @Bean
//    public PostFilter postFilter() {
//        return new PostFilter();
//    }
//    @Bean
//    public ErrorFilter errorFilter() {
//        return new ErrorFilter();
//    }
//    @Bean
//    public RouteFilter routeFilter() {
//        return new RouteFilter();
//    }

}
