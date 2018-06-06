/**
 * 
 */
package com.jiang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiangyougan
 * 
 */
@RestController
public class AddContorller {

	protected static Logger logger = LoggerFactory.getLogger(AddContorller.class);
	
//	@Autowired
//    private Tracer tracer;

	@RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
	public Integer helloService(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
//		tracer.addTag("收到请求参数", "a="+a+",b="+b);
		if(a==1){
			throw new RuntimeException("自定义异常");
		}
//		tracer.addTag("接口返回", "a+b="+(a+b));
		return a + b;
	}
	
}