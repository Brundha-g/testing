package com.mycompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value="com.mycompany")
@PropertySource("classpath:info.properties")
public class BeanConfig {
	@Bean
	public College collegebean() {
		//return new College(depbean(),new Student1());
		College ob=new College();
		ob.setDepartment(depbean());
		ob.setStudent(new Student1());
		return ob;
			}
	@Bean
    public Department depbean() {
    	return new Department();    }
}
