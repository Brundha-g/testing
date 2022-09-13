package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext a=new AnnotationConfigApplicationContext(BeanConfig.class);
     College b=a.getBean("collegebean",College.class);
     b.test();
	}

}
