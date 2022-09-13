package com.mycompany;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Jtrainer implements Trainer {

	public void train() {
		// TODO Auto-generated method stub
      System.out.println("this is jtrainer");
	}

}
