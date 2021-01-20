package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con  = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();

		Manager mgr1 = new Manager();
		mgr1.setId(100);
		mgr1.setName("Ravi Kumar");
		mgr1.setSalary(45000);
		mgr1.setNumberOfEmp(10);
		
		Programmer prg1 = new Programmer();
		prg1.setId(101);
		prg1.setName("Seeta");
		prg1.setSalary(24000);
		prg1.setProjectName("Java");
		
		session.save(mgr1);
		session.save(prg1);
		
		tran.commit();
		System.out.println("Record stored successfully....");
	}

}
