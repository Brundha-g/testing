package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainapp {
public static void main(String args[]) {
	AnnotationConfigApplicationContext c= new AnnotationConfigApplicationContext(Config.class);
	Company bean=c.getBean("company",Company.class);
	bean.sample();
}
}
