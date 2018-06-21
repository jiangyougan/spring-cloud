///**
// * 
// */
//package com.jiang.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.sleuth.Tracer;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.jiang.service.AddService;
//
//
///**
// * @author Jiangyougan
// * 
// */
//@RestController
//public class AddContorller {
//
//	protected static Logger logger = LoggerFactory.getLogger(AddContorller.class);
//	
//	@Autowired  
//    private AddService addService;  
//	@Autowired
//    private Tracer tracer;
//
//	@RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
//	public Integer helloService(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
//		tracer.addTag("收到请求参数", "a="+a+",b="+b);
//		Integer c = addService.add(a, b);
//		tracer.addTag("接口返回", "a+b="+c);
//		return c;
//	}
//	
//	@RequestMapping(value = "/add", method = RequestMethod.GET)
//	public Integer add(Integer a, Integer b) {
//		logger.info("收到请求参数:a="+a+",b="+b);
//		tracer.addTag("收到请求参数", "a="+a+",b="+b);
//		Integer c = a+b;
//		tracer.addTag("接口返回", "a+b="+c);
//		return c;
//	}
//
//}