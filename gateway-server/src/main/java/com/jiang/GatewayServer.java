package com.jiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GatewayServer {
	public static void main(String[] args) {
		SpringApplication.run(GatewayServer.class, args);
	}
	
	
	//TODO 实现动态路由
}
