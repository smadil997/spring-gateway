package com.microservice.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PostFilter extends ZuulFilter {

	  @Override
	  public String filterType() {
	    return "post";
	  }
	 
	  @Override
	  public int filterOrder() {
	    return 1;
	  }
	 
	  @Override
	  public boolean shouldFilter() {
	    return true;
	  }
	 
	  @Override
	  public Object run() {
		  log.info("Inside Post filter");
	    return null;
	  }

}
