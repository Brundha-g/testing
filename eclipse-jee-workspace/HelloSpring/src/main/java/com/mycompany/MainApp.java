package com.mycompany;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ct=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		HelloBean bean=ct.getBean(HelloBean.class);
		bean.dispaly();
	}
}
