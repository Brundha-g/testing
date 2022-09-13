package com.mycompany;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	@Value("${id}")
	int id;

	public void manage() {
		System.out.println("this is manager");
	}
	public void id() {
		System.out.println("id="+id);
	}
}
