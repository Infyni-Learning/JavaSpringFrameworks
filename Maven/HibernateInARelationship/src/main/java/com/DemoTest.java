package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		Student s1 = new Student();
		s1.setSid(104);
		s1.setSname("Meeta");
		s1.setAge(25);
		s1.setTsid(3);
		
		Student s2 = new Student();
		s2.setSid(105);
		s2.setSname("Keeta");
		s2.setAge(22);
		s2.setTsid(3);
		
		List<Student> listOfStd = new ArrayList<Student>();
		listOfStd.add(s1);
		listOfStd.add(s2);
		
		Trainer t1 = new Trainer();
		t1.setTid(3);
		t1.setTname("Ramesh");
		t1.setTech("Angular");
		t1.setNumberOfStd(listOfStd);
		
		session.save(t1);
		//session.save(s1);
		//session.save(s2);
		
		tran.commit();
		System.out.println("Record stored successfully..");
	}

}
