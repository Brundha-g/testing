package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Company {
	@Value("${companyName}")
	private String companyName;
	@Value("${myName}")
	private String mname;
	@Autowired
	private Manager manager;//dependency
	@Autowired
	@Qualifier("strainer")
	private Trainer trainer;
	
	/* public Company(Manager manager) { this.manager = manager; } */
	 

	void sample() {
		System.out.println("this is sample");
		System.out.println("the company name is: "+companyName);
		System.out.println("the  name is: "+mname);

		manager.manage();
		trainer.train();
		manager.id();
	}
}
