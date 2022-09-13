package com.mycompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.mycompany")
public class BeanConfiguration {
@Bean
public HelloBean getHelloBean() {
	//HelloBean b=new HelloBean();
	return new HelloBean();	
}

}
