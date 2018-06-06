package com.jiang;

import org.springframework.context.annotation.Configuration;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;  
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
  
@Configuration  
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {  
	
	
    @Override  
    protected void configure(HttpSecurity http) throws Exception {  
    	http.csrf().disable()  
        .authorizeRequests()
        .antMatchers("/encrypt").permitAll()		//访问：/encrypt 无需认证 
        .antMatchers("/decrypt").authenticated(); 	//访问：/decrypt 需要认证
    }  
}  