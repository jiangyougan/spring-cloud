package com.jiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @EnableDiscoveryClient 和 @EnableEurekaClient的区别
 * 如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients  
public class ConsumerServer {
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerServer.class, args);
	}
}
