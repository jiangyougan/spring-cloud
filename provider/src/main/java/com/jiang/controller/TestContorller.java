/**
 * 
 */
package com.jiang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiangyougan
 * 
 */
@RestController
public class TestContorller {

	protected static Logger logger = LoggerFactory.getLogger(TestContorller.class);
	
	@Value("${test}")
	private String info;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String info() {
		return "info="+info;
	}
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String info2() {
		return "username="+username+",password="+password;
	}

}