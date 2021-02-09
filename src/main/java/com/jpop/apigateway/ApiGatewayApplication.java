package com.jpop.apigateway;

import com.jpop.apigateway.filter.ErrorFilter;
import com.jpop.apigateway.filter.PostFilter;
import com.jpop.apigateway.filter.PreFilter;
import com.jpop.apigateway.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayApplication {

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
