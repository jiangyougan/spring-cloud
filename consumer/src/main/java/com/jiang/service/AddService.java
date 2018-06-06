package com.jiang.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="provider-server") 
public interface AddService {

	@RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    public Integer add(@PathVariable("a") Integer a, @PathVariable("b") Integer b);  
}
