package com.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setId(1);
        obj.setName("abc");
        obj.setBranch("cse");
        Configuration con=new Configuration();
		SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        session.save(obj);
	}
}
