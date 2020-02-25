package com.microservice.gateway.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PreFilter extends ZuulFilter {

	  @Override
	  public String filterType() {
	    return "pre";
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
	    RequestContext ctx = RequestContext.getCurrentContext();
	    HttpServletRequest request = ctx.getRequest();
	    log.info("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
	    return null;
	  }

}
